package ss13_thuat_toan_sap_xep.thuc_hanh.chon;

import java.util.Arrays;

public class SelectionSort {

    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5, 7};

    public static void selectionSort(double[] arr){
        for(int i =0; i < arr.length-1; i++){

            int min = i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            if(min != i){
                double temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
