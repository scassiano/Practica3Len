import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // create a CharStream that reads from standard input / file
            // create a lexer that feeds off of input CharStream
            GramaticaCoralLexer lexer;

            if (args.length>0)
                lexer = new GramaticaCoralLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new GramaticaCoralLexer(CharStreams.fromStream(System.in));
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            GramaticaCoralParser parser = new GramaticaCoralParser(tokens);
            ParseTree tree = parser.init(); // begin parsing at commands rule IMPORTANTE
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new Traduccion(), tree);
            System.out.println(); // print a \n after translation
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}