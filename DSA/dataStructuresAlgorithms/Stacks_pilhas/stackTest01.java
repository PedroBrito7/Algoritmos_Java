package dataStructuresAlgorithms.Stacks_pilhas;

import java.util.Stack;

public class stackTest01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("pagina 1");
        stack.push("pagina 2");
        System.out.println(stack.pop());
    }
}
