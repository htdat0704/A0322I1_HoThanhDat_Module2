package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;

public interface IContactService extends IService{

    void createNewContract(Contract contract);

    void displayListContracts();

    void editContracts();

    void displayListAddContracts();

    Booking getFirstBooking();

    Contract getContract(int index);

    int sizeContracts();

}
