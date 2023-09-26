// Generated from Expr.g4 by ANTLR 4.13.1

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ExprParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#grp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrp(ExprParser.GrpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(ExprParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ExprParser#assn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponent}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(ExprParser.ExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(ExprParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(ExprParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ExprParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(ExprParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ExprParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ExprParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Object}
	 * labeled alternative in {@link ExprParser#programaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ExprParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#useraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseraction(ExprParser.UseractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActionName}
	 * labeled alternative in {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionName(ExprParser.ActionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActionPath}
	 * labeled alternative in {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionPath(ExprParser.ActionPathContext ctx);
}