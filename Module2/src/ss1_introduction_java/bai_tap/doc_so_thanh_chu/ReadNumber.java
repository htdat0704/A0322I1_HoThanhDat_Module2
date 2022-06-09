package ss1_introduction_java.bai_tap.doc_so_thanh_chu;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        System.out.println("Enter your number:");
        Scanner numberInput = new Scanner(System.in);
        short number = numberInput.nextShort();

        if(number < 100){
            numberLessThan100(number);
        }else if(number < 1000){
            int hundreds = number/100;
            int tens = number%100;
            switch (hundreds){
                case 1:
                    System.out.print("one hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 2:
                    System.out.print("two hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 3:
                    System.out.print("three hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 4:
                    System.out.print("four hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 5:
                    System.out.print("five hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 6:
                    System.out.print("six hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 7:
                    System.out.print("seven hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 8:
                    System.out.print("eight hundred and ");
                    numberLessThan100((short) tens);
                    break;
                case 9:
                    System.out.print("nine hundred and ");
                    numberLessThan100((short) tens);
                    break;
            }

        }else{
            System.out.println("out of ability");
        }


    }

    public static void numberLessThan100(short number){
        if(number < 10){
            switch (number){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }else if(number < 20){
            int ones = number%10;
            switch (ones){
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }else if( number < 100){
            int ones = number%10;
            int tens = number/10;
            switch (tens){
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            if(ones != 0){
                switch (ones){
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }

        }
    }
}
