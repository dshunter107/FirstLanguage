package parse.programactions.bool;

import parse.node.Group;
import parse.programactions.ProgramAction;

public class BooleanAction extends ProgramAction {
	String booleanActionType; 
	
	public BooleanAction(String booleanActionType, Group arguments) {
		super("Boolean", arguments);
		this.booleanActionType = booleanActionType;
	}

}
