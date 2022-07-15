package case_study.services;

import case_study.models.Booking;
import case_study.models.Facility;

public interface IFacilityService extends IService{

    void addNewFacility(Facility facility);

    Facility getFacility(int index);

    void displayFacility();

    void setFacility(int index, Facility facility);

    int sizeFacility();

    void displayListFacilityMaintenance();

}
