package parse.userfunctions;


import java.util.HashMap;

import parse.node.List;
import parse.program.Expression;

public class UserAction extends Expression {
	public String id;
	Expression input;
	Expression output;
	
	
	public UserAction(String id, Expression input, Expression output) {
		super(id, UserAction.class );
		this.id = id;
		this.input = input;
		this.output = output;
	}

	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		System.out.println("User Action: Program works");
		Expression value = input.getValue();
		System.out.println(value.toString());
		
		return null;
	}
}
