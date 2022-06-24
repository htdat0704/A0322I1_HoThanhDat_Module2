package ss10_stackuseLinkedlist.bai_tap.queue_circle;

import java.util.EmptyStackException;

public class MyQueueCircle {
    private Node front;
    private Node rear;
    private int numbNodes;

    public MyQueueCircle(){
        front = rear = null;
    }

    public class Node{
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }

        public int getData(){
            return this.data;
        }
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if(front == null){
            front = rear = temp;
            numbNodes++;
        }else{
            rear.link = temp;
            rear = temp;
            rear.link = front;
            numbNodes++;
        }
    }

    public void deQueue(){
        if(front == null){
            throw new EmptyStackException();
        }else if(front == rear){
            front = rear = null;
            numbNodes--;
        }else{
            front = front.link;
            rear.link = front;
            numbNodes--;
        }
    }

    public void displayQueue(){
        if(front == null){
            System.out.println("Empty");
        }else{
            Node temp = front;
            for(int i = 0;  i<numbNodes; i++){
                System.out.println(temp.getData());
                temp= temp.link;
            }
        }
    }

    public static void main(String[] args) {
        MyQueueCircle myQueueCircle = new MyQueueCircle();
        myQueueCircle.enQueue(3);
        myQueueCircle.enQueue(34);
        myQueueCircle.enQueue(35);
        myQueueCircle.deQueue();
        myQueueCircle.enQueue(36);
        myQueueCircle.enQueue(37);
        myQueueCircle.deQueue();
        myQueueCircle.deQueue();
        myQueueCircle.deQueue();
        myQueueCircle.displayQueue();
    }
}
