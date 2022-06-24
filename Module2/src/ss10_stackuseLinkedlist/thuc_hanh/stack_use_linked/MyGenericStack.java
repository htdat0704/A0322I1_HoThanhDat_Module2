package ss10_stackuseLinkedlist.thuc_hanh.stack_use_linked;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList stacks;

    public MyGenericStack(){
        stacks = new LinkedList();
    }

    public void push (T element){
        stacks.addFirst(element);
    }

    public void pop(){
        if(stacks.size() == 0){
            throw new EmptyStackException();
        }
        stacks.removeFirst();
    }

    public int size(){
        return stacks.size();
    }

    public boolean isEmpty(){
        if( stacks.size()==0 )return true;
        else return false;
    }

    public Object peek(){
        return stacks.getFirst();
    }

    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        stackOfIStrings();
    }
}
