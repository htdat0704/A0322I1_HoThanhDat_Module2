package ss10_stackuseLinkedlist.bai_tap.count_x_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountOnTreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> myTreeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi gì đó đếm cho ký tự của chuỗi đó :");
        String str = scanner.nextLine();

        for(int i =0; i < str.length(); i ++){
            char charAt = str.toLowerCase().charAt(i);
            if(myTreeMap.get(charAt) != null){
                int count= myTreeMap.get(charAt);
                myTreeMap.put(charAt,++count);
            }else{
                myTreeMap.put(charAt,1);
            }
        }

        System.out.println("Số lượng các ký tự có trong chuỗi là:");
        System.out.println(myTreeMap);

    }
}
