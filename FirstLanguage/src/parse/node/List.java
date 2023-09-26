package parse.node;

import java.util.HashMap;

import parse.program.Expression;

public class List extends Object {
	String id;
	public Expression value;
	
	
	public List(String id) {
		super(id, List.class);
		this.id = id;

	}
	
	public List(String id, Group thisGroup) {
		super(id, List.class);
		this.id = id;
		this.value = thisGroup;
		super.value = thisGroup;
	}

	public void AddVariable(Expression v) {
		value.addVariable(v);
	}
	
	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		return variables;
	}
	
	@Override
	public Expression getValue() {
		return value;
	}
	
	@Override
	public void setValue(Expression group) {
		this.value = group;
	}
}
