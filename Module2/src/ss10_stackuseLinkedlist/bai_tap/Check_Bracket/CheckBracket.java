package ss10_stackuseLinkedlist.bai_tap.Check_Bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<Character> stackBracketLeft = new Stack<>();
        Stack<Character> stackBracketRight = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi gì đó có Bracket() :");
        String str = scanner.nextLine();

        char leftBracket = '(';
        char rightBracket = ')';

        for(int i =0; i< str.length(); i++){
            if(str.toLowerCase().charAt(i)==leftBracket){
                stackBracketLeft.add(leftBracket);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i)==rightBracket){
                stackBracketRight.add(rightBracket);
            }
        }

        if(stackBracketLeft.isEmpty()){
            System.out.println("Chuỗi have no bracket Left '(' => FALSE");
        }else if(stackBracketRight.isEmpty()){
            System.out.println("Chuỗi have no bracket Right ')' => FALSE");
        }else{
            if(stackBracketLeft.size() != stackBracketRight.size()){
                System.out.println("Số lượng bracket Right and Left không bằng nhau => FALSE");
            }else{
                System.out.println("Số lượng bracket Right and Left bằng nhau => TRUE");
            }
        }
    }
}
