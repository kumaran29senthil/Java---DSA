// Implementation of Stack Using Array in Java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("The Size of the stack is "+stack.size());
        System.out.println("The topmost element in the stack is "+stack.peek());
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
