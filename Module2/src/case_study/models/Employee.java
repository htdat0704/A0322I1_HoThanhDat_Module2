package case_study.task1.models;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee(String code, String name, String dateOfBirth, boolean gender, String CMND,
                    int SDT, String email, String level, String position, double salary) {
        super(code, name, dateOfBirth, gender, CMND, SDT, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + super.getCode() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", gender=" + super.getGender() +
                ", CMND='" + super.getCMND() + '\'' +
                ", SDT=" + super.getSDT() +
                ", email='" + super.getEmail() + '\'' +
                ", level='" + this.level + '\'' +
                ", position='" + this.position + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}
