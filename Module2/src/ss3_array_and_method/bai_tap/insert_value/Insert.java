package ss3_array_and_method.bai_tap.insert_value;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,9,2,0,0,0,0,0};
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập phần tử thêm vào: ");
        int valueInsert = input.nextInt();

        System.out.print("Nhập vị trí thêm vào trong mảng: ");
        int indexInsert = input.nextInt();

        if(indexInsert <= -1 && indexInsert >= array.length-1){
            System.out.println("Không chèn được phần tử trong mảng");
        }else{
            for(int index = array.length-1; index > indexInsert; index--){
                array[index] = array[index-1];
            }

            array[indexInsert] = valueInsert;

            for (int value : array){
                System.out.print(value+ " ");
            }
        }


    }
}
