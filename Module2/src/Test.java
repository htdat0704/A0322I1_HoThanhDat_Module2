import java.time.LocalDate;
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
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("ab",2);
        map.put(new String("ab"),3);
        map.put(new String("abc"),34);


        for (String strings: map.keySet()){
            System.out.println(map.get(strings));
        }


    }
}
