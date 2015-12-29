// Generated from D:/Source_File/For_InteliJ/CMMGrammar/G4\CMM_BXJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMM_BXJParser}.
 */
public interface CMM_BXJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CMM_BXJParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CMM_BXJParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(CMM_BXJParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(CMM_BXJParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CMM_BXJParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CMM_BXJParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#declare_stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stat(CMM_BXJParser.Declare_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#declare_stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stat(CMM_BXJParser.Declare_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#assign_stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stat(CMM_BXJParser.Assign_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#assign_stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stat(CMM_BXJParser.Assign_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#declare_assign_stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_assign_stat(CMM_BXJParser.Declare_assign_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#declare_assign_stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_assign_stat(CMM_BXJParser.Declare_assign_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#read_stat}.
	 * @param ctx the parse tree
	 */
	void enterRead_stat(CMM_BXJParser.Read_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#read_stat}.
	 * @param ctx the parse tree
	 */
	void exitRead_stat(CMM_BXJParser.Read_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#write_stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stat(CMM_BXJParser.Write_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#write_stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stat(CMM_BXJParser.Write_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(CMM_BXJParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(CMM_BXJParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(CMM_BXJParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(CMM_BXJParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#break_stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stat(CMM_BXJParser.Break_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#break_stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stat(CMM_BXJParser.Break_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#cont_stat}.
	 * @param ctx the parse tree
	 */
	void enterCont_stat(CMM_BXJParser.Cont_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#cont_stat}.
	 * @param ctx the parse tree
	 */
	void exitCont_stat(CMM_BXJParser.Cont_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#other_stat}.
	 * @param ctx the parse tree
	 */
	void enterOther_stat(CMM_BXJParser.Other_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#other_stat}.
	 * @param ctx the parse tree
	 */
	void exitOther_stat(CMM_BXJParser.Other_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CMM_BXJParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CMM_BXJParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(CMM_BXJParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(CMM_BXJParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#int_array_expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_array_expr(CMM_BXJParser.Int_array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#int_array_expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_array_expr(CMM_BXJParser.Int_array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#double_array_expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble_array_expr(CMM_BXJParser.Double_array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#double_array_expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble_array_expr(CMM_BXJParser.Double_array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#char_array_expr}.
	 * @param ctx the parse tree
	 */
	void enterChar_array_expr(CMM_BXJParser.Char_array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#char_array_expr}.
	 * @param ctx the parse tree
	 */
	void exitChar_array_expr(CMM_BXJParser.Char_array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#bool_array_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_array_expr(CMM_BXJParser.Bool_array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#bool_array_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_array_expr(CMM_BXJParser.Bool_array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_expr(CMM_BXJParser.Int_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_expr(CMM_BXJParser.Int_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#double_expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble_expr(CMM_BXJParser.Double_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#double_expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble_expr(CMM_BXJParser.Double_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(CMM_BXJParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(CMM_BXJParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#char_expr}.
	 * @param ctx the parse tree
	 */
	void enterChar_expr(CMM_BXJParser.Char_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#char_expr}.
	 * @param ctx the parse tree
	 */
	void exitChar_expr(CMM_BXJParser.Char_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMM_BXJParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMM_BXJParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(CMM_BXJParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(CMM_BXJParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMM_BXJParser#array_tail}.
	 * @param ctx the parse tree
	 */
	void enterArray_tail(CMM_BXJParser.Array_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMM_BXJParser#array_tail}.
	 * @param ctx the parse tree
	 */
	void exitArray_tail(CMM_BXJParser.Array_tailContext ctx);
}