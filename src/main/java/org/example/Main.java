package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.Listner.MyGrammarBaseListener;
import org.example.Listner.MyGrammarLexer;
import org.example.Listner.MyGrammarParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Read the input from the terminal
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        // Create a walker and a listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        while (!(input = reader.readLine()).equals("stop")) {
            // Create a CharStream from the input
            CharStream charStream = CharStreams.fromString(input);

            // Create a lexer and a token stream
            MyGrammarLexer lexer = new MyGrammarLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser
            MyGrammarParser parser = new MyGrammarParser(tokens);

            // Parse the input
            MyGrammarParser.ProgramContext programContext = parser.program();

            // Walk the parse tree with the listener
            walker.walk(listener, programContext);
        }
    }
}

class MyListener extends MyGrammarBaseListener {
    @Override
    public void enterLoopStatement(MyGrammarParser.LoopStatementContext ctx) {
        // Get the number of times to loop
        int times = Integer.parseInt(ctx.INT().getText());
        String direction = ctx.direction().getText();

        // Create a new Speler object and call the loop method
        Speler speler = new Speler();
        speler.loop(times, direction);
    }

    class Speler{

        public void loop(int times, String direction){
            for (int i = 0; i < times; i++) {
                System.out.println(direction);
            }
        }
    }
}

