package ss3_array_and_method.thuc_hanh.reverse_value_array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.print("Nhập vào độ dài của mảng: ");
        Scanner inputLengthArray = new Scanner(System.in);
        int lengthArray = inputLengthArray.nextInt();

        int[] array = new int[lengthArray];

        for(int index = 0; index < array.length; index++){
            System.out.print("Nhập giá trị cho phần tử ở vị trí "+index+" của mảng: ");
            Scanner inputValue = new Scanner(System.in);
            int value = inputValue.nextInt();
            array[index] = value;
        }

        for(int index =0; index < (lengthArray/2); index++){
            int swap = array[index];
            array[index] = array[array.length-index-1];
            array[array.length-index-1] = swap;
        }

        System.out.println("Mảng sau khi đảo ngược là: ");
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index]+" ");
        }
    }
}
