package parse.node;

import parse.program.Expression;

public class Group extends List {
	public java.util.List<Expression> variables;
	
	public Group(java.util.List<Expression> variables) {
		super(null);
		this.variables = variables;
	}

	public void setVariables(java.util.List<Expression> variables) {
		this.variables = variables;
	}
	
	public void AddVariable(Expression v) {
		value.addVariable(v);
	}

}
