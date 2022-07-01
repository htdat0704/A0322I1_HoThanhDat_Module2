package case_study.task1.models;

public abstract class Facility {
    private String nameService;
    private double areaUse;
    private double rentalCost;
    private int maximumPeople;

    public Facility(String nameService, double areaUse, double rentalCost, int maximumPeople) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalCost = rentalCost;
        this.maximumPeople = maximumPeople;
    }

    public Facility() {
    }

    public String getNameService() {
        return nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }



    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentalCost=" + rentalCost +
                ", maximumPeople=" + maximumPeople +
                '}';
    }
}
