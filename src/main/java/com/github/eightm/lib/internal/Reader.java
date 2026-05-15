package com.github.eightm.lib.internal;

import com.github.eightm.lib.Page;
import com.github.eightm.parser.TOC;
import com.github.eightm.parser.TOCTokens;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Reader {
  public List<Page> readPages(Path pathToIndexFile) {
    // Forked ANTLR runtime не содержит CharStreams.fromPath(Path) —
    // используем CharStreams.fromStream(InputStream).
    try (var in = Files.newInputStream(pathToIndexFile)) {
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
}
