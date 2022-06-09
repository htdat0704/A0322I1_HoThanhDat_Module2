package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class AreaHCN {
    public static void main(String[] args) {

        System.out.print("Nhập chiều rộng hình chữ nhật = ");
        Scanner row = new Scanner(System.in);
        byte rowInput  = row.nextByte();

        System.out.print("Nhập chiều cao hình chữ nhật = ");
        Scanner col = new Scanner(System.in);
        byte colInput  = col.nextByte();

        System.out.printf("Diện tích hình chữ nhật là = %d",(colInput*rowInput));

    }
}
