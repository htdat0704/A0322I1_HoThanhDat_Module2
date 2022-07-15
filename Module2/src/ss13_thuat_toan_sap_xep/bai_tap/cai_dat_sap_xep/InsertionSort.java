package ss13_thuat_toan_sap_xep.bai_tap.cai_dat_sap_xep;

import java.util.Arrays;

public class InsertionSort {

    static int[] list = {2, 4, 7, 10, 11, 12, 50, 59, 60, 70, 69, 70, 32, -2};

    public static  void insertionSort(int[] list){
        for(int i =1; i< list.length; i++){
            int pos = i;
            int x = list[i];
            while (pos > 0 && x < list[pos -1]){
                list[pos  ]=list[pos-1];
                pos--;
            }
            list[pos] =x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
