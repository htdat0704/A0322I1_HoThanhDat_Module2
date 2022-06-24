package case_study.task1.controllers;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static int displayMainMenu(){
        System.out.println("Chose on Menu: ");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management ");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int employeeManagement (){
        System.out.println("Chose on Menu Employee Management :");
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tEdit employee");
        System.out.println("4\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int customerManagement  (){
        System.out.println("Chose on Menu Customer Management  :");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int facilityManagement   (){
        System.out.println("Chose on Menu Facility Management  :");
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int bookingManagerment   (){
        System.out.println("Chose on Menu Booking Managerment   :");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new constracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static int promotionManagement    (){
        System.out.println("Chose on Menu Promotion Management   :");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        int chose = scanner.nextInt();
        return chose;
    }

    public static void main(String[] args) {
        int choseMenu, choseMenuAfter = -1;
        do {
            System.out.println("Enter chose: ");
            choseMenu = displayMainMenu();
            choseMenu(choseMenu);
        }while (choseMenu != 6);
    }

    public static void choseMenu(int choseMenu) {
        int choseMenuAfter = -1;
        switch (choseMenu){
            case 1:
                do{
                    choseMenuAfter = employeeManagement();
                }while (choseMenuAfter != 4);
                break;
            case 2:
                do{
                    choseMenuAfter = customerManagement();
                }while (choseMenuAfter != 4);
                break;
            case 3:
                do{
                    choseMenuAfter = facilityManagement();
                }while (choseMenuAfter != 4);
                break;
            case 4:
                do{
                    choseMenuAfter = facilityManagement();
                }while (choseMenuAfter != 6);
                break;
            case 5:
                do {
                    choseMenuAfter = promotionManagement();
                }while (choseMenuAfter != 3);
                break;
            case 6:
                System.out.println("Out of Menu");
                break;
        }
    }
}
