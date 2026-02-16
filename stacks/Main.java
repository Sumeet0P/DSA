import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // Stack is a data structure that follows the Last In First Out (LIFO)
        // principle.
        // Stores objects in a vertical manner
        // It has two main operations: push (to add an element to the top of the stack)
        // and pop (to remove the top element from the stack)

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("COD");
        stack.push("GOW");

        // String myFavGame = stack.pop();

        // System.out.println(stack.empty());
        // System.out.println(stack.peek());

        System.out.println(stack);
        System.out.println(stack.search("GOW"));
    }
}