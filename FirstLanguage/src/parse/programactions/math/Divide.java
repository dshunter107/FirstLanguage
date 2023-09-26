package parse.programactions.math;

import parse.node.Group;

public class Divide extends MathAction {
	
	public Divide(Group arguments) {
		super("Divide" , arguments);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
	/*	int size = arguments.size();
		for(int i = 0; i < size; i++) {
			s.append(arguments.get(i).toString());
			if( i < size - 1) s.append(" / ");
		}
		*/
		return s.toString();
	}
}
