package ss6_Ke_thua.bai_tap.circle_clinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        this(0.0,"No color",0.0);
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn(){
        return getArea()*getHeight();
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ";color=" + getColor() +
                ";radius=" + getRadius() +
                '}';
    }
}
