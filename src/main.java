import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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

        printTree(tree, 0);
        writer.close();
    }
    public static void printTree(ParseTree tree, int indent) {
        for (int i = 0; i < indent - 1; i++) {
            writer.print("| ");
        }
        for (int i = Math.max(indent - 1,0); i < indent; i++) {
            writer.print("|-");
        }
        System.out.print(tree.getClass().getSimpleName());
        if(tree.getChildCount() == 0){
            writer.println(": " + tree.getText());
        }
        else{
            writer.println();
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), indent + 1);
        }
    }
}