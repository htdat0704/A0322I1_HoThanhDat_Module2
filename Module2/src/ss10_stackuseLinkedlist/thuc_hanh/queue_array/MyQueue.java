package ss10_stackuseLinkedlist.thuc_hanh.queue_array;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int sizeArr){
        this.capacity = sizeArr;
        queueArr = new int[sizeArr];
    }

    public boolean isQueueFull(){
        if(currentSize == capacity) return true;
        else return false;
    }

    public boolean isQueueEmpty(){
        if(currentSize == 0) return true;
        else return false;
    }

    public void enqueue(int item){
        if(currentSize == capacity){
            throw new IndexOutOfBoundsException();
        }else if(currentSize ==0){
            queueArr[currentSize++] = item;
            this.head = this.tail = item;
        }else{
            queueArr[currentSize++] = item;
            this.tail = item;
        }
    }

    public void dequeue(){
        if(currentSize == 0){
            throw new EmptyStackException();
        }else{
            if(currentSize == 1){
                queueArr[0] = head = tail = 0;
                currentSize--;
            }else{
                queueArr[--currentSize]=0;
                this.tail = queueArr[currentSize-1];
            }
        }
    }

    public String toString(){
        return Arrays.toString(queueArr);
    }

    public static void main(String[] args) {

        MyQueue queue = new MyQueue(6);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        queue.dequeue();
        System.out.println(queue);

    }
}
