package ss2_loop_java.bai_tap.hien_thi_20_so_nguyen_to;

import java.util.Scanner;

public class ShowNumber {
    public static void main(String[] args) {

        int numbers = 20,n,number=2,counter;

        while (numbers> 0){
            counter = 1;
            for(n=2 ; n < number ; n ++){
                if(number%n==0){
                    counter++;
                }
            }
            if(counter == 1){
                numbers--;
                System.out.print(number +" ");
            }

            number++;
        }


    }
}
