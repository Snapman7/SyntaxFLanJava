import java.util.List;

abstract class ASTNode {
    // Abstract method to print the node
    abstract void print(int depth);

    // Helper method to print indents
    void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
    }
}

class LiteralNode extends ASTNode {
    Object value;

    public LiteralNode(Object value) {
        this.value = value;
    }

    @Override
    void print(int depth) {
        printIndent(depth);
        System.out.println(value);
    }
}

class AtomNode extends ASTNode {
    String name;

    public AtomNode(String name) {
        this.name = name;
    }

    @Override
    void print(int depth) {
        printIndent(depth);
        System.out.println(name);
    }
}

class FunctionCallNode extends ASTNode {
    String functionName;
    List<ASTNode> arguments;

    public FunctionCallNode(String functionName, List<ASTNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    void print(int depth) {
        printIndent(depth);
        System.out.println(functionName);
        for (ASTNode arg : arguments) {
            arg.print(depth + 1);
        }
    }
}