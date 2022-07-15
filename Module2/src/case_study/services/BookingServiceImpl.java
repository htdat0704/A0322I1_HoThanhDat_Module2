package case_study.services;

import case_study.models.Booking;
import case_study.repository.BookingContractRepository;
import case_study.repository.BookingContractRepositoryImpl;

public class BookingServiceImpl implements IBookingService {

    private BookingContractRepository repository = new BookingContractRepositoryImpl();

    @Override
    public void addNewBooking(Booking booking) {
        repository.addNewBooking(booking);
    }

    @Override
    public void displayListBooking() {
        repository.displayListBooking();
    }


}
