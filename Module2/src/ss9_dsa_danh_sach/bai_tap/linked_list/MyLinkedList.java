package ss9_dsa_danh_sach.bai_tap.linked_list;

public class MyLinkedList {
    private Node head;
    private int numbNodes = 0;

    public MyLinkedList(Object o){
        head = new Node(o);
    }

    public void addFirst(Object o){
        Node temp = head;
        head = new Node(o);
        head.next =  temp;
        numbNodes ++;
    }

    public void addLast(Object o){
        Node temp = head;
        for(int i =0; i < numbNodes; i++){
            temp = temp.next;
        }
        temp.next = new Node(o);
        numbNodes++;
    }

    public void remove(int index){
        Node temp = head;
        Node holder =null;

        if(index == 0){
            holder = temp.next;
            head = holder;
            numbNodes--;
        }else if(index == numbNodes){
            for(int i =0; i< index-1; i++){
                temp = temp.next;
            }
            temp.next = null;
            numbNodes--;
        }else{
            for(int i =0; i< index-2; i++){
                temp = temp.next;
            }
            holder = temp.next.next;
            temp.next = holder;
            numbNodes --;
        }
    }

    public void remove(Object e){
        Node temp = head;
        Node holder = null;

        for(int i=0; i< numbNodes; i++){
            if(head.getData().equals(e)){
                holder = temp.next;
                break;
            }
            if(temp.next.getData().equals(e)){
                holder = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        if(temp.equals(head)){
            head= holder;
            numbNodes --;
        }else if(holder == null){
            temp.next = null;
            numbNodes --;
        }else{
            temp.next = holder;
            numbNodes --;
        }

    }

    public int size(){
        return numbNodes+1;
    }

    public boolean contains(Object o){
        Node temp = head;
        boolean check = false;
        for(int i =0; i< numbNodes; i++){
            if(temp.getData().equals(o)){
                check = true;
                break;
            }
            temp=temp.next;
        }
        return check;
    }

    public int indexOf(Object o){
        Node temp = head;
        int position = -1;
        for(int i =0; i< numbNodes; i++){
            if(temp.getData().equals(o)){
                position = i;
                break;
            }
            temp=temp.next;
        }
        return position;
    }

    public void add(int index,Object o){
        Node temp = head;
        Node holder;
        for(int i =0; i< index -1; i++){
            temp= temp.next;
        }
        holder = temp.next;
        temp.next = new Node(o);
        temp.next.next = holder;
        numbNodes++;
    }

    public Object get(int index ){
        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.getData();
    }

    public Object getFirst(){
        return head.getData();
    }

    public Object getLast(){
        Node temp = head;
        for(int i = 0; i < numbNodes; i++){
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clear(){
        head = null;
    }

    public class Node{
        Node next;
        Object data;

        public Node(Object o){
            this.data = o;
        }

        public Object getData() {
            return data;
        }

    }
}
