package ss4_class_and_object.bai_tap.QuadraticEquation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return (this.b*this.b)-(4*this.a*this.c);
    }

    public double getRoot1(){
        return (-this.b+Math.pow(Math.pow(this.b,2)-(4*this.a*this.c),0.5))/(2*this.a);
    }

    public double getRoot2(){
        return (-this.b-Math.pow(Math.pow(this.b,2)-(4*this.a*this.c),0.5))/(2*this.a);
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }


    public String Display(){
        if(getDiscriminant() > 0){
            return "The equation has two roots "+getRoot1()+" and "+getRoot2();
        }else if(getDiscriminant() == 0){
            return "The equation has one root"+getRoot1();
        }else{
            return "The equation has no real roots";
        }

    }
}
