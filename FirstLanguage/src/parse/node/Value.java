package parse.node;

import java.util.HashMap;

import parse.program.Expression;

public class Value extends Object {
	public static final String id = null;
	public String v;
	
	public Value(String v) {
		super(id, Value.class);
		this.v = v;
		super.value = this;
	}
	
	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		return this.v;
	}
	
	@Override
	public void setValue(Expression value) {
		new RuntimeException("Value Error: Only varibles can update values");
	}
	
	@Override
	public Expression getValue() {
		return this;
	}
	
	
	@Override
	public String toString() {
		return v;
	}
}
