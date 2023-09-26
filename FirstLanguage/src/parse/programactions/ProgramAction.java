package parse.programactions;

import java.util.HashMap;
import java.util.List;

import parse.node.Group;
import parse.node.Object;
import parse.program.Expression;

public class ProgramAction extends Expression {
	public List<Object> objects;
	public List<ProgramAction> actions;
	public String actionType;
	
	public ProgramAction(String actionType, Group group) {
		super(null, ProgramAction.class);
		this.actionType = actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@Override
	public java.lang.Object execute(HashMap<String, java.lang.Object> variables) {
		throw new RuntimeException("Unimplemented Program Action");
	}

}
