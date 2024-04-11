package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
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
        Speler speler = new Speler();
        MyListener listener = new MyListener(speler);


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
            walker.walk(listener,  programContext);
        }
    }
}

