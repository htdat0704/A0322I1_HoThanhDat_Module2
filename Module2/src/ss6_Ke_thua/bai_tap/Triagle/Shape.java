package ss6_Ke_thua.bai_tap.Triagle;

public class Shape {
    public String color;

    public Shape(){
        this("no color");
    }

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
