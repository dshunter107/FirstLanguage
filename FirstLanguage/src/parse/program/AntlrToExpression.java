package parse.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.ActionNameContext;
import antlr.ExprParser.ActionPathContext;
import antlr.ExprParser.AddContext;
import antlr.ExprParser.AndContext;
import antlr.ExprParser.AssignContext;
import antlr.ExprParser.DeclarationContext;
import antlr.ExprParser.DivideContext;
import antlr.ExprParser.ExponentContext;
import antlr.ExprParser.GrpContext;
import antlr.ExprParser.ListContext;
import antlr.ExprParser.MultiplyContext;
import antlr.ExprParser.ObjContext;
import antlr.ExprParser.ObjectContext;
import antlr.ExprParser.OrContext;
import antlr.ExprParser.ProgramactionContext;
import antlr.ExprParser.SubtractContext;
import antlr.ExprParser.UseractionContext;
import parse.node.Group;
import parse.node.Object;
import parse.node.Value;
import parse.node.Variable;
import parse.programactions.Assign;
import parse.programactions.VariableDeclaration;
import parse.programactions.bool.And;
import parse.programactions.bool.Or;
import parse.programactions.math.Add;
import parse.programactions.math.Divide;
import parse.programactions.math.Exponent;
import parse.programactions.math.Multiply;
import parse.programactions.math.Subtract;
import parse.userfunctions.UserAction;

public class AntlrToExpression extends ExprBaseVisitor<Expression> {

	private HashMap<String, Expression> vars;
	private List<String> semanticErrors;
	
	public AntlrToExpression(List<String> semanticErrors) {
		this.semanticErrors = semanticErrors;
		vars = new HashMap<String, Expression>();
	}
	
	@Override
	public Expression visitDeclaration(DeclarationContext ctx) {
		String variableType = ctx.getChild(0).getText();
		GrpContext grpCon = ctx.grp();
		ArrayList<Expression> groupObjects = new ArrayList<>();
		
		getGroupMembers(grpCon, groupObjects, true);
		
		Group thisGroup = new Group(groupObjects);
		return new VariableDeclaration(variableType, thisGroup);
	}

	@Override
	public Expression visitList(ListContext ctx) {
		ArrayList<Expression> groupObjects = new ArrayList<>();
		getGroupMembers(ctx.grp(), groupObjects, false);
		Group group = new Group(groupObjects);
		
		return new parse.node.List(null, group);
	}

	@Override
	public Expression visitGrp(GrpContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGrp(ctx);
	}
	
	private void getGroupMembers(GrpContext ctx, ArrayList<Expression> groupObjects, boolean createGroup) {
		java.util.List<GrpContext> gcs = ctx.grp();
		ObjContext obj = ctx.obj();
		
		for(GrpContext gc: gcs) {
			getGroupMembers(gc, groupObjects, createGroup);
		}
		
		
		if(obj != null) {
			Expression objectExpression = visitObj(obj);
			
			String objectId = objectExpression.id;
			Token objectToken = obj.getStart();
			int line = objectToken.getLine();
			int col = objectToken.getCharPositionInLine();
			if(createGroup) {
				if(vars.containsKey(objectExpression.id)) {
					semanticErrors.add("Variable already Declared " + errorPlace(line, col));
				} else {
					vars.put(objectId, objectExpression);
					groupObjects.add(objectExpression);
				}
			} else {
				if(vars.containsKey(objectExpression.id)) {
					vars.get(objectId);
					groupObjects.add(objectExpression);
				} else {
					semanticErrors.add("Variable not yet declared " + errorPlace(line, col));
				}
			}
		}
		
	}
	
	@Override
	public Expression visitObj(ObjContext ctx) {	
		TerminalNode idParseTree = ctx.ID();
		TerminalNode valueParseTree = ctx.VALUE();
		ListContext lc = ctx.list();
		
		Expression object = null;
	
		if(idParseTree != null) {
			object = visitVariable(idParseTree);
		} else if(valueParseTree != null) {
			object = visitValue(valueParseTree);
		} else if(lc != null){
			object = visitList(lc);
		}
		
		
		return object;	
	}

	private String errorPlace(int line, int column) {
		return "(line: " + line + ", column: " + column + ")";
	}

	public Expression visitVariable(TerminalNode ctx) {	
		String id = ctx.getText();
		Expression v;
		
		if(vars.containsKey(id)) {
			v = vars.get(id);
		} else {
			v = new Variable(id, null);
		}
		
		return v;
	}

	
	public Object visitValue(TerminalNode ctx) {
		char[] characters = ctx.getText().toCharArray(); 
		int length = characters.length;
		StringBuilder processedCharacters = new StringBuilder();
		
		for(int i = 0; i < length; i++ ) {
			if(i == 0 || i == length - 1) {
				continue;
			} else {
				processedCharacters.append(characters[i]);
			}
		}
		
		return new Value(processedCharacters.toString());
	}

	
	public Object visitListObject(ListContext listContext) {
		
		return null;
	}

	@Override
	public Expression visitAssign(AssignContext ctx) {
		ArrayList<Expression> groupObjects = new ArrayList<>();
		Group variables = new Group(groupObjects);
		Expression value;
		
	//	ArrayList<Object> assignArguments = new ArrayList<>();
	//	assignArguments.add(variables);
		
		getGroupMembers(ctx.grp(), groupObjects , false);
		ProgramactionContext pc = ctx.programaction();
		value = visit(pc);
		
		return new Assign(variables, value);		
	}

	@Override
	public Expression visitExponent(ExponentContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new Exponent(expressionGroup);
	}

	@Override
	public Expression visitMultiply(MultiplyContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new Multiply(expressionGroup);
	}

	@Override
	public Expression visitDivide(DivideContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new Divide(expressionGroup);
	}

	@Override
	public Expression visitAdd(AddContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new Add(expressionGroup);
	}

	@Override
	public Expression visitSubtract(SubtractContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new Subtract(expressionGroup);
	}

	@Override
	public Expression visitAnd(AndContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new And(expressionGroup);
	}

	@Override
	public Expression visitOr(OrContext ctx) {
		List<ProgramactionContext> paCtxs = ctx.programaction();
		Group expressionGroup = getMathExpressionObjects(paCtxs);
		
		return new Or(expressionGroup);
	}

	public Group getMathExpressionObjects(List<ProgramactionContext> paCtxs) {
		Expression left = visit(paCtxs.get(0));
		Expression right = visit(paCtxs.get(1));
		List<Expression> expressionList = new ArrayList<>();
		expressionList.add(left);
		expressionList.add(right);
		
		return new Group(expressionList);
	}
	
	@Override
	public Expression visitObject(ObjectContext ctx) {
		return visitObj(ctx.obj());
	}

	@Override
	public Expression visitUseraction(UseractionContext ctx) {
		ctx.rel();
		java.util.List<ObjContext> objects = ctx.obj();
		Expression input = visitObj(objects.get(0));
		Expression output = visitObj(objects.get(1));
		
		return new UserAction(null, input, output);
	}

	@Override
	public Expression visitActionName(ActionNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActionName(ctx);
	}

	@Override
	public Expression visitActionPath(ActionPathContext ctx) {
		// TODO Auto-generated method stub
		return super.visitActionPath(ctx);
	}

}
