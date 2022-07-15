package case_study.services;

import case_study.models.Facility;
import case_study.repository.FacilityRepository;
import case_study.repository.FacilityRepositoryImpl;

public class FacilityServiceImpl implements IFacilityService{

    private FacilityRepository repository = new FacilityRepositoryImpl();

    @Override
    public void addNewFacility(Facility facility) {
        this.repository.addNewFacility(facility);
    }

    @Override
    public Facility getFacility(int index) {
        return this.repository.getFacility(index);
    }

    @Override
    public void displayFacility() {
        this.repository.displayFacility();
    }

    @Override
    public void setFacility(int index, Facility facility) {
        this.repository.setFacility(index,facility);
    }

    @Override
    public int sizeFacility() {
        return this.repository.sizeFacility();
    }

    @Override
    public void displayListFacilityMaintenance() {
        this.repository.displayListFacilityMaintenance();
    }

}
