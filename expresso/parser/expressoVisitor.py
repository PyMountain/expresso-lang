# Generated from expresso.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .expressoParser import expressoParser
else:
    from expressoParser import expressoParser

# This class defines a complete generic visitor for a parse tree produced by expressoParser.

class expressoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by expressoParser#start.
    def visitStart(self, ctx:expressoParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#func_def.
    def visitFunc_def(self, ctx:expressoParser.Func_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#func_call.
    def visitFunc_call(self, ctx:expressoParser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#class_def.
    def visitClass_def(self, ctx:expressoParser.Class_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#class_stmt.
    def visitClass_stmt(self, ctx:expressoParser.Class_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#class_stmts.
    def visitClass_stmts(self, ctx:expressoParser.Class_stmtsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#class_inst.
    def visitClass_inst(self, ctx:expressoParser.Class_instContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#stmt.
    def visitStmt(self, ctx:expressoParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#stmts.
    def visitStmts(self, ctx:expressoParser.StmtsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#ass.
    def visitAss(self, ctx:expressoParser.AssContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#exp.
    def visitExp(self, ctx:expressoParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#if_stmt.
    def visitIf_stmt(self, ctx:expressoParser.If_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#while_stmt.
    def visitWhile_stmt(self, ctx:expressoParser.While_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#for_stmt.
    def visitFor_stmt(self, ctx:expressoParser.For_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#for_condition.
    def visitFor_condition(self, ctx:expressoParser.For_conditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#for_iteration.
    def visitFor_iteration(self, ctx:expressoParser.For_iterationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#switch_stmt.
    def visitSwitch_stmt(self, ctx:expressoParser.Switch_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#case_stmt.
    def visitCase_stmt(self, ctx:expressoParser.Case_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#case_stmts.
    def visitCase_stmts(self, ctx:expressoParser.Case_stmtsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#break_stmt.
    def visitBreak_stmt(self, ctx:expressoParser.Break_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#atm.
    def visitAtm(self, ctx:expressoParser.AtmContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by expressoParser#args.
    def visitArgs(self, ctx:expressoParser.ArgsContext):
        return self.visitChildren(ctx)



del expressoParser