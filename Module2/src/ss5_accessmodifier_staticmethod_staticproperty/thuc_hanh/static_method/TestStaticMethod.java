package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change();

        Student s1 = new Student(1112, "Hui");
        Student s2 = new Student(2223, "HaizTing");
        Student s3 = new Student(3334, "Bo");

        s1.display();
        s2.display();
        s3.display();
    }
}
