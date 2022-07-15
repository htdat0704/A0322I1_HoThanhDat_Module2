package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.repository.BookingContractRepositoryImpl;
import case_study.repository.CustomerRepositoryImpl;

import java.time.LocalDate;
import java.util.*;

public class PromotionServiceImpl implements IPromotionService {

    private static Set<String> customersList = new LinkedHashSet<>();
    private static Set<Booking> bookingQueue =  BookingContractRepositoryImpl.getBookingTreeSet();
    private static LinkedList<Customer> customerList = CustomerRepositoryImpl.getListCustomer();

    @Override
    public void displayListCustomerUseServiceByYear(Scanner scanner) {
        System.out.println("Input year to show list customers use service: ");
        int yearInput = scanner.nextInt();
        for(Booking booking : bookingQueue){
            if(booking.getStartDay().getYear() == yearInput){
                customersList.add(booking.getCodeCustomer());
            }
        }

        System.out.println("Infor Customer has use Service in year "+yearInput+" is:");
        for(String codeCustomer: customersList){
            for(Customer customer: customerList){
                if(codeCustomer.equals(customer.getCode())){
                    System.out.println(customer);
                }
            }
        }
    }

    @Override
    public void displayListCustomerGetVoucher(Scanner scanner) {

        Stack<String> stacksCodeCustomer = new Stack<>();
        Set<String> setCodeCustomer = new LinkedHashSet<>();
        int monthNow = LocalDate.now().getMonthValue();
        for(Booking booking : bookingQueue){
            if(booking.getStartDay().getMonthValue() == monthNow){
                setCodeCustomer.add(booking.getCodeCustomer());
            }
        }

        stacksCodeCustomer.addAll(setCodeCustomer);

        int numberVoucher = 0;
        int inputVoucher10 = 0;
        int inputVoucher20 = 0;
        int inputVoucher50 = 0;
        do{
            System.out.println("Number Customer get Voucher this month "+stacksCodeCustomer.size());
            System.out.println("Number Customer must equal total number of Voucher");
            System.out.println("Input number of voucher 10%");
            inputVoucher10 = scanner.nextInt();
            System.out.println("Input number of voucher 20%");
            inputVoucher20 = scanner.nextInt();
            System.out.println("Input number of voucher 50%");
            inputVoucher50 = scanner.nextInt();
            numberVoucher = inputVoucher10 + inputVoucher20 + inputVoucher50;
        }while (numberVoucher > stacksCodeCustomer.size());

        while (!stacksCodeCustomer.isEmpty()){
            if(inputVoucher50> 0){
                for(Customer customer: customerList){
                    if(stacksCodeCustomer.peek().equals(customer.getCode())){
                        System.out.println("Voucher 50% give to"+customer);
                        inputVoucher50 --;
                    }
                }
                continue;
            }
            if(inputVoucher20 > 0 ){
                for(Customer customer: customerList){
                    if(stacksCodeCustomer.peek().equals(customer.getCode())){
                        System.out.println("Voucher 20% give to"+customer);
                        inputVoucher20 --;
                    }
                }
                continue;
            }
            if(inputVoucher10 > 0){
                for(Customer customer: customerList){
                    if(stacksCodeCustomer.peek().equals(customer.getCode())){
                        System.out.println("Voucher 10% give to"+customer);
                        inputVoucher10 --;
                    }
                }
                continue;
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        PromotionServiceImpl e = new PromotionServiceImpl();
//       // e.displayListCustomerUseServiceByYear(scanner);
//        e.displayListCustomerGetVoucher(scanner);
//    }
}
