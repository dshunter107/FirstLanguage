package parse.programactions.math;

import java.util.HashMap;
import java.util.List;

import parse.node.Group;
import parse.node.Value;
import parse.program.Expression;

public class Subtract extends MathAction {
	
	public Subtract(Group arguments) {
		super("Subtract" , arguments);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
	/*	int size = arguments.size();
		for(int i = 0; i < size; i++) {
			s.append(arguments.get(i).toString());
			if( i < size - 1) s.append(" - ");
		} */
		return s.toString();
	}
	
	@Override 
	public Expression getValue() {
		return this.execute(null);
	}
	
	@Override
	public Expression execute(HashMap<String, java.lang.Object> variables) {
		List<Expression> groupVariables = arguments.variables;
		
		String value = groupVariables.get(0).getValue().toString();
		Integer result = Integer.parseInt(value);
		result += result;
		
		for(Expression expr : groupVariables) {
			value = expr.getValue().toString();
			result -= Integer.parseInt(value);
		}
		
		
		return new Value(result.toString());	
	}
}
