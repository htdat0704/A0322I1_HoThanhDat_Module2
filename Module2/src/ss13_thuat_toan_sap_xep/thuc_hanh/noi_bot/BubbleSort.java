package ss13_thuat_toan_sap_xep.thuc_hanh.noi_bot;

import java.util.Arrays;

public class BubbleSort {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    // codes below here

    public static void bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j = arr.length-1; j > 0; j-- ){
                if(arr[j] < arr[j-1]){
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
}
