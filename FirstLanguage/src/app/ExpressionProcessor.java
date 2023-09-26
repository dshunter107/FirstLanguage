package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import parse.program.Expression;


public class ExpressionProcessor {

	private java.util.List<String> semanticErrors;
	private HashMap<String, Object> variables;
	
	public ExpressionProcessor(List<Expression> expressions) {
		semanticErrors = new ArrayList<>();		
		variables = new HashMap<String, Object>();
		
		for(Expression e: expressions) {
			try {
				if(e != null) {
					e.execute(variables);
				}
			} catch (Error err) {
				semanticErrors.add(err.getMessage());
			}
		}
	}
}
