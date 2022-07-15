package ss13_thuat_toan_sap_xep.thuc_hanh.chen;

import java.util.Arrays;

public class InsertionSort {

    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5, 7, -2, 3};

    public static void insertionSort(double[] arr){
        for(int i = 1 ; i < arr.length; i++){

            double x = arr[i];
            int pos = i;

            while (pos > 0 && x < arr[pos -1]){
                arr[pos] = arr[pos-1];
                pos --;
            }

            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
