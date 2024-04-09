// Generated from D:/school/jaar 3/ASD Project/CompilerTest/untitled/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MyGrammarParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MyGrammarParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(MyGrammarParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(MyGrammarParser.DirectionContext ctx);
}