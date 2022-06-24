package ss10_stackuseLinkedlist.bai_tap.reverse_stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        Stack<Integer> wStackReverse = new Stack<>();

        wStack.push(2);
        wStack.push(23);
        wStack.push(24);
        wStack.push(25);
        wStack.push(26);
        int temp, loop = wStack.size();

        for(int i =0; i< loop; i++){
            temp = wStack.pop();
            wStackReverse.push(temp);
        }

        System.out.println(wStackReverse);
    }
}
