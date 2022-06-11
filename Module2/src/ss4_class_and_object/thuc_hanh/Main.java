package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập heigth for Rectangle: ");
        double height = scanner.nextDouble();
        System.out.print("Nhập weight for Rectangle: ");
        double weight = scanner.nextDouble();

        rectangle = new Rectangle(weight,height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
