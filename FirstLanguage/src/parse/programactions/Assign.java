package parse.programactions;


import java.util.HashMap;
import java.util.List;

import parse.node.Group;
import parse.program.Expression;

public class Assign extends ProgramAction {
	public Group group;
	public Expression value;
	
	public Assign(Group group, Expression expr) {
		super("Assign",  group);
		this.group = group;
		this.value = expr;
	}

	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		List<Expression> groupVariables = group.variables;
		
		
		for(Expression e: groupVariables) {
			if(variables.containsKey(e.id)) {
				e.setValue(value);
			} else { 
				throw new RuntimeException("Variable not initialized");
			}
		}
		
		return groupVariables;
	}
}
