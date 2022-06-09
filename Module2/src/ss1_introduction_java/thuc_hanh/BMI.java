package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        System.out.print("Nhập cân nặng: ");
        Scanner inputWeight = new Scanner(System.in);
        double weight = inputWeight.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        Scanner inputHeight = new Scanner(System.in);
        double height = inputHeight.nextDouble();

        double BMI = weight / (height*height);
        int for1;
        if(BMI < 18.5){
            System.out.printf("Chiều cao %f và cân nặng %f có chỉ số BMI = %f là loại Underweight",
                    height,weight,BMI);
        } else if(BMI < 25){
            System.out.printf("Chiều cao %f và cân nặng %f có chỉ số BMI = %f là loại Normal",
                    height,weight,BMI);
        } else if(BMI < 30){
            System.out.printf("Chiều cao %f và cân nặng %f có chỉ số BMI = %f là loại Overweight",
                    height,weight,BMI);
        } else {
            System.out.printf("Chiều cao %f và cân nặng %f có chỉ số BMI = %f là loại Obese",
                    height,weight,BMI);
        }



    }


}
