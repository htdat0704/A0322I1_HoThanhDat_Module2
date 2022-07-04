package case_study.models;

public class Villa  extends Facility{
    private String standardRoom;
    private double poolArea;
    private int floors;

    public Villa(String nameService, double areaUse, double rentalCost, int maximumPeople,
                 String standardRoom, double poolArea, int floors) {
        super(nameService, areaUse, rentalCost, maximumPeople);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String standardRoom, double poolArea, int floors) {
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return   super.toString()+
                "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", floors=" + floors +
                '}';
    }
}
