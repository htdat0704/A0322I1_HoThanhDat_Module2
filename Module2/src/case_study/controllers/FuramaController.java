package case_study.controllers;

import case_study.models.*;
import case_study.services.*;

import java.time.LocalDate;
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
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }


    public static int employeeManagement (){
        System.out.println("Chose on Menu Employee Management :");
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tEdit employee");
        System.out.println("4\tReturn main menu");
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }

    public static int customerManagement  (){
        System.out.println("Chose on Menu Customer Management  :");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }

    public static int facilityManagement   (){
        System.out.println("Chose on Menu Facility Management  :");
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tEdit facility");
        System.out.println("4\tDisplay list facility maintenance");
        System.out.println("5\tReturn main menu");
        int chose = Integer.parseInt(scanner.nextLine());
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
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }

    public static int promotionManagement    (){
        System.out.println("Chose on Menu Promotion Management   :");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        int chose = Integer.parseInt(scanner.nextLine());
        return chose;
    }

    public static void main(String[] args) {
        int choseMenu;
        do {
            choseMenu = displayMainMenu();
            choseMenu(choseMenu);
        }while (choseMenu != 6);
    }

    public static void choseMenu(int choseMenu) {
        int choseMenuAfter = -1;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        IEmployeeService employeeService = new EmployeeServiceImpl();
        ICustomerService customerService = new CustomerServiceImpl();
        IFacilityService facilityService = new FacilityServiceImpl();
        IBookingService bookingService = new BookingServiceImpl();
        IContactService contractService = new ContractServiceImpl();
        IPromotionService promotionService = new PromotionServiceImpl();
        switch (choseMenu){
            case 1:
                do{
                    choseMenuAfter = employeeManagement();
                    switch (choseMenuAfter){
                        case 1:
                            employeeService.showEmployee();
                            break;
                        case 2:
                            Employee newEmployee = enterNewEmployee(scanner, scannerString);
                            employeeService.addEmployee(newEmployee);
                            break;
                        case 3:
                            editEmployee(scanner, scannerString, employeeService);
                            break;
                    }
                }while (choseMenuAfter != 4);
                break;
            case 2:
                do{
                    choseMenuAfter = customerManagement();
                    switch (choseMenuAfter){
                        case 1:
                            customerService.showCustomer();
                            break;
                        case 2:
                            Customer newCustomer = enterNewCustomer(scanner, scannerString);
                            customerService.addCustomer(newCustomer);
                            break;
                        case 3:
                            editCustomer(scanner, scannerString, customerService);
                            break;
                    }
                }while (choseMenuAfter != 4);
                break;
            case 3:
                do{
                    choseMenuAfter = facilityManagement();
                    switch (choseMenuAfter){
                        case 1:
                            facilityService.displayFacility();
                            break;
                        case 2:
                            addNewFacility(scanner, scannerString, facilityService);
                            break;
                        case 3:
                            editFacilityService(scanner, scannerString, facilityService);
                            break;
                        case 4:
                            facilityService.displayListFacilityMaintenance();
                            break;
                    }
                }while (choseMenuAfter != 5);
                break;
            case 4:
                do{
                    choseMenuAfter = bookingManagerment();
                    switch (choseMenuAfter){
                        case 2:
                            bookingService.displayListBooking();
                            break;
                        case 1:
                            createBooking(scanner, scannerString, customerService, facilityService, bookingService);
                            break;
                        case 4:
                            contractService.displayListContracts();
                            break;
                        case 3:
                            createContract(scanner, scannerString, contractService);
                            break;
                        case 5:
                            editContract(scanner, scannerString, contractService);
                            break;
                    }
                }while (choseMenuAfter != 6);
                break;
            case 5:
                do {
                    choseMenuAfter = promotionManagement();
                    switch (choseMenuAfter){
                        case 1:
                            promotionService.displayListCustomerUseServiceByYear(scanner);
                            break;
                        case 2:
                            promotionService.displayListCustomerGetVoucher(scanner);
                            break;
                    }
                }while (choseMenuAfter != 3);
                break;
            case 6:
                System.out.println("Out of Menu");
                break;
        }
    }

    public static void editEmployee(Scanner scanner, Scanner scannerString, IEmployeeService employeeService) {
        int positionList = getPositionListEmployee(scanner, employeeService);
        int choseMenuEdit =-1;
        do{
            Employee employeeEdit = employeeService.getEmployee(positionList);
            System.out.println("Infor about employee in position "+positionList+ " is:");
            System.out.println(employeeEdit.toString());
            System.out.println("Chose on Menu Edit Employee  :");
            System.out.println("1.\tChange the employee in ID "+positionList+" to the new employee");
            System.out.println("2.\tChange properties in ID "+positionList);
            System.out.println("3.\tReturn Employee menu");
            choseMenuEdit = Integer.parseInt(scanner.nextLine());;
            switch (choseMenuEdit){
                case 1:
                    Employee newEmployee = enterNewEmployee(scanner, scannerString);
                    employeeService.editEmployee(positionList,newEmployee);
                    break;
                case 2:
                    int choseMenuEditAfter = -1;
                    do{
                        choseMenuEditAfter = getChoseMenuEditEmployee(scanner, positionList, employeeEdit);
                        chosePropertiesEditEmployee(scanner, scannerString, employeeEdit, choseMenuEditAfter);
                    }while (choseMenuEditAfter != 11);
                    break;
            }
        }while (choseMenuEdit != 3);
    }

    public static int getPositionListEmployee(Scanner scanner, IEmployeeService employeeService) {
        int positionList = -1;
        do{
            employeeService.showEmployee();
            System.out.println("Enter ID for Employee want Edit: ");
            positionList = Integer.parseInt(scanner.nextLine());
        }while (positionList > employeeService.sizeEmployee()-1|| positionList<0);
        return positionList;
    }

    public static int getPositionListCustomer(Scanner scanner, ICustomerService customerService) {
        int positionList = -1;
        do{
            customerService.showCustomer();
            System.out.println("Enter ID for Customer want Edit: ");
            positionList = Integer.parseInt(scanner.nextLine());
        }while (positionList > customerService.sizeCustomer()-1|| positionList<0);
        return positionList;
    }

    public static void editCustomer(Scanner scanner, Scanner scannerString, ICustomerService customerService) {
        int positionList = getPositionListCustomer(scanner, customerService);
        int choseMenuEdit =-1;
        do{
            Customer customerEdit = customerService.getCustomer(positionList);
            System.out.println("Infor about customer in position "+positionList+ " is:");
            System.out.println(customerEdit.toString());
            System.out.println("Chose on Menu Edit Customer  :");
            System.out.println("1.\tChange the Customer in ID "+positionList+" to the new employee");
            System.out.println("2.\tChange properties in ID "+positionList);
            System.out.println("3.\tReturn Customer menu");
            choseMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (choseMenuEdit){
                case 1:
                    Customer newCustomer = enterNewCustomer(scanner, scannerString);
                    customerService.editCustomer(positionList,newCustomer);
                    break;
                case 2:
                    int choseMenuEditAfter = -1;
                    do{
                        choseMenuEditAfter = getChoseMenuEditCustomer(scanner, positionList, customerEdit);
                        chosePropertiesEditCustomer(scanner, scannerString, customerEdit, choseMenuEditAfter);
                    }while (choseMenuEditAfter != 10);
            }
        }while (choseMenuEdit != 3);
    }

    public static void addNewFacility(Scanner scanner, Scanner scannerString, IFacilityService facilityService) {
        int choseServiceAddNew = 0;
        do{
            System.out.println("Chose facility want add: ");
            System.out.println("1.\tHouse ");
            System.out.println("2.\tRoom ");
            System.out.println("3.\tVilla ");
            System.out.println("4.\tReturn Customer menu");
            choseServiceAddNew = Integer.parseInt(scanner.nextLine());
            switch (choseServiceAddNew){
                case 1:
                    addNewHouseForFacility(scanner, scannerString, facilityService);
                    break;
                case 2:
                    addNewRoomForFacility(scanner, scannerString, facilityService);
                    break;
                case 3:
                    addNewVillaForFacility(scanner, scannerString, facilityService);
                    break;
            }
        }while (choseServiceAddNew != 4);
    }

    public static void editFacilityService(Scanner scanner, Scanner scannerString, IFacilityService facilityService) {
        facilityService.displayFacility();
        int choseID = getChoseIDEditFacility(scanner, facilityService);
        Facility facility = facilityService.getFacility(choseID);
        if(facility instanceof House){
            House houseEdit = (House) facility;
            int choseMenuEditHouse = 0;
            do{
                choseMenuEditHouse = getChoseMenuEditHouse(scanner, choseID, houseEdit);
                chosePropertiesEditHouse(scanner, scannerString, houseEdit, choseMenuEditHouse);
            }while (choseMenuEditHouse != 7);
        }else if(facility instanceof Room){
            Room roomEdit = (Room) facility;
            int choseMenuEditRoom = 0;
            do{
                choseMenuEditRoom = getChoseMenuEditRoom(scanner, choseID, roomEdit);
                chosePropertiesEditRoom(scanner, scannerString, roomEdit, choseMenuEditRoom);
            }while (choseMenuEditRoom != 6);
        }else if(facility instanceof Villa){
            Villa villaEdit = (Villa) facility;
            int choseMenuEditVilla = 0;
            do{
                choseMenuEditVilla = getChoseMenuEditVilla(scanner, choseID, villaEdit);
                chosePropertiesEditVilla(scanner, scannerString, villaEdit, choseMenuEditVilla);
            }while (choseMenuEditVilla != 8);
        }
    }

    public static void editContract(Scanner scanner, Scanner scannerString, IContactService contractService) {
        int idEditContract = getIdEditContract(scanner, contractService);
        Contract contractEdit = contractService.getContract(idEditContract);
        int inputEditContract = getInputEditContract(scanner, contractEdit);
        choseProperiesContractEdit(scanner, scannerString, contractEdit, inputEditContract);
    }

    public static void createBooking(Scanner scanner, Scanner scannerString, ICustomerService customerService, IFacilityService facilityService, IBookingService bookingService) {
        System.out.println("Input Booking new:");
        System.out.println("Enter code booking for new Booking: ");
        String codeBooking = scannerString.nextLine();
        System.out.println("Enter start Day for new Booking : (yyyy-mm-dd) ");
        LocalDate startDay = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter endDay for new Booking :  (yyyy-mm-dd) ");
        LocalDate endDay = LocalDate.parse(scanner.nextLine());
        int choseMenuAddCustomer = getChoseMenuAddCustomer(scanner, customerService);
        String codeCustomer = customerService.getCustomer(choseMenuAddCustomer).getCode();
        int choseMenuAddService = getChoseMenuAddService(scanner, facilityService);
        String nameService = facilityService.getFacility(choseMenuAddService).getNameService();
        String kindService = null;
        if(facilityService.getFacility(choseMenuAddService) instanceof House){
            kindService = "House";
        }
        if(facilityService.getFacility(choseMenuAddService) instanceof Villa){
            kindService = "Villa";
        }
        if(facilityService.getFacility(choseMenuAddService) instanceof Room){
            kindService = "Room";
        }
        bookingService.addNewBooking(new Booking(codeBooking, startDay,endDay,
                codeCustomer,nameService,kindService));
    }

    public static int getChoseMenuAddService(Scanner scanner, IFacilityService facilityService) {
        int choseMenuAddService = -1;
        do{
            facilityService.displayFacility();
            choseMenuAddService = Integer.parseInt(scanner.nextLine());
        }while (choseMenuAddService > facilityService.sizeFacility()-1 || choseMenuAddService < 0);
        return choseMenuAddService;
    }

    public static int getChoseMenuAddCustomer(Scanner scanner, ICustomerService customerService) {
        int choseMenuAddCustomer = -1;
        do{
            customerService.showCustomer();
            choseMenuAddCustomer = Integer.parseInt(scanner.nextLine());
        }while ((choseMenuAddCustomer > customerService.sizeCustomer()-1)||(choseMenuAddCustomer < 0));
        return choseMenuAddCustomer;
    }

    public static void createContract(Scanner scanner, Scanner scannerString, IContactService contractService) {
        contractService.displayListAddContracts();
        Booking bookingAddContract = contractService.getFirstBooking();
        System.out.println("Input Contracts for Booking :"+bookingAddContract);
        System.out.println("Enter number Contracts for Booking ");
        String numberContract = scannerString.nextLine();
        System.out.println("Enter advance Deposit Amount Contracts for Booking: ");
        double advanceDepositAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter total Payment Amount Contracts for Booking : ");
        double totalPaymentAmount = Double.parseDouble(scanner.nextLine());
        contractService.createNewContract(new Contract(numberContract,bookingAddContract.getCodeBooking(),
                advanceDepositAmount,totalPaymentAmount,bookingAddContract.getCodeCustomer()));
        System.out.println(new Contract(numberContract,bookingAddContract.getCodeBooking(),
                advanceDepositAmount,totalPaymentAmount,bookingAddContract.getCodeCustomer())+" Have been create");
    }

    public static void choseProperiesContractEdit(Scanner scanner, Scanner scannerString, Contract contractEdit, int inputEditContract) {
        switch (inputEditContract){
            case 1:
                System.out.println("Enter new number Contract: ");
                String numberContractEdit = scannerString.nextLine();
                contractEdit.setNumberContract(numberContractEdit);
                break;
            case 2:
                System.out.println("Enter new advance Deposit Amount Contract");
                double advanceDepositAmountEdit = Double.parseDouble(scanner.nextLine());
                contractEdit.setAdvanceDepositAmount(advanceDepositAmountEdit);
                break;
            case 3:
                System.out.println("Enter new total Payment Amount Contract ");
                double totalPaymentAmountEdit = Double.parseDouble(scanner.nextLine());
                contractEdit.setTotalPaymentAmount(totalPaymentAmountEdit);
                break;
        }
    }

    public static int getInputEditContract(Scanner scanner, Contract contractEdit) {
        int inputEditContract = -1;
        do{
            System.out.println("Enter properties want to Edit "+contractEdit);
            System.out.println("1. number Contract "+contractEdit.getNumberContract());
            System.out.println("2. advance Deposit Amount Contract "+contractEdit.getAdvanceDepositAmount());
            System.out.println("3. total Payment Amount Contract "+contractEdit.getTotalPaymentAmount());
            System.out.println("Enter number Contracts for Booking ");
            inputEditContract = Integer.parseInt(scanner.nextLine());
        }while (inputEditContract >3 || inputEditContract <0);
        return inputEditContract;
    }

    public static int getIdEditContract(Scanner scanner, IContactService contractService) {
        int idEditContract = -1;
        do{
            contractService.displayListContracts();
            System.out.println("enter ID contract want to EDIT!!!!");
            idEditContract = Integer.parseInt(scanner.nextLine());
        }while ((idEditContract > contractService.sizeContracts()-1)||(idEditContract < 0));
        return idEditContract;
    }

    public static void chosePropertiesEditVilla(Scanner scanner, Scanner scannerString, Villa villaEdit, int choseMenuEditVilla) {
        switch (choseMenuEditVilla){
            case 1:
                System.out.println("Enter Name Service for new Villa: ");
                String nameService = scannerString.nextLine();
                villaEdit.setNameService(nameService);
                break;
            case 2:
                System.out.println("Enter Area Use for new Villa: ");
                double areaUse = Double.parseDouble(scanner.nextLine());
                villaEdit.setAreaUse(areaUse);
                break;
            case 3:
                System.out.println("Enter floors for new Villa: ");
                int floors =Integer.parseInt(scanner.nextLine());
                villaEdit.setFloors(floors);
                break;
            case 4:
                System.out.println("Enter Maximum People for new Villa : ");
                int maximumPeople = Integer.parseInt(scanner.nextLine());
                villaEdit.setMaximumPeople(maximumPeople);
                break;
            case 5:
                System.out.println("Enter Standard Room for new Villa: ");
                String sRoom = scannerString.nextLine();
                villaEdit.setStandardRoom(sRoom);
                break;
            case 6:
                System.out.println("Enter Rental Cost for new Villa : ");
                double rentalCost = Double.parseDouble(scanner.nextLine());
                villaEdit.setRentalCost(rentalCost);
                break;
            case 7:
                System.out.println("Enter pool Area for new Villa : ");
                double poolArea = Double.parseDouble(scanner.nextLine());
                villaEdit.setPoolArea(poolArea);
                break;
        }
    }

    public static int getChoseMenuEditVilla(Scanner scanner, int choseID, Villa villaEdit) {
        int choseMenuEditVilla;
        System.out.println("Chose on Menu Edit Villa "+choseID+": ");
        System.out.println("1\tEdit Name Service ("+villaEdit.getNameService()+")");
        System.out.println("2\tEdit Area Use ("+villaEdit.getAreaUse()+")");
        System.out.println("3\tEdit floors ("+villaEdit.getFloors()+")");
        System.out.println("4\tEdit Maximum People ("+villaEdit.getMaximumPeople()+")");
        System.out.println("5\tEdit Standard Room ("+villaEdit.getStandardRoom()+")");
        System.out.println("6\tEdit Rental Cost ("+villaEdit.getRentalCost()+")");
        System.out.println("7\tEdit Pool Area ("+villaEdit.getPoolArea()+")");
        System.out.println("8\tReturn main menu");
        choseMenuEditVilla = Integer.parseInt(scanner.nextLine());
        return choseMenuEditVilla;
    }

    public static void chosePropertiesEditRoom(Scanner scanner, Scanner scannerString, Room roomEdit, int choseMenuEditRoom) {
        switch (choseMenuEditRoom){
            case 1:
                System.out.println("Enter Name Service for new Room: ");
                String nameService = scannerString.nextLine();
                roomEdit.setNameService(nameService);
                break;
            case 2:
                System.out.println("Enter Area Use for new Room: ");
                double areaUse = Double.parseDouble(scanner.nextLine());
                roomEdit.setAreaUse(areaUse);
                break;
            case 3:
                System.out.println("Enter Free Service for new Room: ");
                String freeService = scannerString.nextLine();
                roomEdit.setFreeService(freeService);
                break;
            case 4:
                System.out.println("Enter Maximum People for new Room : ");
                int maximumPeople = Integer.parseInt(scanner.nextLine());
                roomEdit.setMaximumPeople(maximumPeople);
                break;
            case 5:
                System.out.println("Enter Rental Cost for new Room : ");
                double rentalCost = Double.parseDouble(scanner.nextLine());
                roomEdit.setRentalCost(rentalCost);
                break;
        }
    }

    public static int getChoseMenuEditRoom(Scanner scanner, int choseID, Room roomEdit) {
        int choseMenuEditRoom;
        System.out.println("Chose on Menu Edit Room "+choseID+": ");
        System.out.println("1\tEdit Name Service ("+roomEdit.getNameService()+")");
        System.out.println("2\tEdit Area Use ("+roomEdit.getAreaUse()+")");
        System.out.println("3\tEdit free Service ("+roomEdit.getFreeService()+")");
        System.out.println("4\tEdit Maximum People ("+roomEdit.getMaximumPeople()+")");
        System.out.println("5\tEdit Rental Cost ("+roomEdit.getRentalCost()+")");
        System.out.println("6\tReturn main menu");
        choseMenuEditRoom = Integer.parseInt(scanner.nextLine());
        return choseMenuEditRoom;
    }

    public static int getChoseIDEditFacility(Scanner scanner, IFacilityService facilityService) {
        int choseID = 0;
        do{
            System.out.println("Chose "+facilityService.sizeFacility()+" to exit");
            System.out.println("Chose ID you want to edit:");
            choseID = Integer.parseInt(scanner.nextLine());
            Facility facility = facilityService.getFacility(choseID);
            if(facility==null){
                System.out.println("Chose "+facilityService.sizeFacility()+" to exit");
                System.out.println("Chose ID again to edit:");
                choseID = Integer.parseInt(scanner.nextLine());
            }
        }while (choseID == facilityService.sizeFacility());
        return choseID;
    }

    public static void chosePropertiesEditHouse(Scanner scanner, Scanner scannerString, House houseEdit, int choseMenuEditHouse) {
        switch (choseMenuEditHouse){
            case 1:
                System.out.println("Enter Name Service for new House: ");
                String nameService = scannerString.nextLine();
                houseEdit.setNameService(nameService);
                break;
            case 2:
                System.out.println("Enter Area Use for new House: ");
                double areaUse = Double.parseDouble(scanner.nextLine());
                houseEdit.setAreaUse(areaUse);
                break;
            case 3:
                System.out.println("Enter floors for new House: ");
                int floors = Integer.parseInt(scanner.nextLine());
                houseEdit.setFloors(floors);
                break;
            case 4:
                System.out.println("Enter Maximum People for new House : ");
                int maximumPeople = Integer.parseInt(scanner.nextLine());
                houseEdit.setMaximumPeople(maximumPeople);
                break;
            case 5:
                System.out.println("Enter Standard Room for new House: ");
                String sRoom = scannerString.nextLine();
                houseEdit.setStandardRoom(sRoom);
                break;
            case 6:
                System.out.println("Enter Rental Cost for new House : ");
                double rentalCost = Double.parseDouble(scanner.nextLine());
                houseEdit.setRentalCost(rentalCost);
                break;
        }
    }

    public static int getChoseMenuEditHouse(Scanner scanner, int choseID, House houseEdit) {
        int choseMenuEditHouse;
        System.out.println("Chose on Menu Edit House "+choseID+": ");
        System.out.println("1\tEdit Name Service ("+houseEdit.getNameService()+")");
        System.out.println("2\tEdit Area Use ("+houseEdit.getAreaUse()+")");
        System.out.println("3\tEdit floors ("+houseEdit.getFloors()+")");
        System.out.println("4\tEdit Maximum People ("+houseEdit.getMaximumPeople()+")");
        System.out.println("5\tEdit Standard Room ("+houseEdit.getStandardRoom()+")");
        System.out.println("6\tEdit Rental Cost ("+houseEdit.getRentalCost()+")");
        System.out.println("7\tReturn main menu");
        choseMenuEditHouse = Integer.parseInt(scanner.nextLine());
        return choseMenuEditHouse;
    }

    public static void addNewVillaForFacility(Scanner scanner, Scanner scannerString, IFacilityService facilityService) {
        System.out.println("Enter nameService for new Villa: ");
        String nameService = scannerString.nextLine();
        System.out.println("Enter standardRoom for new Villa: ");
        String standardRoom = scannerString.nextLine();
        System.out.println("Enter area Use for new Villa: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental Cost for new Villa : ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter pool Area for new Villa : ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter floors for new Villa : ");
        int floors = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum People for new Villa : ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        facilityService.addNewFacility(new Villa(nameService, areaUse,  rentalCost,
                maximumPeople,  standardRoom, poolArea, floors));
    }

    public static void addNewRoomForFacility(Scanner scanner, Scanner scannerString, IFacilityService facilityService) {
        System.out.println("Enter nameService for new Room: ");
        String nameService = scannerString.nextLine();
        System.out.println("Enter free Serivice for new Room: ");
        String freeSerivice = scannerString.nextLine();
        System.out.println("Enter area Use for new Room: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental Cost for new Room : ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maximum People for new Room : ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        facilityService.addNewFacility(new Room(nameService, areaUse,  rentalCost, maximumPeople,  freeSerivice));
    }

    public static void addNewHouseForFacility(Scanner scanner, Scanner scannerString, IFacilityService facilityService) {
        System.out.println("Enter nameService for new House: ");
        String nameService = scannerString.nextLine();
        System.out.println("Enter standardRoom for new House: ");
        String standardRoom = scannerString.nextLine();
        System.out.println("Enter area Use for new House: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental Cost for new House : ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter floors for new House : ");
        int floors = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum People for new House : ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        facilityService.addNewFacility(new House(nameService, areaUse,  rentalCost
                , maximumPeople,  standardRoom,  floors));
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
        boolean gender = Boolean.parseBoolean(scannerString.nextLine());
        System.out.println("Enter SDT for new Employee : ");
        int SDT =  Integer.parseInt(scanner.nextLine());
        System.out.println("Enter salary for new Employee : ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(code,name,date,gender,cmnd,SDT,email,level,position,salary);
    }

    public static Customer enterNewCustomer(Scanner scanner, Scanner scannerString) {
        System.out.println("Enter code for new Customer: ");
        String code = scannerString.nextLine();
        System.out.println("Enter name for new Customer: ");
        String name = scannerString.nextLine();
        System.out.println("Enter Date of birth for new Customer: ");
        String date = scannerString.nextLine();
        System.out.println("Enter CMND for new Customer : ");
        String cmnd = scannerString.nextLine();
        System.out.println("Enter email for new Customer : ");
        String email = scannerString.nextLine();
        System.out.println("Enter type of Guest for new Customer : ");
        String typeOfGuest = scannerString.nextLine();
        System.out.println("Enter address for new Customer : ");
        String address = scannerString.nextLine();
        System.out.println("Enter gender for new Customer (true: man / false: women) : ");
        boolean gender = Boolean.parseBoolean(scannerString.nextLine());
        System.out.println("Enter SDT for new Customer : ");
        int SDT = Integer.parseInt(scanner.nextLine());
        return new Customer(code,name,date,gender,cmnd,SDT,email,typeOfGuest,address);
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
                boolean gender = Boolean.parseBoolean(scannerString.nextLine());
                employeeEdit.setGender(gender);
                break;
            case 6:
                System.out.println("Enter SDT for new Employee : ");
                int SDT = Integer.parseInt(scanner.nextLine());
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
                double salary = Double.parseDouble(scanner.nextLine());
                employeeEdit.setSalary(salary);
                break;
        }
    }

    public static void chosePropertiesEditCustomer(Scanner scanner, Scanner scannerString, Customer customerEdit, int choseMenuEdit) {
        switch (choseMenuEdit){
            case 1:
                System.out.println("Enter name for new Customer: ");
                String name = scannerString.nextLine();
                customerEdit.setName(name);
                break;
            case 2:
                System.out.println("Enter code for new Customer: ");
                String code = scannerString.nextLine();
                customerEdit.setCode(code);
                break;
            case 3:
                System.out.println("Enter Date of birth for new Customer: ");
                String date = scannerString.nextLine();
                customerEdit.setDateOfBirth(date);
                break;
            case 5:
                System.out.println("Enter CMND for new Customer : ");
                String cmnd = scannerString.nextLine();
                customerEdit.setCMND(cmnd);
                break;
            case 4:
                System.out.println("Enter gender for new Customer (true: man / false: women) : ");
                boolean gender = Boolean.parseBoolean(scannerString.nextLine());
                customerEdit.setGender(gender);
                break;
            case 6:
                System.out.println("Enter SDT for new Customer : ");
                int SDT = Integer.parseInt(scanner.nextLine());
                customerEdit.setSDT(SDT);
                break;
            case 7:
                System.out.println("Enter email for new Customer : ");
                String email = scannerString.nextLine();
                customerEdit.setEmail(email);
                break;
            case 8:
                System.out.println("Enter type of guest for new Customer : ");
                String typeOfGuest = scannerString.nextLine();
                customerEdit.setTypeOfGuest(typeOfGuest);
                break;
            case 9:
                System.out.println("Enter address for new Customer : ");
                String address = scannerString.nextLine();
                customerEdit.setAddress(address);
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
        choseMenuEdit = Integer.parseInt(scanner.nextLine());
        return choseMenuEdit;
    }

    public static int getChoseMenuEditCustomer(Scanner scanner, int poisitionArrayList, Customer customerEdit) {
        int choseMenuEdit;
        System.out.println("Chose on Menu Edit Customer "+poisitionArrayList+": ");
        System.out.println("1\tEdit name ("+customerEdit.getName()+")");
        System.out.println("2\tEdit code ("+customerEdit.getCode()+")");
        System.out.println("3\tEdit date ("+customerEdit.getDateOfBirth()+")");
        System.out.println("4\tEdit gender ("+customerEdit.getGender()+")");
        System.out.println("5\tEdit cmnd ("+customerEdit.getCMND()+")");
        System.out.println("6\tEdit SDT ("+customerEdit.getSDT()+")");
        System.out.println("7\tEdit email ("+customerEdit.getEmail()+")");
        System.out.println("8\tEdit type of guest ("+customerEdit.getTypeOfGuest()+")");
        System.out.println("9\tEdit address ("+customerEdit.getAddress()+")");
        System.out.println("10\tReturn main menu");
        choseMenuEdit = Integer.parseInt(scanner.nextLine());
        return choseMenuEdit;
    }
}
