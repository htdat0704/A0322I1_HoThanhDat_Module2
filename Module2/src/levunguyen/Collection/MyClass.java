package levunguyen.Collection;

import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
//        addAll(): thêm một hoặc nhiều phần tử vào tập hợp.
        Collections.addAll(myList, 1,1,5,4,6);
        System.out.println(myList.toString());
//        sort(): sắp xếp các phần tử của tập hợp.
        Collections.sort(myList);
        System.out.println(myList.toString());
//        binarySearch(): tìm kiếm nhị phân
        System.out.println(Collections.binarySearch(myList,4));
//        reverse(): đảo ngược các phần tử trong tập hợp.
        Collections.reverse(myList);
        System.out.println(myList.toString());
//        shuffle(): xáo trộn các phần tử trong tập hợp.
//        Collections.shuffle(myList);
//        System.out.println(myList.toString());
//        Collections.shuffle(myList);
//        System.out.println(myList.toString());
//        replaceAll(): thay thế phần tử trong tập hợp bằng một phần tử khác.
        Collections.replaceAll(myList,1, 100);
        System.out.println(myList.toString());
    }
}
