package parse.program;

import java.util.HashMap;

public abstract class Expression {
	public String id;
	public Class<? extends Expression> type;

	public Expression(String id, Class<? extends Expression> type) {
		this.id = id;
		this.type = type;
	}
	
	public boolean isType(Class<?> comparisonClass) {
		return type.equals(comparisonClass);
	}
	
	public abstract java.lang.Object execute(HashMap<String, Object> variables); 
	
	
	public void setVariableType(String Type) {
		throw new RuntimeException("Only Variables can receive a Type");
	}
	
	public Expression getValue() {
		throw new RuntimeException("Expression class: unimplemented Get Value Expression ");
	}
	
	public void setValue(Expression value) {
		throw new RuntimeException("Expression class: unimplemented set Value Expression");
	}

	public void addVariable(Expression v) {
		throw new RuntimeException("Expression class: unimplemented add Variable Expression");
	}
}
