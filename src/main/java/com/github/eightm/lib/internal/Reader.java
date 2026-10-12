package com.github.eightm.lib.internal;

import com.github.eightm.lib.Page;
import com.github.eightm.parser.TOC;
import com.github.eightm.parser.TOCTokens;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reader {
  private static final byte[] UTF8_BOM = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};

  public List<Page> readPages(Path pathToIndexFile) {
    // Forked ANTLR runtime не содержит CharStreams.fromPath(Path) —
    // используем CharStreams.fromStream(InputStream).
    try (var in = new BufferedInputStream(Files.newInputStream(pathToIndexFile))) {
      skipByteOrderMark(in);
      var lexer = new TOCTokens(CharStreams.fromStream(in));
      var tokens = new CommonTokenStream(lexer);
      var parser = new TOC(tokens);
      var tree = parser.tableOfContent();
      var walker = new ParseTreeWalker();
      var listener = new LibListener();
      walker.walk(listener, tree);
      return listener.result;
    } catch (IOException e) {
      return Collections.emptyList();
    }
  }

  /**
   * Оглавление справки платформы начинается с UTF-8 BOM, а у лексера для него правила нет:
   * без пропуска каждое чтение печатает «token recognition error» на первом символе.
   */
  private static void skipByteOrderMark(BufferedInputStream in) throws IOException {
    in.mark(UTF8_BOM.length);
    if (!Arrays.equals(in.readNBytes(UTF8_BOM.length), UTF8_BOM)) {
      in.reset();
    }
  }
}
