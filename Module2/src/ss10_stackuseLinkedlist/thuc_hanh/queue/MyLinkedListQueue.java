package ss10_stackuseLinkedlist.thuc_hanh.queue;

import java.util.EmptyStackException;

public class MyLinkedListQueue <E>{
    private Node head ;
    private Node tail ;

    public MyLinkedListQueue(){
        head = null;
    }

    public class Node{
        private Node next;
        private Object data;

        public Node(Object o){
            this.data = o;
        }

        public Node(){
        }

        public Object getData() {
            return data;
        }
    }

    public void enqueue(Object o){
        Node temp = new Node(o);

        if(this.head == null){
            this.head = this.tail = temp;
        }else{
            this.tail.next = temp;
            this.tail = temp;
        }

    }

    public Node dequeue(){
        if(head == null){
            throw new EmptyStackException();
        }else{
            Node temp = this.head;
            this.head = temp.next;
            if(head == null){
                this.tail = null;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        MyLinkedListQueue<Integer> queue = new MyLinkedListQueue<Integer>();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().getData());
    }
}
