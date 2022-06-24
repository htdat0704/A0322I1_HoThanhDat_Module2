package ss9_dsa_danh_sach.thuc_hanh.LinkedList;

public class MyLinkedList {
    private Node head;
    private int numbsNode = 0;

    public void MyLinkedList(Object o){
        head = new Node(o);
    }

    public class Node{
        private Node next;
        private Object data;

        public Object getData() {
            return data;
        }

        public Node(Object o){
            this.data = o;
        }
    }

    public boolean contains(Object o){
        Node temp = head;
        for(int i=0; i<= numbsNode; i++){
            if(temp.getData().equals(o)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void  addLast (Object o){
        Node temp = head;
        for(int i =0; i< numbsNode; i++){
            temp= temp.next;
        }
        temp.next = new Node(o);
        numbsNode++;
    }

    public void addFirst (Object o){
        Node temp = head.next;
        head = new Node(o);
        head.next = temp;
        numbsNode++;
    }
}
