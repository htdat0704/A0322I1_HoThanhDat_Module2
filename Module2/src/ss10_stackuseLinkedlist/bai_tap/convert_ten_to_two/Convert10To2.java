package ss10_stackuseLinkedlist.bai_tap.convert_ten_to_two;

import java.util.Scanner;
import java.util.Stack;

public class Convert10To2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap số cho chuỗi :");
        int decimal = scanner.nextInt();
        int temp = decimal;

        while (temp != 0){
            stack.push(temp%2);
            temp /= 2;
        }

        System.out.println("Số thập phân "+decimal+" chuyển qua hệ nhị phân là :");
        while (!stack.empty()){
            System.out.print(stack.pop());
        }

    }
}
