plugins {
    `java-library`
    antlr
    `maven-publish`
}

group = "com.github.eightm"
version = "0.2.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
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
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
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
            }
        }
    }
}