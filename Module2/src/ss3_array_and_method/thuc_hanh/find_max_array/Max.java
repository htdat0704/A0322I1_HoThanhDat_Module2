package ss3_array_and_method.thuc_hanh.find_max_array;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int[] arrayMoney = new int[20];

        for(int index = 0; index < arrayMoney.length; index++){
            System.out.print("Nhập tài sản tì phú ở vị trí "+index+" của mảng: ");
            Scanner inputValue = new Scanner(System.in);
            int value = inputValue.nextInt();
            arrayMoney[index] = value;
        }

        int max = arrayMoney[0];
        int poisiton = 0;

        for(int index = 0; index<arrayMoney.length;index++){
            if(arrayMoney[index]>max){
                max = arrayMoney[index];
                poisiton = index;
            }
        }

        System.out.println("giá trị lớn nhất trong mảng là "+max+" ở vị trị "+poisiton+" trong mảng");
    }
}
