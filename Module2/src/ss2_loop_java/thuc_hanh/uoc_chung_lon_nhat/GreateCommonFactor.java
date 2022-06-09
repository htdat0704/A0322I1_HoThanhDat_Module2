package ss2_loop_java.thuc_hanh.uoc_chung_lon_nhat;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {

        System.out.print("Nhập số thứ nhất : ");
        Scanner firstNumberInput = new Scanner(System.in);
        int firstNumber = firstNumberInput.nextInt();

        System.out.print("Nhập số thứ hai : ");
        Scanner secondNumberInput = new Scanner(System.in);
        int secondNumber = secondNumberInput.nextInt();

        int min = Math.min(firstNumber, secondNumber);
        int UCLN = 1;

        for(int number = 1; number <= min; number ++){
            if(firstNumber % number == 0 && secondNumber %number == 0){
                UCLN = number;
            }
        }

        System.out.printf("UWCLN của 2 số %d và %d là %d",firstNumber,secondNumber,UCLN);
    }
}
