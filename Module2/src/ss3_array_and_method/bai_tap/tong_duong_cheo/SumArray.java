package ss3_array_and_method.bai_tap.tong_duong_cheo;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array;
        int i,j,value,sum = 0;

        System.out.print("Enter row for Array: ");
        int row = scanner.nextInt();

        System.out.print("Enter col for Array: ");
        int col = scanner.nextInt();

        array = new int[row][col];

        for(i = 0; i < array.length; i++){
            for (j = 0; j < array[i].length; j++){
                System.out.printf("Enter value for Array in row %d and col %d: ",i,j);
                value = scanner.nextInt();
                array[i][j] = value;
            }
        }

        for(i = 0; i < array.length; i++){
            for (j = 0; j < array[i].length; j++){
                if(i == j){
                    sum += array[i][j];
                    break;
                }
            }
        }

        System.out.println("Diagonal Line of Array is: "+sum);
    }
}
