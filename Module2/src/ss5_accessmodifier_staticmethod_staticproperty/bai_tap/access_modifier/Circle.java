package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }

    Circle(double r){
        this.radius = r;
    }

    protected String getColor() {
        return color;
    }

    protected double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
