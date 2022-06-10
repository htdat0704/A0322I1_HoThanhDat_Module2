package ss3_array_and_method.bai_tap.find_max_array2;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số hàng cho matrix: ");
        int inputRow = input.nextInt();

        System.out.print("Nhập số cột cho matrix: ");
        int inputCol = input.nextInt();

        int[][] arrayMatrix = new int[inputRow][inputCol];

        for(int i =0; i< arrayMatrix.length; i++){
            for(int j=0; j< arrayMatrix[i].length; j++){
                System.out.printf("Nhập giá trị cho matrix ở vị trí hàng %d cột %d: ",i,j);
                int inputValue = input.nextInt();
                arrayMatrix[i][j] = inputValue;
            }
        }

        int max = arrayMatrix[0][0];
        int positionX = 0;
        int positionY = 0;

        for(int i =0; i< arrayMatrix.length; i++){
            for(int j=0; j< arrayMatrix[i].length; j++){
                if(max < arrayMatrix[i][j]){
                    max = arrayMatrix[i][j];
                    positionX = i;
                    positionY = j;
                }
            }
        }

        System.out.printf("Phần tử lớn nhất trong mảng là phần tử %d ở vị trí hàng %d cột %d"
                ,max,positionX,positionY);
    }
}
