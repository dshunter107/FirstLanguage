
package parse.node;

import java.util.HashMap;

import parse.program.Expression;

public class Variable extends Object {
	public String variableType;
	public String id;
	public Expression value;
	
	
	public Variable(String id ,Object value) {
		super(id, Variable.class);
		this.id = id;
		if(value != null)
		this.value = value.value;
		super.setValue(this.value);
	}
	
	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		return value;
	}
	
	@Override
	public Expression getValue() {
		return value;
	}
	
	@Override 
	public void setValue(Expression value) {
		this.value = value.getValue();
		super.value = this.value;
	}
	
	@Override
	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}
	
	public String toString() {
		return value.toString();
	}
}
