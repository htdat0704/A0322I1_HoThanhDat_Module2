package ss3_array_and_method.bai_tap.min_array;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        for(int index= 0; array.length > index; index++){
            System.out.printf("Nhập giá trị cho mảng ở vị trí hàng %d : ",index);
            int inputValue = input.nextInt();
            array[index] = inputValue;
        }

        int min = array[0];

        for(int index =0; array.length > index; index ++){
            if(min > array[index]){
                min = array[index];
            }
        }

        System.out.println("The smallest element in the array is: " + min);
    }
}
