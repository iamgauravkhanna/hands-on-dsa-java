package data_structures.stack;

import java.util.Stack;

public class StackExample1 {

    public static void main(String args[]){

        Stack<Integer> stack = new Stack<>();

        System.out.println("Empty dsa.stack : "  + stack);

        System.out.println("Empty dsa.stack : "  + stack.isEmpty());

        stack.push(1001);

        stack.push(1002);

        stack.push(1003);

        stack.push(1004);

        System.out.println("Non-Empty dsa.stack : "  + stack);

        System.out.println("Non-Empty dsa.stack: Pop Operation : "  + stack.pop());

        System.out.println("Non-Empty dsa.stack : After Pop Operation : "  + stack);

        System.out.println("Non-Empty dsa.stack : search() Operation for value 1002 : "  + stack.search(1002));

        System.out.println("Non-Empty dsa.stack : "  + stack.isEmpty());

    }
}
