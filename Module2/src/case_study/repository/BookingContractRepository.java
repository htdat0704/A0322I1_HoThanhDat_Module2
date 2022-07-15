package case_study.repository;

import case_study.models.Booking;
import case_study.models.Contract;

public interface BookingContractRepository {

    void addNewBooking(Booking booking);

    void displayListBooking();

    void createNewContract(Contract contract);

    void displayListContracts();

    void editContracts();

    void displayListAddContracts();

    Contract getCotract(int index);

    int sizeContracts();

}
