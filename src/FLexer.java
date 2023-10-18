import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FLexer {
    public enum TokenType {
        LEFT_PAREN("\\("),
        RIGHT_PAREN("\\)"),
        REAL("[+-]?\\d+\\.\\d+"),
        INTEGER("[+-]?\\d+"),
        BOOLEAN("true|false"),
        IDENTIFIER("[a-zA-Z][a-zA-Z0-9]*"),
        WHITESPACE("\\s+"),
        NULL("null");

        public final Pattern pattern;

        TokenType(String regex) {
            this.pattern = Pattern.compile("^" + regex);
        }
    }

    public static class Token {
        public TokenType type;
        public String data;
        public int index;

        public Token(TokenType type, String data, int index) {
            this.type = type;
            this.data = data;
            this.index = index;
        }

        @Override
        public String toString() {
            return String.format("(%s, %s, %s)", type.name(), data, index);
        }
    }

    public static List<Token> lex(String input) {
        List<Token> tokens = new ArrayList<>();
        int pos = 0;
        while (pos < input.length()) {
            boolean match = false;
            for (TokenType tokenType : TokenType.values()) {
                Matcher matcher = tokenType.pattern.matcher(input.substring(pos));
                if (matcher.find()) {
                    String matchedData = matcher.group().trim();
                    tokens.add(new Token(tokenType, matchedData, pos));
                    pos += matcher.end();
                    match = true;
                    break;
                }
            }

            if (!match) {
                throw new RuntimeException("Unexpected character at position " + pos);
            }
        }
        return tokens;
    }

    public static void main(String[] args) {
        try {
            String filePath = "src/calc";
            String input = new String(Files.readAllBytes(Paths.get(filePath)));
            List<Token> tokens = lex(input);
            for (Token token : tokens) {
                System.out.println(token);
            }
        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}