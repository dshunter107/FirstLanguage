package parse.node;

import java.util.HashMap;

import parse.program.Expression;

public class Object extends Expression {
	public String id;
	public Class<?> classType;
	public Expression value;
	
	
	public Object(String id, Class<? extends Expression> type) {
		super(id, type);
		this.id = id;
		this.classType = type;
	}
	
	@Override
	public void setValue(Expression value) {
		this.value = value;
	}
	
	public java.lang.Object getChild() {
		return classType.cast(value);
	}

	@Override
	public Expression getValue() {
		return value;
	}
	
	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		return this.value;
	}
	
	
	public void setId(String id) {
		 
	}

	@Override
	public void addVariable(Expression v) {
		throw new RuntimeException("Object Error: only list can add variable");
		
	}
}
