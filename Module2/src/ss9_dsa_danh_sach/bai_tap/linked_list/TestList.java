package ss9_dsa_danh_sach.bai_tap.linked_list;

public class TestList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=/=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addLast(12);
        ll.addLast(14);
        ll.addLast(144);

//        ll.add(4,121);
//        ll.add(4,9323);
//        //ll.remove(2);
//        ll.removeObject(14);
        ll.printList();
        //System.out.println(ll.size());
        //System.out.println(ll.contains(122));
        //System.out.println(ll.get(2).getData());
        System.out.println(ll.indexOf(144));
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        ll.clear();
//        ll.printList();
//        MyLinkedList newll = ll.clone();
//        newll.printList();

    }
}
