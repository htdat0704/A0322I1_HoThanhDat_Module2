package ss7_abstractClass_interface.bai_tap.Colorable;


import ss7_abstractClass_interface.thuc_hanh.animal_interface_edible.Edible;

import java.util.Random;

public class Tesst {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[8];
        shapes[0] = new Rectangle(3,1);
        shapes[1] = new Rectangle(2,4);
        shapes[2] = new Circle(5);
        shapes[3] = new Rectangle(12,8);
        shapes[4] = new Square(5.5);
        shapes[5] = new Circle(53.5);
        shapes[6] = new Square(2);
        shapes[7] = new Circle(1.5);

        for (Shape shape: shapes){
            System.out.println(shape.toString());
            System.out.println("Area: "+shape.getArea());
            if(shape instanceof Square){
                Colorable colorable = new Square();
                colorable.howToColor();
            }
            System.out.println("------------------------------------------------");
        }
    }
}
