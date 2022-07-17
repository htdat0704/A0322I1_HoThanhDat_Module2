package ss14_Exception_debug.bai_tap;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done){
            try{
                System.out.println("Input a: ");
                double a = scanner.nextDouble();
                System.out.println("Input b: ");
                double b = scanner.nextDouble();
                System.out.println("Input c: ");
                double c = scanner.nextDouble();
                Triangle triangle = new Triangle(a,b,c);
                done = true;
            }catch (Exception er){
                System.out.println("Exception "+er);
            }
        }
    }
}
