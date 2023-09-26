package parse.programactions.math;

import parse.node.Group;
import parse.programactions.ProgramAction;

public class MathAction extends ProgramAction {
	public String mathActionType = "Math";
	Group arguments;
	
	public MathAction(String mathActionType, Group arguments) {
		super("Math", arguments);
		this.arguments = arguments;
	}
	
	
}
