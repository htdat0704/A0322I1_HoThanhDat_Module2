package ss12_thuat_toan_tim_kiem.bai_tap.tim_nhi_phan;

import java.lang.reflect.Array;
import java.util.*;

public class RecursionBinarySearch {
    static int[] list = {2, 4, 7, 11, 12, 50, 59, 60, 70};

    public int binarySearch(int arr[], int value,int left, int right){
        int mid = (left + right)/2;
        if(right <= left){
            return -1;
        }else{
            if(arr[mid] < value){
                return binarySearch(arr, value,left+1,right);
            }
            if(arr[mid] > value){
                return binarySearch(arr, value,left,right-1);
            }
            if(arr[mid] == value){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RecursionBinarySearch binarySearch = new RecursionBinarySearch();
        System.out.println(binarySearch.binarySearch(RecursionBinarySearch.list,
                48,0,RecursionBinarySearch.list.length));

    }

}
