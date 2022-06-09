package ss2_loop_java.thuc_hanh.tinh_tien_cho_vay;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        System.out.print("Nhập số tiền gửi : ");
        Scanner tienGuiNhap = new Scanner(System.in);
        double tienGui = tienGuiNhap.nextDouble();

        System.out.print("\n Nhập tỉ lệ lãi suất theo năm (%) : ");
        Scanner laiSuatNhap = new Scanner(System.in);
        double laiSuat = laiSuatNhap.nextDouble();

        System.out.print("\n Số tháng gửi : ");
        Scanner soThangNhap = new Scanner(System.in);
        double soThang = soThangNhap.nextDouble();

        double tienLai = tienGui * (laiSuat/12)/100 * soThang;

        System.out.printf("Số tiền lãi là %f", tienLai);


    }
}
