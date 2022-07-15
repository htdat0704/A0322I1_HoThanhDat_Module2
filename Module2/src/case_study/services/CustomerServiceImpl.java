package case_study.services;

import case_study.models.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.CustomerRepositoryImpl;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomerServiceImpl implements ICustomerService{

    private CustomerRepository repository = new CustomerRepositoryImpl();

    public CustomerServiceImpl(Customer customer) {
        this.repository.addCustomer(customer);
    }

    public CustomerServiceImpl(){
    }

    @Override
    public Customer getCustomer(int index) {
        return repository.getCustomer(index);
    }

    @Override
    public void showCustomer() {

        repository.showCustomer();

    }

    @Override
    public void addCustomer(Customer c) {
        repository.addCustomer(c);
    }

    @Override
    public int sizeCustomer() {
        return repository.sizeCustomer();
    }

    @Override
    public void editCustomer(int index, String code, String name, String dateOfBirth,
                             boolean gender, String CMND, int SDT, String email, String typeOfGuest, String address) {
        repository.editCustomer(index, code, name, dateOfBirth, gender,
                CMND, SDT, email, typeOfGuest, address);
    }

    @Override
    public void editCustomer(int index, Customer c) {
        repository.editCustomer(index,c);
    }

}
