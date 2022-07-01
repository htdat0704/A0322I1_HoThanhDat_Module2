package case_study.task1.models;

public class House extends Facility{
    private String standardRoom;
    private int floors;

    public House(String nameService, double areaUse, double rentalCost,
                 int maximumPeople, String standardRoom, int floors) {
        super(nameService, areaUse, rentalCost, maximumPeople);
        this.standardRoom = standardRoom;
        this.floors = floors;
    }

    public House(String standardRoom, int floors) {
        this.standardRoom = standardRoom;
        this.floors = floors;
    }

    public House(){}

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return super.toString()+
                "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", floors=" + floors +
                '}';
    }
}
