package ss10_stackuseLinkedlist.bai_tap.check_palindrome;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Queue<Character> queue = new ArrayDeque<>();
        Queue<Character> queue1 = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập chuỗi gì đó xem có phải Palindrome không :");
        String str = scanner.nextLine();

        for(int i =0; i< str.length()/2; i++){
            queue.add(str.toLowerCase().charAt(i));
        }

        boolean check = false;

        for(int i = str.length()-1; i > str.length()/2; i--){
            queue1.add(str.toLowerCase().charAt(i));
        }

        while (!queue.isEmpty()){
            if(queue.poll().equals(queue1.poll())){
                check = true;
            }else{
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("Chuỗi "+str+" là chuỗi Palindrome");
        }else{
            System.out.println("Chuỗi "+str+" không phải là chuỗi Palindrmoe");
        }
    }
}
