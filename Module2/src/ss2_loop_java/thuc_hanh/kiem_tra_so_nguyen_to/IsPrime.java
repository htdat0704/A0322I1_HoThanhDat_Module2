package ss2_loop_java.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner numberInput = new Scanner(System.in);
        int number = numberInput.nextInt();

        boolean checkPrime = true;

        for(int i = 2; i< number; i++){
            if(number%i == 0){
                checkPrime = false;
                break;
            }
        }

        if(checkPrime){
            System.out.printf("%d is Prime",number);
        }else{
            System.out.printf("%d is not Prime",number);
        }
    }
}
