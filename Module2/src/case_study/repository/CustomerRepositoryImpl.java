package case_study.repository;

import case_study.models.Customer;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static LinkedList<Customer> customerList;

    static {
        customerList= new LinkedList<>();
        customerList.add(new Customer("1111","mot","12/12/19929",true,"123456789C",
                1145677,"abc@gmail.com","Dinamond","1223 Phung Khoang"));
        customerList.add(new Customer("wwww","3","12/12/1999",true,"123456789C",
                1245677,"abc@gmail.com","Dinamond","121414 Phung Khoang"));
        customerList.add(new Customer("22222","m4ot","12/12/1999",true,"123456789C",
                1223677,"abc@gmail.com","Dinamond","1223 Phung Khoang"));
    }

    public CustomerRepositoryImpl(Customer c){
        customerList.add(c);
    }

    public CustomerRepositoryImpl(){
    }

    public static LinkedList<Customer> getListCustomer() {
        return customerList;
    }

    @Override
    public Customer getCustomer(int index) {
        return customerList.get(index);
    }

    @Override
    public void showCustomer() {
        Iterator<Customer> iterator = customerList.iterator();
        int index = 0;
        while (iterator.hasNext()){
            Customer customer = iterator.next();
            System.out.println("ID: "+(index++)+" "+customer.toString());
        }
    }

    @Override
    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    @Override
    public int sizeCustomer() {
        return customerList.size();
    }

    @Override
    public void editCustomer(int index, String code, String name, String dateOfBirth, boolean gender,
                             String CMND, int SDT, String email, String typeOfGuest, String address) {
        Customer editCustomer = customerList.get(index);
        editCustomer.setTypeOfGuest(typeOfGuest);
        editCustomer.setAddress(address);
        editCustomer.setEmail(email);
        editCustomer.setSDT(SDT);
        editCustomer.setCMND(CMND);
        editCustomer.setCode(code);
        editCustomer.setName(name);
        editCustomer.setDateOfBirth(dateOfBirth);
        editCustomer.setGender(gender);
    }

    @Override
    public void editCustomer(int index, Customer c) {
        customerList.set(index,c);
    }
}
