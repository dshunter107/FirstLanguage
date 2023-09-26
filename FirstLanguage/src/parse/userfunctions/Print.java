package parse.userfunctions;

import java.util.HashMap;

import parse.node.List;
import parse.program.Expression;

public class Print extends UserAction {
	List input;
	List output;
	
	public Print(String id, List input, List output) {
		super(id, input, output);
		this.input = input;
		this.output = output;
	}
	
	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		System.out.println("Print Action: Program works");
		Expression value = input.getValue();
		System.out.println(value.toString());
		
		return null;
	}

}
