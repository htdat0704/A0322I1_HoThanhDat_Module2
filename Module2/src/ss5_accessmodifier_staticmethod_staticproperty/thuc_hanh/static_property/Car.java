package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.static_property;

public class Car {

    private String name;

    private String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }



    // getters and setters


    public String getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

}
