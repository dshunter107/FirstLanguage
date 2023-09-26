package parse.programactions;

import java.util.HashMap;
import java.util.List;

import parse.node.Group;
import parse.node.Variable;
import parse.program.Expression;

public class VariableDeclaration extends ProgramAction {
	public String variableType;
	public Group group;
	
	public VariableDeclaration(String variableType, Group group) {
		super("VariableDeclaration", group);
		this.variableType = variableType;
		this.group = group;
	}
	
	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		List<Expression> groupObjects = group.variables;
		for(Expression e: groupObjects) {
			e.setVariableType(variableType);
			variables.put(e.id, e);
		}
		
		return groupObjects;
	}
}
