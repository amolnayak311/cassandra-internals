package com.github.amolnayak.cassandra.cql3.parser;

import com.github.amolnayak.cassandra.cql3.CQLParser;

import com.github.amolnayak.cassandra.cql3.CQLParser.SelectContext;
import org.antlr.v4.runtime.tree.ParseTree;
import com.github.amolnayak.cassandra.cql3.CQLParserBaseListener;


/**
 * 
 * @author nayaamo
 *
 */
public class CQL3ParserListener extends CQLParserBaseListener {
	
	
	private CQLParser parser;
	/**
	 * 
	 * @param parser
	 */
	public CQL3ParserListener(CQLParser parser) {
		this.parser = parser;
	}

	@Override
	public void enterSelect(SelectContext ctx) {
		
		int nChildren = ctx.getChildCount();
		System.out.println("\n\nNumber of children " + nChildren);
		for(int i = 0; i < nChildren; i++) {
			ParseTree tree = ctx.getChild(i);
			System.out.println(tree.toStringTree(parser));
		}
	}

	
	
}
