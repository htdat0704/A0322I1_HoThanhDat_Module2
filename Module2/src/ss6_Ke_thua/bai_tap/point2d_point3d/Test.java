package ss6_Ke_thua.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(12,4,6);
        Point2D point2D = new Point2D(3,7);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point3D);
        System.out.println(point2D);
    }
}
