package case_study.task1.models;

public class Booking {
    private String codeBooking;
    private String startDay;
    private String endDay;
    private String codeCustomer;
    private String nameService;
    private String kindService;

    public Booking(String codeBooking, String startDay, String endDay,
                   String codeCustomer, String nameService, String kindService) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.codeCustomer = codeCustomer;
        this.nameService = nameService;
        this.kindService = kindService;
    }

    public Booking(){}

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getKindService() {
        return kindService;
    }

    public void setKindService(String kindService) {
        this.kindService = kindService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", nameService='" + nameService + '\'' +
                ", kindService='" + kindService + '\'' +
                '}';
    }
}
