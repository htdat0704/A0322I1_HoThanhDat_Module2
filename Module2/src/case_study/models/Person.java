package case_study.models;

public abstract class Person {
    private String code;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    private String CMND;
    private int SDT;
    private String email;

    public Person(String code,String name, String dateOfBirth, boolean gender, String CMND, int SDT, String email) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.CMND = CMND;
        this.SDT = SDT;
        this.email = email;
    }

    public Person(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender(){
        if(isGender()){
            return "Man";
        }else {
            return "Women";
        }
    }

    @Override
    public String toString() {

        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + getGender() +
                ", CMND='" + CMND + '\'' +
                ", SDT=" + SDT +
                ", email='" + email + '\'' +
                '}';
    }
}
