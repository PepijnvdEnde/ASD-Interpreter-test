grammar MyGrammar;

program: statement+;

statement: loopStatement;

loopStatement: 'loop' INT 'keer' 'naar' direction;

direction: 'boven' | 'onder' | 'links' | 'rechts';



INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
