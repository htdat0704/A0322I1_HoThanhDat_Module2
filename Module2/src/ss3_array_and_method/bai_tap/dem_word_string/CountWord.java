package ss3_array_and_method.bai_tap.dem_word_string;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        String str = "mot hai ba bon nam sau bay tam chin muoi";
        int count=0;
        String word;
        System.out.print("Nhập từ cần đếm trong chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        for(int index = 0; index < str.length(); index++){
            char wordInStr = str.charAt(index);
            if(Character.toString(wordInStr).equals(word)){
                count++;
            }
        }

        System.out.printf("Số từ %s có trong chuỗi là %d",word,count);
    }
}
