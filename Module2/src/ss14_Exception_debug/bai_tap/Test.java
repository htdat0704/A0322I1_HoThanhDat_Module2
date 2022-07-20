package ss14_Exception_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done){
            try{
                System.out.println("Input a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Input b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Input c: ");
                double c =  Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(a,b,c);
                done = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
    }
}
