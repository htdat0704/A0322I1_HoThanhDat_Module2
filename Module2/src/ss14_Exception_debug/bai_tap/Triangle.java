package ss14_Exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public Triangle(double a, double b, double c) throws IllegalTriangleExceptionTask{
        if(c > a+b || a > b+c || b> a+c || a<=0 || b<=0 || c<=0 ){
            throw new IllegalTriangleExceptionTask("Not triangle");
        }

        System.out.println("That is Triangle");
    }
}
