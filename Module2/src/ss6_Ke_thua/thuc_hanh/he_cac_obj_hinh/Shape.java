package ss6_Ke_thua.thuc_hanh.he_cac_obj_hinh;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean isFilled){
        this.color = color;
        this.filled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
