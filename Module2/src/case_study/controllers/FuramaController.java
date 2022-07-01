package case_study.task1.controllers;

import case_study.task1.models.Employee;
import case_study.task1.services.EmployeeServiceImpl;
import java.util.*;

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
            choseMenu = displayMainMenu();
            choseMenu(choseMenu);
        }while (choseMenu != 6);
    }

    public static void choseMenu(int choseMenu) {
        int choseMenuAfter = -1;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        switch (choseMenu){
            case 1:
                do{
                    choseMenuAfter = employeeManagement();
                    if(choseMenuAfter == 1){
                        employeeService.showEmployee();
                    }else if(choseMenuAfter == 2){
                        Employee newEmployee = enterNewEmployee(scanner, scannerString);
                        employeeService.addEmployee(newEmployee);
                    }else if(choseMenuAfter == 3){
                        System.out.println("Enter ID for Employee want Edit: ");
                        int poisitionArrayList = scanner.nextInt();
                        if(poisitionArrayList >= employeeService.sizeEmployee()){
                            System.out.println("No infor about Employee have ID "+poisitionArrayList);
                            break;
                        }
                        Employee employeeEdit = employeeService.getEmployee(poisitionArrayList);
                        int choseMenuEdit =-1;
                        do{
                            System.out.println("Infor about employee in position "+poisitionArrayList+ " is:");
                            System.out.println(employeeEdit.toString());
                            System.out.println("Chose on Menu Edit Employee  :");
                            System.out.println("1.\tChange the employee in ID "+poisitionArrayList+" to the new employee");
                            System.out.println("2.\tChange properties in ID "+poisitionArrayList);
                            System.out.println("3.\tReturn Employee menu");
                            choseMenuEdit = scanner.nextInt();
                            switch (choseMenuEdit){
                                case 1:
                                    Employee newEmployee = enterNewEmployee(scanner, scannerString);
                                    employeeService.editEmployee(poisitionArrayList,newEmployee);
                                    break;
                                case 2:
                                    int choseMenuEditAfter = -1;
                                    do{
                                        choseMenuEditAfter = getChoseMenuEditEmployee(scanner, poisitionArrayList, employeeEdit);
                                        chosePropertiesEditEmployee(scanner, scannerString, employeeEdit, choseMenuEditAfter);
                                    }while (choseMenuEditAfter != 11);
                            }
                        }while (choseMenuEdit != 3);
                    }
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

    public static Employee enterNewEmployee(Scanner scanner, Scanner scannerString) {
        System.out.println("Enter code for new Employee: ");
        String code = scannerString.nextLine();
        System.out.println("Enter name for new Employee: ");
        String name = scannerString.nextLine();
        System.out.println("Enter Date of birth for new Employee: ");
        String date = scannerString.nextLine();
        System.out.println("Enter CMND for new Employee : ");
        String cmnd = scannerString.nextLine();
        System.out.println("Enter email for new Employee : ");
        String email = scannerString.nextLine();
        System.out.println("Enter level for new Employee : ");
        String level = scannerString.nextLine();
        System.out.println("Enter position for new Employee : ");
        String position = scannerString.nextLine();
        System.out.println("Enter gender for new Employee (true: man / false: women) : ");
        boolean gender = scannerString.nextBoolean();
        System.out.println("Enter SDT for new Employee : ");
        int SDT = scanner.nextInt();
        System.out.println("Enter salary for new Employee : ");
        double salary = scanner.nextDouble();
        return new Employee(code,name,date,gender,cmnd,SDT,email,level,position,salary);
    }

    public static void chosePropertiesEditEmployee(Scanner scanner, Scanner scannerString, Employee employeeEdit, int choseMenuEdit) {
        switch (choseMenuEdit){
            case 1:
                System.out.println("Enter name for new Employee: ");
                String name = scannerString.nextLine();
                employeeEdit.setName(name);
                break;
            case 2:
                System.out.println("Enter code for new Employee: ");
                String code = scannerString.nextLine();
                employeeEdit.setCode(code);
                break;
            case 3:
                System.out.println("Enter Date of birth for new Employee: ");
                String date = scannerString.nextLine();
                employeeEdit.setDateOfBirth(date);
                break;
            case 5:
                System.out.println("Enter CMND for new Employee : ");
                String cmnd = scannerString.nextLine();
                employeeEdit.setCMND(cmnd);
                break;
            case 4:
                System.out.println("Enter gender for new Employee (true: man / false: women) : ");
                boolean gender = scanner.nextBoolean();
                employeeEdit.setGender(gender);
                break;
            case 6:
                System.out.println("Enter SDT for new Employee : ");
                int SDT = scanner.nextInt();
                employeeEdit.setSDT(SDT);
                break;
            case 7:
                System.out.println("Enter email for new Employee : ");
                String email = scannerString.nextLine();
                employeeEdit.setEmail(email);
                break;
            case 8:
                System.out.println("Enter level for new Employee : ");
                String level = scannerString.nextLine();
                employeeEdit.setLevel(level);
                break;
            case 9:
                System.out.println("Enter position for new Employee : ");
                String position = scannerString.nextLine();
                employeeEdit.setPosition(position);
                break;
            case 10:
                System.out.println("Enter salary for new Employee : ");
                double salary = scanner.nextDouble();
                employeeEdit.setSalary(salary);
                break;
        }
    }

    public static int getChoseMenuEditEmployee(Scanner scanner, int poisitionArrayList, Employee employeeEdit) {
        int choseMenuEdit;
        System.out.println("Chose on Menu Edit Employee "+poisitionArrayList+": ");
        System.out.println("1\tEdit name ("+employeeEdit.getName()+")");
        System.out.println("2\tEdit code ("+employeeEdit.getCode()+")");
        System.out.println("3\tEdit date ("+employeeEdit.getDateOfBirth()+")");
        System.out.println("4\tEdit gender ("+employeeEdit.getGender()+")");
        System.out.println("5\tEdit cmnd ("+employeeEdit.getCMND()+")");
        System.out.println("6\tEdit SDT ("+employeeEdit.getSDT()+")");
        System.out.println("7\tEdit email ("+employeeEdit.getEmail()+")");
        System.out.println("8\tEdit level ("+employeeEdit.getLevel()+")");
        System.out.println("9\tEdit position ("+employeeEdit.getPosition()+")");
        System.out.println("10\tEdit salary ("+employeeEdit.getSalary()+")");
        System.out.println("11\tReturn main menu");
        choseMenuEdit = scanner.nextInt();
        return choseMenuEdit;
    }
}
