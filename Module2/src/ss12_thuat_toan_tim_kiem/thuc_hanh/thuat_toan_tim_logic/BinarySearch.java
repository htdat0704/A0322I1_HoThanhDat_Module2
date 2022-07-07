package ss12_thuat_toan_tim_kiem.thuc_hanh.thuat_toan_tim_logic;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    /* codes below here */

    public int binarySearch(int[] arr,int value){
        int mid = (arr.length - 1)/2;
        int hight = arr.length-1;
        int low = 0;
        while (hight >= low){
            if(arr[mid] < value){
                low ++;
            }else if(arr[mid] > value){
                hight --;
            }else{
                return mid;
            }
            mid = (hight+low)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(BinarySearch.list,79));
    }
}
