package case_study.models;

public class Room  extends Facility{
    private String freeService;

    public Room(String nameService, double areaUse, double rentalCost, int maximumPeople, String freeService) {
        super(nameService, areaUse, rentalCost, maximumPeople);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(){}

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
