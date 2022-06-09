package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {

        System.out.println("Phương  trình bậc nhất ax + b = c ");

        System.out.print("Nhập a = ");
        Scanner a = new Scanner(System.in);
        double aInput  = a.nextDouble();

        System.out.print("Nhập b = ");
        Scanner b = new Scanner(System.in);
        double bInput  = b.nextDouble();

        System.out.print("Nhập c = ");
        Scanner c = new Scanner(System.in);
        double cInput  = c.nextDouble();

        double display = (cInput - bInput)/aInput;

        System.out.printf("x của phương trình bậc nhất là %f",display);
    }
}
