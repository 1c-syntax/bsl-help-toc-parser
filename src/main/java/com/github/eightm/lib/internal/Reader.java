package com.github.eightm.lib.internal;

import com.github.eightm.lib.Page;
import com.github.eightm.parser.TOC;
import com.github.eightm.parser.TOCTokens;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Reader {
  public List<Page> readPages(Path pathToIndexFile) {
    try {
      var lexer = new TOCTokens(CharStreams.fromPath(pathToIndexFile));
      var tokens = new CommonTokenStream(lexer);
      var parser = new TOC(tokens);
      var tree = parser.tableOfContent();
      var walker = new ParseTreeWalker();
      LibListener listener = new LibListener();

      walker.walk(listener, tree);
      return listener.result;

    } catch (IOException e) {
      return Collections.emptyList();
    }
  }
}
