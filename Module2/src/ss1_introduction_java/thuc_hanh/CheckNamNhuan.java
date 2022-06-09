package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CheckNamNhuan {
    public static void main(String[] args) {

        System.out.print("Nhập năm: ");
        Scanner inputNam = new Scanner(System.in);
        int nam = inputNam.nextInt();

        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0){
                    System.out.println(nam+" là năm nhuận");
                } else{
                    System.out.println(nam+" không phải là năm nhuận");
                }
            }else{
                System.out.println(nam+" là năm nhuận");
            }
        } else{
            System.out.println(nam+" không phải là năm nhuận");
        }

    }
}
