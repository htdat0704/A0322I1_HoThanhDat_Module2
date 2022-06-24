import java.util.*;

public class Test {

    public static LinkedList<String> compare_two_linked_lists (LinkedList<String> linkedList1,LinkedList<String> linkedList2) {
        int loop = Math.max(linkedList1.size(), linkedList2.size());
        LinkedList<String> linkedListNew = new LinkedList<String>();
        for(int i = 0; i < loop; i++){
            if(linkedList1.get(i).equals(linkedList2.get(i))){
                linkedListNew.add("YES");
            }else{
                linkedListNew.add("NO");
            }
        }
        return linkedListNew;
    }

    public static void main(String args[]) {

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Java");
        linkedList1.add("PHP");
        linkedList1.add("Python");
        linkedList1.add("Ruby");

        LinkedList<String> linkedList2= new LinkedList<>();
        linkedList1.add("Java");
        linkedList1.add("Js");
        linkedList1.add("Ruby");

        //LinkedList<String> linkedList = compare_two_linked_lists(linkedList1,linkedList2);
        System.out.println(linkedList1.get(0).equals(linkedList2.get(0)));







    }
}
