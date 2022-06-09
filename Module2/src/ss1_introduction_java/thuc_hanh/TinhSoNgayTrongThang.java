package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {

        System.out.print("Nhập tháng: ");
        Scanner inputThang = new Scanner(System.in);
        byte thang = inputThang.nextByte();

        if(thang <= 12 && thang > 0)
        switch (thang){
            case 9:
            case 4:
            case 6:
            case 11:
                System.out.printf("Tháng %d có 30 ngày",thang);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày",thang);
                break;
            default:
                System.out.printf("Tháng %d có 31 ngày",thang);
        }
    }
}
