package parse.programactions.math;

import java.util.HashMap;
import java.util.List;

import parse.node.Group;
import parse.node.Value;
import parse.program.Expression;

public class Add extends MathAction {
	Group arguments; 
	
	public Add(Group arguments) {
		super("Add" , arguments);
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		return s.toString();
	}
	
	@Override 
	public Expression getValue() {
		return this.execute(null);
	}
	
	@Override
	public Expression execute(HashMap<String, java.lang.Object> variables) {
		List<Expression> groupVariables = arguments.variables;
		String value = addGroupObjects(groupVariables);
		
		return new Value(value);	
	}
	
	public String addGroupObjects(List<Expression> groupObjects) {
		Object valueObject;
		String value;
		Integer result = 0;
		
		for(Expression expr: groupObjects) {
			Expression e = expr.getValue();
			
			if(e.isType(parse.node.List.class)) {
				Group group = (Group) e;
				value = addGroupObjects( group.variables);
			} else {
				valueObject = expr.getValue();
				value = valueObject.toString();
			}
			
			result += Integer.parseInt(value);
		}
		
		return result.toString();
	}
	
}
