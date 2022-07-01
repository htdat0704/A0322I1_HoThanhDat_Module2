package ss9_dsa_danh_sach.bai_tap.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myLists = new MyList<Integer>();
        myLists.add(2);
        myLists.add(3);
        myLists.add(4);
        myLists.add(5);
        myLists.add(6);
        myLists.add(7);
        myLists.add(8);
        myLists.add(10);
        myLists.add(9);
        System.out.println(myLists);
        myLists.add(2,2323);
        System.out.println(myLists);
        MyList<Integer> newList =myLists.clone();
        System.out.println(newList);
//        myLists.add(8);
//        myLists.add(8);
//        System.out.println(myLists);
//        System.out.println(myLists.indexOf(8));
//        System.out.println(myLists.get(2));
    }
}
