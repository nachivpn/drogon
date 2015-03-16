// Generated from UserAgent.g4 by ANTLR 4.5

	package com.drogon.core;
	import java.util.List;
	import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UserAgentParser}.
 */
public interface UserAgentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UserAgentParser#useragent}.
	 * @param ctx the parse tree
	 */
	void enterUseragent(UserAgentParser.UseragentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserAgentParser#useragent}.
	 * @param ctx the parse tree
	 */
	void exitUseragent(UserAgentParser.UseragentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserAgentParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(UserAgentParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserAgentParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(UserAgentParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserAgentParser#bunit}.
	 * @param ctx the parse tree
	 */
	void enterBunit(UserAgentParser.BunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserAgentParser#bunit}.
	 * @param ctx the parse tree
	 */
	void exitBunit(UserAgentParser.BunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserAgentParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(UserAgentParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserAgentParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(UserAgentParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserAgentParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(UserAgentParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserAgentParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(UserAgentParser.VersionContext ctx);
}