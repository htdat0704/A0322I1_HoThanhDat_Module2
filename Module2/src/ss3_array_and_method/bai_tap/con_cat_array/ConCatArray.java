package ss3_array_and_method.bai_tap.con_cat_array;

import java.util.Scanner;

public class ConCatArray {
    public static void main(String[] args) {

        int arrFirst[] = new int[5];
        int arrSecond[] = new int[6];
        int arrThird[] = new int[arrSecond.length+arrFirst.length];

        Scanner inputValue = new Scanner(System.in);

        for(int index = 0; index < arrFirst.length; index++){
            System.out.print("Mảng 1: Nhập giá trị ở vị trí "+index+" của mảng: ");
            int value = inputValue.nextInt();
            arrFirst[index] = value;
        }

        for(int index = 0; index < arrSecond.length; index++){
            System.out.print("Mảng 2: Nhập giá trị ở vị trí "+index+" của mảng: ");
            int value = inputValue.nextInt();
            arrSecond[index] = value;
        }

        for(int index = 0; index < arrFirst.length; index++){
            arrThird[index] = arrFirst[index];
        }

        for(int index = 0; index < arrSecond.length; index++){
            arrThird[index + arrFirst.length] = arrSecond[index];
        }

        System.out.print("Mảng 3: Gộp của 2 mảng là: ");
        for(int index = 0; index < arrThird.length; index++){
            System.out.print(arrThird[index]+" ");
        }

    }
}
