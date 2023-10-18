import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class main {
    public static PrintWriter writer;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print input filename:");
        String inputFilename = scanner.nextLine();
        System.out.println("Print output filename:");
        String outputFilename = scanner.nextLine();
        writer = new PrintWriter(outputFilename);

        CharStream input = CharStreams.fromFileName(inputFilename);
        FLanguageLexer lexer = new FLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLanguageParser parser = new FLanguageParser(tokens);
        ParseTree tree = parser.program();
        print(tree, 0);
        writer.close();
    }
    public static void print(ParseTree tree, int height) {
        for (int i = 0; i < height - 1; i++) {
            writer.print("- ");
        }
        for (int i = Math.max(height - 1,0); i < height; i++) {
            writer.print("|-");
        }
        writer.print(tree.getClass().getSimpleName());
        if(tree.getChildCount() == 0){
            writer.println(": " + tree.getText());
        }
        else{
            writer.println();
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            print(tree.getChild(i), height + 1);
        }
    }
}