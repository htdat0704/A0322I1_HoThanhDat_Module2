package ss6_Ke_thua.thuc_hanh.he_cac_obj_hinh;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean isFilled){
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "which is a subclass of Shape}";
    }
}
