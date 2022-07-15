package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;

public interface IBookingService extends IService{

    void addNewBooking(Booking booking);

    void displayListBooking();

}
