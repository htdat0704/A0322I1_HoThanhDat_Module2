package ss9_dsa_danh_sach.thuc_hanh.list_don_gian;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.set(6,2242);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        System.out.println("element 0: "+listInteger.get(5));

        System.out.println(listInteger);

    }
}
