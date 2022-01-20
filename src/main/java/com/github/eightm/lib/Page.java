package com.github.eightm.lib;

import java.util.List;

public record Page(
  DoubleLanguageString title,
  String htmlPath,
  List<Page> children
) {
}
