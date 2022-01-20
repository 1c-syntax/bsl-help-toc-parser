package com.github.eightm.lib;

import com.github.eightm.lib.internal.Reader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Содержание справки синтакс-помощника 1С.
 * Содержит в себе рекурсивный список страниц, каждая из которых содержит заголовок страницы и относительный путь к
 * соответствующей html странице.
 */
public class TableOfContent {

  private List<Page> pages;

  private TableOfContent() {
    // noop
  }

  /**
   * @param pathToIndexFile путь к файлу содержащему содержание справки синтакс-помощника. Не может быть равен null.
   * @return построенное содержание справки
   * @throws NullPointerException если {@code pathToIndexFile} равен null.
   * @throws IllegalArgumentException если файл справки не существует.
   */
  public static TableOfContent readTableOfContent(Path pathToIndexFile) {
    Objects.requireNonNull(pathToIndexFile);

    if (!Files.exists(pathToIndexFile)) {
      throw new IllegalArgumentException(pathToIndexFile + " does not exist");
    }

    return readFile(pathToIndexFile);
  }

  private static TableOfContent readFile(Path pathToIndexFile) {
    var reader = new Reader();
    var pages = reader.readPages(pathToIndexFile);
    var tableOfContent =  new TableOfContent();
    tableOfContent.pages = Collections.unmodifiableList(pages);
    return tableOfContent;
  }

  public List<Page> getPages() {
    return pages;
  }
}
