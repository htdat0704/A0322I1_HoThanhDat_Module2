package case_study.services;

import case_study.models.Customer;

public interface ICustomerService extends IService{

    Customer getCustomer(int index);

    void showCustomer();

    void addCustomer(Customer c);

    int sizeCustomer();

    void editCustomer(int index, String code, String name, String dateOfBirth, boolean gender, String CMND,
                      int SDT, String email, String typeOfGuest, String address);
    void editCustomer(int index, Customer c);

}
