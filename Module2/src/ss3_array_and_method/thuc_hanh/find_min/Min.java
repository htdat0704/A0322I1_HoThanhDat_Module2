package ss3_array_and_method.thuc_hanh.find_min;

public class Min {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int min = minArray(arr);
        System.out.println("The smallest element in the array is: " + min);
    }
    public static int minArray(int[] array){
        int min = array[0];
        for( int index = 0; index < array.length; index ++){
            if(array[index] < min){
                min = array[index];
            }
        }
        return  min;
    }
}
