package app;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import antlr.ExprLexer;
import antlr.ExprParser;
import antlr.ExprParser.ProgContext;
import parse.program.AntlrToProgram;
import parse.program.Program;

public class Start {

	public static void main(String[] args) {
		if(args.length != 1) {
			throw new RuntimeException("Need to have input file");
		}
		
		String fileName = args[0];
		ExprParser parser = getParser(fileName);
		ProgContext antlrAST = parser.prog();
		AntlrToProgram progVisitor = new AntlrToProgram();		
		Program prog = progVisitor.visit(antlrAST);
		List<String> semanticErrors = progVisitor.semanticErrors;
		
		if(semanticErrors.isEmpty()) {
			ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
		} else {
			List<String> errorStrings = progVisitor.semanticErrors;
			for(String err: errorStrings) {
				System.out.println(err);
			}
		}
	}

	private static ExprParser getParser(String fileName) {
		ExprParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(fileName);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ExprParser(tokens);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return parser;
	}
}
