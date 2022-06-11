package ss4_class_and_object.bai_tap.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius =5;
        this.color = "blue";
    }

    public Fan(int speed,boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean getOn(){
        return this.on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString(){
        String speedOfFan = null;
        switch (getSpeed()){
            case 1:
                speedOfFan = "LOW";
                break;
            case 2:
                speedOfFan = "NORMAL";
                break;
            case 3:
                speedOfFan = "FAST";
                break;
        }
        if(getOn()){
            return "Fan have speed: "+speedOfFan+" and radius: "+getRadius()+" and color: "+getColor()
                    +"- Fan is ON";
        }else{
            return "Fan have radius: "+getRadius()+" and color: "+getColor() +"- Fan is Off";
        }
    }
}
