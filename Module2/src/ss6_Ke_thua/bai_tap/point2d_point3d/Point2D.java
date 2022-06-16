package ss6_Ke_thua.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){}

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    public float[] getXY(){
        float[] newArray = {getX(),getY()};
        return newArray;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
