// Generated from Expr.g4 by ANTLR 4.13.1

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ExprParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ExprParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#grp}.
	 * @param ctx the parse tree
	 */
	void enterGrp(ExprParser.GrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#grp}.
	 * @param ctx the parse tree
	 */
	void exitGrp(ExprParser.GrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(ExprParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(ExprParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ExprParser#assn}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ExprParser#assn}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterExponent(ExprParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitExponent(ExprParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(ExprParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(ExprParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterDivide(ExprParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitDivide(ExprParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(ExprParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(ExprParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ExprParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ExprParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterOr(ExprParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitOr(ExprParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Object}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void enterObject(ExprParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Object}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 */
	void exitObject(ExprParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#useraction}.
	 * @param ctx the parse tree
	 */
	void enterUseraction(ExprParser.UseractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#useraction}.
	 * @param ctx the parse tree
	 */
	void exitUseraction(ExprParser.UseractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionName}
	 * labeled alternative in {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterActionName(ExprParser.ActionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionName}
	 * labeled alternative in {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitActionName(ExprParser.ActionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionPath}
	 * labeled alternative in {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterActionPath(ExprParser.ActionPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionPath}
	 * labeled alternative in {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitActionPath(ExprParser.ActionPathContext ctx);
}