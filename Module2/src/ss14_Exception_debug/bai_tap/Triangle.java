package ss14_Exception_debug.bai_tap;

public class Triangle {
    double a,b,c;
    public Triangle(double a, double b, double c) throws IllegalTriangleExceptionTask{
        if(c > a+b || a > b+c || b> a+c){
            throw new IllegalTriangleExceptionTask("Not triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("That is Triangle");
    }
}
