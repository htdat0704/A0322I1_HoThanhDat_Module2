package ss6_Ke_thua.bai_tap.point_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y,float xSpeed, float ySpeed){
        super(x,y);
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed(){
        float[] arrNew = {getxSpeed(),getySpeed()};
        return arrNew;
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + getX() +
                ", y=" + getY() +
                "), speed =" +
                "(xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ')';
    }

    public void move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}
