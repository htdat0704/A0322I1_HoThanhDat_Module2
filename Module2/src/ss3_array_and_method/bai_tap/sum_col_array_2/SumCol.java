package ss3_array_and_method.bai_tap.sum_col_array_2;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array;
        int i,j,value,sum = 0,colForSum = 0;

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

        do{
            System.out.print("Enter Col u want to sum all: ");
            colForSum = scanner.nextInt();
            if(colForSum >= array[0].length){
                System.out.println("ENTER AGAIN COL is to big pls less than "+array[0].length);
            }
        }while (colForSum >= (array[0].length));

        for(i = 0; i < array.length; i++){
            for (j = 0; j < array[i].length; j++){
                if(j == colForSum){
                    sum += array[i][j];
                }
            }
        }

        System.out.printf("SUM COL %d is %d ",colForSum,sum);

    }
}
