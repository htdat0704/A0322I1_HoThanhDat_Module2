package ss6_Ke_thua.thuc_hanh.he_cac_obj_hinh;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean isFilled){
        super(side,side,color,isFilled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + getSide() +
                "which is a subclass of Rectangle}";
    }
}
