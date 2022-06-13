public class Test {
    int rollno;
    String name;
    static String college = "BachKhoa";

    static void change() {
        college = "QuocGia";
    }

    Test(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Test.change();
        Test s1 = new Test(111, "Hoang");
        Test s2 = new Test(222, "Thanh");
        Test s3 = new Test(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
