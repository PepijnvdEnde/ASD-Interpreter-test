package org.example;

import org.example.Listner.MyGrammarBaseListener;
import org.example.Listner.MyGrammarParser;

class MyListener extends MyGrammarBaseListener {
    @Override
    public void enterEnkelLoopStatement(MyGrammarParser.EnkelLoopStatementContext ctx) {

        String direction = ctx.direction().getText();

        // Create a new Speler object and call the loop method
        Speler speler = new Speler();
        speler.loop(1, direction);
    }

    @Override
    public void enterMeerdereLoopStatement(MyGrammarParser.MeerdereLoopStatementContext ctx) {
        int aantal = Integer.parseInt(ctx.INT().getText());
        String direction = ctx.direction().getText();

        // Create a new Speler object and call the loop method
        Speler speler = new Speler();
        speler.loop(aantal, direction);
    }

}
