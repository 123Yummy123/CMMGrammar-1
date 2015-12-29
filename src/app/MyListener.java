package app;

import antlr.CMM_BXJBaseListener;
import antlr.CMM_BXJLexer;
import antlr.CMM_BXJParser;
import app.SymbolTable.*;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;


/**
 * Created by BxJiang on 2015/12/14.
 */
public class MyListener extends CMM_BXJBaseListener{
    Scope currentScope;


    /* build a symbol table */
    @Override public void exitDeclare_stat(CMM_BXJParser.Declare_statContext ctx) {
        Symbol.Type type=CheckSymbols.getType(ctx.type().start.getType());
        int n=ctx.getChildCount();
        int count = 0;
        Symbol symbol;
        for(int i=1;i<n;i+=2){
            if(ctx.getChild(i).getChildCount()==0) {
                String name = ctx.getChild(i).getText();
                symbol = new Symbol(name, type);
            }
            else{
                String s =ctx.array_id(count).array_tail().int_expr().getText();
                //TODO:get size
                int size = Integer.parseInt(s);
                String name = ctx.getChild(i).getChild(0).getText();
                symbol = new ArraySymbol(name,type,size);
            }
            currentScope.define(symbol);
        }

    }

    @Override public void exitAssign_stat(CMM_BXJParser.Assign_statContext ctx) {
        if(ctx.getChild(0).getChildCount()==0){
            Symbol symbol = currentScope.resolve(ctx.ID().getText());
            if(symbol==null){
                CheckSymbols.error(ctx.ID().getSymbol(), "no such variable: " + ctx.ID().getText());
                return;
            }
            symbol.setValue(ctx.getChild(2).getText());
        }
        else{
            ArraySymbol as = (ArraySymbol)currentScope.resolve(ctx.array_id().ID().getText());
            if(as==null){
                CheckSymbols.error(ctx.array_id().ID().getSymbol(), "no such variable: " + ctx.array_id().ID().getText());
                return;
            }
            int index=Integer.parseInt(ctx.array_id().array_tail().int_expr().getText());
            as.setElementValue(index,ctx.getChild(2).getText());
        }

    }

    @Override public void enterInput(CMM_BXJParser.InputContext ctx) {
        currentScope = new GlobalScope(null);
    }

    @Override public void exitInput(CMM_BXJParser.InputContext ctx) {
        System.out.println(currentScope);
    }

    @Override public void enterStat_block(CMM_BXJParser.Stat_blockContext ctx) {
        currentScope = new LocalScope(currentScope);
    }

    @Override public void exitStat_block(CMM_BXJParser.Stat_blockContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    /* do computation */
    @Override public void exitInt_expr(CMM_BXJParser.Int_exprContext ctx) {
        if(ctx.getChildCount()==1){

        }
        else if(ctx.getChildCount()==2){

        }
        else if(ctx.getChildCount()==3){

        }
    }

}
