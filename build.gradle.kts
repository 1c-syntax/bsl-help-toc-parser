import org.jreleaser.model.Active.*

plugins {
    `java-library`
    antlr
    `maven-publish`
    id("me.qoomon.git-versioning") version "6.4.4"
    id("io.freefair.javadoc-links") version "9.2.0"
    id("io.freefair.javadoc-utf-8") version "9.2.0"
    id("io.freefair.maven-central.validate-poms") version "9.2.0"
    id("ru.vyarus.pom") version "3.0.0"
    id("org.jreleaser") version "1.24.0"
}

group = "io.github.1c-syntax"
gitVersioning.apply {
    refs {
        describeTagFirstParent = false
        tag("v(?<tagVersion>[0-9].*)") {
            version = "\${ref.tagVersion}\${dirty}"
        }

        branch("master") {
            version = "\${describe.tag.version.major}." +
                    "\${describe.tag.version.minor.next}.0." +
                    "\${describe.distance}-SNAPSHOT\${dirty}"
        }

        branch(".+") {
            version = "\${ref.slug}-\${commit.short}\${dirty}"
        }
    }

    rev {
        version = "\${commit.short}\${dirty}"
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    // Используем 1c-syntax fork ANTLR — у него свой ATN UUID; bsl-parser в
    // bsl-language-server использует именно его, поэтому генерируемые из
    // нашей грамматики .class должны быть совместимы с тем же runtime.
    antlr("io.github.1c-syntax:antlr4:0.3.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.generateGrammarSource {
    arguments = listOf(
        "-package",
        "com.github.eightm.parser",
        "-encoding",
        "utf8"
    )
    outputDirectory = file("src/main/gen/com/github/eightm/parser")
}

tasks.named<org.gradle.jvm.tasks.Jar>("sourcesJar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    dependsOn(tasks.generateGrammarSource)
}

tasks.javadoc {
    options {
        this as StandardJavadocDocletOptions
        links("https://javadoc.io/doc/org.antlr/antlr4-runtime/latest")
    }
    isFailOnError = false
}

tasks.withType<PublishToMavenRepository>().configureEach {
    dependsOn(tasks.validatePomFiles)
}

sourceSets {
    main {
        java.srcDirs("src/main/java", "src/main/gen")
        resources.srcDirs("src/main/resources")
    }
    test {
        java.srcDirs("src/test/java")
        resources.srcDirs("src/test/resources")
    }
}

publishing {
    repositories {
        maven {
            name = "staging"
            url = layout.buildDirectory.dir("staging-deploy").get().asFile.toURI()
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("BSL Help TOC Parser")
                description.set("Parser for table of content 1C: Enterprise syntax helper in ANTLR4 format.")
                url.set("https://github.com/1c-syntax/bsl-help-toc-parser")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("eightm")
                        name.set("Viktor Gukov")
                        email.set("zchokobo@gmail.com")
                        url.set("https://github.com/eightm")
                        organization.set("1c-syntax")
                        organizationUrl.set("https://github.com/1c-syntax")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/1c-syntax/bsl-help-toc-parser.git")
                    developerConnection.set("scm:git:git@github.com:1c-syntax/bsl-help-toc-parser.git")
                    url.set("https://github.com/1c-syntax/bsl-help-toc-parser")
                }
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/1c-syntax/bsl-help-toc-parser/issues")
                }
                ciManagement {
                    system.set("GitHub Actions")
                    url.set("https://github.com/1c-syntax/bsl-help-toc-parser/actions")
                }
            }
        }
    }
}

jreleaser {
    signing {
        active = ALWAYS
        armored = true
    }
    deploy {
        maven {
            mavenCentral {
                create("release-deploy") {
                    active = RELEASE
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")
                }
            }
            nexus2 {
                create("snapshot-deploy") {
                    active = SNAPSHOT
                    snapshotUrl = "https://central.sonatype.com/repository/maven-snapshots/"
                    applyMavenCentralRules = true
                    snapshotSupported = true
                    closeRepository = true
                    releaseRepository = true
                    stagingRepository("build/staging-deploy")
                }
            }
        }
    }
}
