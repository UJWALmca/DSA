import java.util.Stack;

/**
 * Stack1
 */
public class Stack1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); 
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}