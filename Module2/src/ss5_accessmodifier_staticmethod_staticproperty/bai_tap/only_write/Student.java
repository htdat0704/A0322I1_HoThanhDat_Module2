package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.only_write;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student(){
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
