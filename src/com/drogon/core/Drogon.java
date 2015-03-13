package com.drogon.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
Contributors: Nachi
*/
public class Drogon {

	private List<String> list = new ArrayList<String>();
	
	/**
	 * Returns all the product names in the userAgent as a List of strings
	 * @param userAgent
	 * @return list of product names
	 * @throws IOException
	 */
	public List <String> getProductList(String userAgent) throws IOException{
		ANTLRInputStream antlr = new ANTLRInputStream(userAgent);
		UserAgentLexer lexer = new UserAgentLexer(antlr);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		UserAgentParser parser = new UserAgentParser(tokens, list);
		UserAgentBaseListener extractor = new UserAgentBaseListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(extractor, parser.body());
		return list;
	}

}
