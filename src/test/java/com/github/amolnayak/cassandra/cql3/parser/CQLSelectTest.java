/**
 * 
 */
package com.github.amolnayak.cassandra.cql3.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.junit.jupiter.api.Test;

import com.github.amolnayak.cassandra.cql3.CQLLexer;
import com.github.amolnayak.cassandra.cql3.CQLParser;
import com.github.amolnayak.cassandra.cql3.CQLParser.RootContext;

/**
 * @author nayaamo
 *
 */
public class CQLSelectTest {
	
	
	
	@Test
	public void testParse() throws IOException {
		
		//TODO: Implement
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		try(InputStream in = cl.getResourceAsStream("select.cql")) {
			CQLLexer lexer = new CQLLexer(CharStreams.fromStream(in));
			CQLParser parser = new CQLParser(new CommonTokenStream(lexer));
			ParseTreeWalker walker = new ParseTreeWalker();
			CQL3ParserListener listener = new CQL3ParserListener(parser);
			walker.walk(listener, parser.root().getChild(0));
		}
	}

}
