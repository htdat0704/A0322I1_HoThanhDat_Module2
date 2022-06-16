package ss6_Ke_thua.bai_tap.point_moveablepoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,2,3,1.5f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
