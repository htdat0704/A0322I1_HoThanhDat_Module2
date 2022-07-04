package case_study.models;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer(String code, String name, String dateOfBirth, boolean gender, String CMND,
                    int SDT, String email, String typeOfGuest, String address) {
        super(code, name, dateOfBirth, gender, CMND, SDT, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer() {
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "|| Customer{" +
                "code='" + super.getCode() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", gender=" + super.getGender() +
                ", CMND='" + super.getCMND() + '\'' +
                ", SDT=" + super.getSDT() +
                ", email='" + super.getEmail() + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
