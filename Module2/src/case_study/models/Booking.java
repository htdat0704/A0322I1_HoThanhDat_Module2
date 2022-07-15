package case_study.models;

import java.time.LocalDate;

public class Booking implements Comparable<Booking>{
    private String codeBooking;
    private LocalDate startDay;
    private LocalDate endDay;
    private String codeCustomer;
    private String nameService;
    private String kindService;

    public Booking(String codeBooking, LocalDate startDay, LocalDate endDay,
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

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
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


    @Override
    public int compareTo(Booking o) {
        if (this.startDay.equals(o.getStartDay())) {
            return this.endDay.compareTo(o.getEndDay());
        }
        return this.startDay.compareTo(o.getStartDay());
    }
}
