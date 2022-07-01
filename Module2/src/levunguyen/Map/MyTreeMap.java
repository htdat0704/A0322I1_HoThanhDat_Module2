package levunguyen.Map;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        /*
        - TreeMap không chứa key null.
        - key được sắp xếp (mặc định tăng dần).
         */
        Map<Integer, String> myTreeMap = new TreeMap<>();
//      put(): thêm phần tử
        myTreeMap.put(2,"two");
        myTreeMap.put(1,"one");
        myTreeMap.put(3,"three");
        System.out.println(myTreeMap.size());
//      get(): truy cập phần tử
        System.out.println(myTreeMap.get(myTreeMap.size()));
//      put(): cập nhật lại giá trị của key
        myTreeMap.put(2,"new value");
        System.out.println(myTreeMap.get(2));
//      remove(): xóa phần tử
        myTreeMap.remove(2);
//      duyệt các phần tử
        for(Map.Entry<Integer, String> entry:myTreeMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for(Map.Entry<Integer, String> entry:myTreeMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
