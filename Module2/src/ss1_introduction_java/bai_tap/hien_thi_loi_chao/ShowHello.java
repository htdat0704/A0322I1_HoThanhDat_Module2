package ss1_introduction_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();

        System.out.print("Hello: "+name);

    }
}
