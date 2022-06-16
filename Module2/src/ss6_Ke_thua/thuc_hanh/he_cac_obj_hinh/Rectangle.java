package ss6_Ke_thua.thuc_hanh.he_cac_obj_hinh;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height){
        this.height = width;
        this.width = height;
    }

    public Rectangle(double width, double height, String color, boolean isFilled){
        super(color,isFilled);
        this.height = width;
        this.width = height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "which is a subclass of Shape}";
    }
}
