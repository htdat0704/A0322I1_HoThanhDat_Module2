package ss3_array_and_method.thuc_hanh.celsius_fahrenheit;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        Scanner inputTemperature = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = input.nextInt();
            double temperature;
            double convert;
            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    temperature = inputTemperature.nextDouble();
                    convert = fahrenheitToCelsius(temperature);
                    System.out.println("Celsius: "+convert);
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    temperature = inputTemperature.nextDouble();
                    convert = celsiusToFahrenheit(temperature);
                    System.out.println("Fahrenheit: "+convert);
                    break;

            }

        }
    }
    public static double celsiusToFahrenheit(double celsius){
        return ( celsius * 9 / 5 ) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
