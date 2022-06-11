package ss4_class_and_object.bai_tap.QuadraticEquation;

import ss4_class_and_object.thuc_hanh.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a for Rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b for Rectangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c for Rectangle: ");
        double c = scanner.nextDouble();

        quadraticEquation = new QuadraticEquation(a,b,c);

        System.out.println(quadraticEquation.Display());
    }
}
