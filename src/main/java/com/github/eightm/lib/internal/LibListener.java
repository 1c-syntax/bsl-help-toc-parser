package com.github.eightm.lib.internal;

import com.github.eightm.lib.DoubleLanguageString;
import com.github.eightm.lib.Page;
import com.github.eightm.parser.TOC;
import com.github.eightm.parser.TOCBaseListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibListener extends TOCBaseListener {

  private final Map<String, Page> idToPages = new HashMap<>();

  public final List<Page> result = new ArrayList<>();

  @Override
  public void enterChunk(TOC.ChunkContext ctx) {
    var pageId = ctx.chunkId().getText();
    var parentPageId = ctx.chunkParentId().getText();

    var propertiesContainer = ctx.propertiesContainer();
    var htmlPath = getHtmlPath(propertiesContainer);
    var pageTitle = readPageTitle(propertiesContainer);
    var page = new Page(pageTitle, htmlPath, new ArrayList<>());

    if (parentPageId.equals("0")) {
      result.add(page);
    }

    var parent = idToPages.get(parentPageId);
    if (parent != null) {
      parent.children().add(page);
    }

    idToPages.put(pageId, page);
  }

  private String getHtmlPath(TOC.PropertiesContainerContext propertiesContainer) {
    return propertiesContainer.htmlPath().getText().replace("\"", "");
  }

  private DoubleLanguageString readPageTitle(TOC.PropertiesContainerContext propertiesContainer) {
    var nameContainer = propertiesContainer.nameContainer();
    var namesContext = nameContainer.nameObject();

    if (namesContext == null || namesContext.isEmpty()) {
      return new DoubleLanguageString("", "");
    } else if (namesContext.size() == 1) {
      var engName = namesContext.get(0);
      return new DoubleLanguageString(getName(engName), "");
    } else {
      var ruName = namesContext.get(0);
      var engName = namesContext.get(1);
      return new DoubleLanguageString(getName(engName), getName(ruName));
    }
  }

  private String getName(TOC.NameObjectContext nameContext) {
    return nameContext.name().getText().replace("\"", "");
  }
}
