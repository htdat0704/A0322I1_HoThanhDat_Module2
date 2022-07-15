package case_study.repository;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.*;

public class BookingRepositoryImpl implements BookingRepository{

    private Set<Booking> bookingTreeSet = new TreeSet<>();
    Booking booking1 = new Booking("1123",12,14,
            "1111","nameService2","Room");
    Booking booking2 = new Booking("11234",10,14,
            "wwww","nameService1","Room");
    Booking booking3 = new Booking("112345",10,12,
            "1111","nameService1","Room");
    Booking booking4 = new Booking("11",1,10,
            "wwww","nameService1","Room");
    Contract contract1 = new Contract("123","112345",
            1123,2000,"1111");


    private List<Contract> contracts = new ArrayList<>();
    {
        contracts.add(contract1);
    }

    private Queue<Booking> queueTreeSet = new LinkedList<>();

    public Queue<Booking> getQueueTreeSet() {
        return queueTreeSet;
    }


    public BookingRepositoryImpl() {
        this.addNewBooking(booking1);
        this.addNewBooking(booking2);
        this.addNewBooking(booking3);
        this.addNewBooking(booking4);
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

    public static void main(String[] args) {
        BookingRepositoryImpl bookingRepository = new BookingRepositoryImpl();
        System.out.println(bookingRepository.queueTreeSet.size());
        System.out.println(bookingRepository.sizeContracts());

    }
}
