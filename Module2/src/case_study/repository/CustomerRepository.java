package case_study.repository;

import case_study.models.Customer;

import java.io.IOException;

public interface CustomerRepository {

    Customer getCustomer(int index);

    void showCustomer();

    void addCustomer(Customer c) throws IOException;

    int sizeCustomer();

    void editCustomer(int index, String code, String name, String dateOfBirth, boolean gender, String CMND,
                      int SDT, String email, String typeOfGuest, String address);
    void editCustomer(int index, Customer c);



}
