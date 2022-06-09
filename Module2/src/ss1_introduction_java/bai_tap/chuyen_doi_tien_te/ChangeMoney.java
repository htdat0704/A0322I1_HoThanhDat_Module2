package ss1_introduction_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class ChangeMoney {

    public static void main(String[] args) {

        System.out.println("Enter USD:");
        Scanner USDInput = new Scanner(System.in);

        int USD = USDInput.nextInt();
        int VND = USD * 23000;

        System.out.printf("VND: %d VND change from %d USD",VND,USD);

    }

}
