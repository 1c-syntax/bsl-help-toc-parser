// Generated from TOC.g4 by ANTLR 4.9.3
package com.github.eightm.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TOC}.
 */
public interface TOCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TOC#tableOfContent}.
	 * @param ctx the parse tree
	 */
	void enterTableOfContent(TOC.TableOfContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#tableOfContent}.
	 * @param ctx the parse tree
	 */
	void exitTableOfContent(TOC.TableOfContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(TOC.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(TOC.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#propertiesContainer}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesContainer(TOC.PropertiesContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#propertiesContainer}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesContainer(TOC.PropertiesContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#nameContainer}.
	 * @param ctx the parse tree
	 */
	void enterNameContainer(TOC.NameContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#nameContainer}.
	 * @param ctx the parse tree
	 */
	void exitNameContainer(TOC.NameContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#nameObject}.
	 * @param ctx the parse tree
	 */
	void enterNameObject(TOC.NameObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#nameObject}.
	 * @param ctx the parse tree
	 */
	void exitNameObject(TOC.NameObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#chunkCount}.
	 * @param ctx the parse tree
	 */
	void enterChunkCount(TOC.ChunkCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#chunkCount}.
	 * @param ctx the parse tree
	 */
	void exitChunkCount(TOC.ChunkCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#chunkId}.
	 * @param ctx the parse tree
	 */
	void enterChunkId(TOC.ChunkIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#chunkId}.
	 * @param ctx the parse tree
	 */
	void exitChunkId(TOC.ChunkIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#chunkParentId}.
	 * @param ctx the parse tree
	 */
	void enterChunkParentId(TOC.ChunkParentIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#chunkParentId}.
	 * @param ctx the parse tree
	 */
	void exitChunkParentId(TOC.ChunkParentIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#childCount}.
	 * @param ctx the parse tree
	 */
	void enterChildCount(TOC.ChildCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#childCount}.
	 * @param ctx the parse tree
	 */
	void exitChildCount(TOC.ChildCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#childId}.
	 * @param ctx the parse tree
	 */
	void enterChildId(TOC.ChildIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#childId}.
	 * @param ctx the parse tree
	 */
	void exitChildId(TOC.ChildIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#htmlPath}.
	 * @param ctx the parse tree
	 */
	void enterHtmlPath(TOC.HtmlPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#htmlPath}.
	 * @param ctx the parse tree
	 */
	void exitHtmlPath(TOC.HtmlPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#languageCode}.
	 * @param ctx the parse tree
	 */
	void enterLanguageCode(TOC.LanguageCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#languageCode}.
	 * @param ctx the parse tree
	 */
	void exitLanguageCode(TOC.LanguageCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOC#name}.
	 * @param ctx the parse tree
	 */
	void enterName(TOC.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOC#name}.
	 * @param ctx the parse tree
	 */
	void exitName(TOC.NameContext ctx);
}