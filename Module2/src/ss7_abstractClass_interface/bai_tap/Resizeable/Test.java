package ss7_abstractClass_interface.bai_tap.Resizeable;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[5];
        shapes[0] = new Rectangle(3,1);
        shapes[1] = new Rectangle(2,4);
        shapes[2] = new Circle(5);
        shapes[3] = new Rectangle(12,8);
        shapes[4] = new Circle(5.5);

        Random random = new Random();

        for (Shape shape: shapes){
            System.out.println(shape.toString());
            int ranNum = random.nextInt(100)+1;
            System.out.println("Percent up shape is ");
            shape.resize(ranNum);
            System.out.println("After up "+ranNum+"% shape have ");
            System.out.println(shape.toString());
            System.out.println("------------------------------------------------");
        }
    }
}
