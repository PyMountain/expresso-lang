// Generated from expresso.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressoParser}.
 */
public interface expressoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link expressoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(expressoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(expressoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(expressoParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(expressoParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(expressoParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(expressoParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(expressoParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(expressoParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass_stmt(expressoParser.Class_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass_stmt(expressoParser.Class_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#class_stmts}.
	 * @param ctx the parse tree
	 */
	void enterClass_stmts(expressoParser.Class_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#class_stmts}.
	 * @param ctx the parse tree
	 */
	void exitClass_stmts(expressoParser.Class_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#class_inst}.
	 * @param ctx the parse tree
	 */
	void enterClass_inst(expressoParser.Class_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#class_inst}.
	 * @param ctx the parse tree
	 */
	void exitClass_inst(expressoParser.Class_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(expressoParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(expressoParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(expressoParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(expressoParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#ass}.
	 * @param ctx the parse tree
	 */
	void enterAss(expressoParser.AssContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#ass}.
	 * @param ctx the parse tree
	 */
	void exitAss(expressoParser.AssContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(expressoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(expressoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(expressoParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(expressoParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(expressoParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(expressoParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(expressoParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(expressoParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(expressoParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(expressoParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#for_iteration}.
	 * @param ctx the parse tree
	 */
	void enterFor_iteration(expressoParser.For_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#for_iteration}.
	 * @param ctx the parse tree
	 */
	void exitFor_iteration(expressoParser.For_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(expressoParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(expressoParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(expressoParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(expressoParser.Case_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#case_stmts}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmts(expressoParser.Case_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#case_stmts}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmts(expressoParser.Case_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(expressoParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(expressoParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#atm}.
	 * @param ctx the parse tree
	 */
	void enterAtm(expressoParser.AtmContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#atm}.
	 * @param ctx the parse tree
	 */
	void exitAtm(expressoParser.AtmContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressoParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(expressoParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressoParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(expressoParser.ArgsContext ctx);
}