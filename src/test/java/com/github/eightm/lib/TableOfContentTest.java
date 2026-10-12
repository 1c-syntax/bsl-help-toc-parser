package com.github.eightm.lib;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TableOfContentTest {

  // Синтетическое оглавление в формате справки: одна страница верхнего уровня.
  private static final String TOC = "{1,\r\n"
    + "{1,0,0,{0,0,{1,0,{\"ru\",\"Глобальный контекст\"},{\"en\",\"Global context\"}},\"Global context.html\"}}}";

  @TempDir
  Path tempDir;

  @Test
  void byteOrderMarkAtStartIsSkipped() throws IOException {
    var file = tempDir.resolve("toc");
    Files.writeString(file, "﻿" + TOC, StandardCharsets.UTF_8);

    var stderr = new ByteArrayOutputStream();
    var toc = readCapturingStderr(file, stderr);

    assertEquals("", stderr.toString(StandardCharsets.UTF_8));
    assertSinglePage(toc);
  }

  @Test
  void fileWithoutByteOrderMarkIsReadFromFirstByte() throws IOException {
    var file = tempDir.resolve("toc");
    Files.writeString(file, TOC, StandardCharsets.UTF_8);

    var stderr = new ByteArrayOutputStream();
    var toc = readCapturingStderr(file, stderr);

    assertEquals("", stderr.toString(StandardCharsets.UTF_8));
    assertSinglePage(toc);
  }

  // Ошибки разбора ANTLR печатает в System.err.
  private static TableOfContent readCapturingStderr(Path file, ByteArrayOutputStream stderr) {
    var originalErr = System.err;
    System.setErr(new PrintStream(stderr, true, StandardCharsets.UTF_8));
    try {
      return TableOfContent.readTableOfContent(file);
    } finally {
      System.setErr(originalErr);
    }
  }

  private static void assertSinglePage(TableOfContent toc) {
    assertEquals(1, toc.getPages().size());
    var page = toc.getPages().get(0);
    assertEquals("Глобальный контекст", page.title().ru());
    assertEquals("Global context", page.title().en());
    assertEquals("Global context.html", page.htmlPath());
  }
}
