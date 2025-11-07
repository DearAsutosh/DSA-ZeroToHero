package Collection_Framework.ListInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.push(2));
        System.out.println(stack.push(10));
        System.out.println(stack.push(34));
        System.out.println(stack.push(14));
        System.out.println(stack);
        stack.add(23);
        System.out.println(stack);
        System.out.println((stack.size()));
        stack.addFirst(63);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("Stack = "+stack);
        System.out.println(stack.search(34));
        System.out.println(stack.get(1));


    }
}
