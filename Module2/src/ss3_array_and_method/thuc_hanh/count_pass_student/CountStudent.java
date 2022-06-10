package ss3_array_and_method.thuc_hanh.count_pass_student;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size,index,value,count=0;
        int[] array;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter size of array: ");
            size = input.nextInt();
            if(size > 30){
                System.out.println("Less than size 30 pls");
            }
        }while (size > 30);

        array = new int[size];

        for (index = 0; index < array.length ; index++){
            System.out.printf("Nhập điểm học sinh ở vị trí %d : ",index);
            value = input.nextInt();
            array[index] = value;
        }

        for ( int varible : array ){
            if(varible >= 5){
                count ++;
            }
        }

        System.out.println("số học sinh đậu là "+count);


    }
}
