package ss10_stackuseLinkedlist.thuc_hanh.stack_arr;

import java.util.EmptyStackException;

public class MyStackArr {
    private int[] arr;
    private int index;
    private int size;

    public MyStackArr(int size){
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()){
            throw new IndexOutOfBoundsException();
        } else {
            arr[index++] = element;
        }
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int ouput = arr[index-1];
        arr[--index] = 0;
        return ouput;
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        if(index == 0)return  true;
        else return false;
    }

    public boolean isFull(){
        if(index == size) return  true;
        else return false;
    }

    public static void main(String[] args) {
        MyStackArr stack = new MyStackArr(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }


}
