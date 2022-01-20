package com.github.eightm.lib;

import org.junit.jupiter.api.Test;

class SimpleTest {

  @Test
  void test() {
    System.out.println("It works");
    // Так как файл справки платформы 1С является объектом исключительных прав фирмы 1С, его использование в публичных тестах
    // представляется затруднительным. Если у вас есть идеи как это можно сделать не нарушая лиц. соглашение, welcome.
    // TableOfContent.readTableOfContent(Path.of(pathToIndexFile));
  }
}
