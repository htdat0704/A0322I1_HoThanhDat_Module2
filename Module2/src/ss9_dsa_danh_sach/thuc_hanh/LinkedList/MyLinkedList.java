package ss9_dsa_danh_sach.thuc_hanh.LinkedList;

public class MyLinkedList {
    private Node head;
    private int numbNodes;

    public MyLinkedList(Object o){
        head = new Node(o);
    }

    public class Node{
        private Node next;
        private Object data;

        public Node(Object o){
            this.data = o;
        }

        public Object getData(){
            return this.data;
        }
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addFirst(Object o){
        Node temp = head;
        head = new Node(o);
        head.next = temp;
        numbNodes++;
    }

    public void add(int index, Object o){
        Node temp = head;
        Node holder;

        for(int i =0; i < index-1 && temp.next!= null; i++){
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(o);
        temp.next.next = holder;
        numbNodes++;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
