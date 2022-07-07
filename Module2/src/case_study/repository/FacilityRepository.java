package case_study.repository;


import case_study.models.Facility;

public interface FacilityRepository {

    void addNewFacility(Facility facility);

    Facility getFacility(int index);

    void displayFacility();

    void setFacility(int index, Facility facility);

    int sizeFacility();

    void displayListFacilityMaintenance();

}
