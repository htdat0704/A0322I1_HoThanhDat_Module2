package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.repository.BookingContractRepositoryImpl;

public class ContractServiceImpl implements IContactService{

    private BookingContractRepositoryImpl repository = new BookingContractRepositoryImpl();

    @Override
    public void createNewContract(Contract contract) {
        repository.createNewContract(contract);
    }

    @Override
    public void displayListContracts() {
        repository.displayListContracts();
    }

    @Override
    public void editContracts() {

    }

    public void displayListAddContracts(){
        repository.displayListAddContracts();
    }

    @Override
    public Booking getFirstBooking() {
        return repository.getQueueTreeSet().poll();
    }

    @Override
    public Contract getContract(int index) {
        return repository.getCotract(index);
    }

    @Override
    public int sizeContracts() {
        return repository.sizeContracts();
    }
}
