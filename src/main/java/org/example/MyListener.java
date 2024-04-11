package org.example;

import org.example.Listner.MyGrammarBaseListener;
import org.example.Listner.MyGrammarParser;

class MyListener extends MyGrammarBaseListener {
    Speler speler;
    public MyListener(Speler speler) {
        super();
        this.speler = speler;
    }

    @Override
    public void enterEnkelLoopStatement(MyGrammarParser.EnkelLoopStatementContext ctx) {

        String direction = ctx.direction().getText();

        // Create a new speler object and call the loop method

        speler.loop(1, direction);
    }

    @Override
    public void enterMeerdereLoopStatement(MyGrammarParser.MeerdereLoopStatementContext ctx) {
        int aantal = Integer.parseInt(ctx.INT().getText());
        String direction = ctx.direction().getText();

        // Create a new speler object and call the loop method
        speler.loop(aantal, direction);
    }

}
