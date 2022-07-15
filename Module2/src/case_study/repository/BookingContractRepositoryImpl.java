package case_study.repository;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Facility;

import java.time.LocalDate;
import java.util.*;

public class BookingContractRepositoryImpl implements BookingContractRepository {

    private static Set<Booking> bookingTreeSet = new TreeSet<>();
    public static Booking booking1 = new Booking("1123", LocalDate.of(2020, 1, 8),
            LocalDate.of(2020, 1, 9), "1111","nameService2","Room");
    public static Booking booking2 = new Booking("11234",LocalDate.of(2020, 1, 8),
            LocalDate.of(2020, 3, 8), "wwww","nameService1","Room");
    public static Booking booking3 = new Booking("112345",LocalDate.of(2020, 1, 8),
            LocalDate.of(2020, 1, 28), "1111","nameService1","Room");
    public static Booking booking4 = new Booking("11",LocalDate.of(2021, 1, 18),
            LocalDate.of(2021, 1, 20), "22222","nameService1","Room");
    public static Booking booking5 = new Booking("11",LocalDate.of(2022, 7, 18),
            LocalDate.of(2022, 7, 22), "22222","nameService1","Room");
    public static Booking booking6 = new Booking("11",LocalDate.of(2022, 7, 10),
            LocalDate.of(2022, 7, 18), "22222","nameService1","Room");
    public static Booking booking7 = new Booking("11",LocalDate.of(2022, 7, 17),
            LocalDate.of(2022, 7, 19), "1111","nameService1","Room");
    public static Booking booking8 = new Booking("11",LocalDate.of(2022, 7, 15),
            LocalDate.of(2022, 7, 21), "22222","nameService1","Room");
    public static Contract contract1 = new Contract("123","112345",
            1123,2000,"1111");

    private static List<Contract> contracts = new ArrayList<>();

    private  static  Queue<Booking> queueTreeSet = new LinkedList<>();

    static {
        bookingTreeSet.add(booking1);
        bookingTreeSet.add(booking2);
        bookingTreeSet.add(booking3);
        bookingTreeSet.add(booking4);
        bookingTreeSet.add(booking5);
        bookingTreeSet.add(booking6);
        bookingTreeSet.add(booking7);
        bookingTreeSet.add(booking8);
        contracts.add(contract1);
    }



    public static Queue<Booking> getQueueTreeSet() {
        return queueTreeSet;
    }

    public static Set<Booking> getBookingTreeSet() {
        return bookingTreeSet;
    }


    public BookingContractRepositoryImpl() {
        addQueueBooking();
    }

    private void addQueueBooking(){
        if(queueTreeSet.size()> 0){
            queueTreeSet.clear();
        }
        boolean check = true;
        for(Booking booking: bookingTreeSet){
            for(Contract contract : contracts){
                if(booking.getCodeBooking().equals(contract.getCodeBooking())){
                    check = false;
                    break;
                }
            }
            if(check){
                queueTreeSet.add(booking);
            }else{
                check = true;
            }
        }

    }

    @Override
    public void addNewBooking(Booking booking) {
        FacilityRepositoryImpl.editUseFacility(booking);
        bookingTreeSet.add(booking);
        addQueueBooking();
    }

    @Override
    public void displayListBooking() {
        for(Booking booking: bookingTreeSet){
            System.out.println(booking);
        }
    }

    public void displayListAddContracts(){
        Iterator iterator = queueTreeSet.iterator();
        System.out.println("Get First to create contract");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public void createNewContract(Contract contract) {
        contracts.add(contract);
    }

    @Override
    public void displayListContracts() {
        Iterator iterator = contracts.iterator();
        int id = 0;
        while (iterator.hasNext()){
            System.out.println("ID: "+(id++)+" "+iterator.next());
        }
    }

    public Contract getCotract(int index){
        return contracts.get(index);
    }

    @Override
    public int sizeContracts() {
        return contracts.size();
    }

    @Override
    public void editContracts() {

    }

//    public static void main(String[] args) {
//        BookingContractRepositoryImpl bookingContractRepository = new BookingContractRepositoryImpl();
//        bookingContractRepository.displayListBooking();
//    }
}
