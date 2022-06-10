package ss3_array_and_method.bai_tap.del_value;

import java.util.Scanner;

public class DelValue {
    public static void main(String[] args) {
        int[] array = {2,3,1,4,5,6,7,8,9,1};

        System.out.print("Xóa phần tử X : ");
        Scanner inputDel = new Scanner(System.in);
        int del = inputDel.nextInt();

        for(int index= 0; index < array.length; index++ ){
            if(array[index] == del){
                for(int i = index; i < array.length; i++){
                    if(i == array.length-1){
                        array[i] = 0;
                        continue;
                    }
                    array[i] = array[i+1];
                }
            }
        }

        for (int value : array){
            System.out.print(value);
        }

    }
}
