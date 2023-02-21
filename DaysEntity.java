package hibernate;

import jakarta.persistence.*;


@Entity
@Table(name = "Days", schema = "fit")
public class DaysEntity {


    @Id
    @Basic
    @Column(name = "Monday")
    private String monday;
    @Basic
    @Column(name = "Tuesday")
    private String tuesday;
    @Basic
    @Column(name = "Wednesday")
    private String wednesday;
    @Basic
    @Column(name = "Thursday")
    private String thursday;
    @Basic
    @Column(name = "Friday")
    private String friday;
    @Basic
    @Column(name = "Saturday")
    private String saturday;
    @Basic
    @Column(name = "Sunday")
    private String sunday;


    public String getMonday() {
        return monday;
    }

    public  void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DaysEntity that = (DaysEntity) o;

        if (monday != null ? !monday.equals(that.monday) : that.monday != null) return false;
        if (tuesday != null ? !tuesday.equals(that.tuesday) : that.tuesday != null) return false;
        if (wednesday != null ? !wednesday.equals(that.wednesday) : that.wednesday != null) return false;
        if (thursday != null ? !thursday.equals(that.thursday) : that.thursday != null) return false;
        if (friday != null ? !friday.equals(that.friday) : that.friday != null) return false;
        if (saturday != null ? !saturday.equals(that.saturday) : that.saturday != null) return false;
        if (sunday != null ? !sunday.equals(that.sunday) : that.sunday != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = monday != null ? monday.hashCode() : 0;
        result = 31 * result + (tuesday != null ? tuesday.hashCode() : 0);
        result = 31 * result + (wednesday != null ? wednesday.hashCode() : 0);
        result = 31 * result + (thursday != null ? thursday.hashCode() : 0);
        result = 31 * result + (friday != null ? friday.hashCode() : 0);
        result = 31 * result + (saturday != null ? saturday.hashCode() : 0);
        result = 31 * result + (sunday != null ? sunday.hashCode() : 0);
        return result;
    }


}
