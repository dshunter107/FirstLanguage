package parse.program;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.ProgramContext;

public class AntlrToProgram extends ExprBaseVisitor<Program>{

	public List<String> semanticErrors;
	
	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog = new Program();
		
		semanticErrors = new ArrayList<>();
		
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
		
		List<ParseTree> children = ctx.children;
		for(ParseTree c: children) {
			prog.addExpression(exprVisitor.visit(c));
		}
		
		return prog;
	}


}
