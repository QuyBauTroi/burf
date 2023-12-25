package TechmaterSystem.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class OpeningScheduled {
    private int id;
    private static int autoId;
    private LocalDate startDate;
    private String address;
    private LocalDate studyDay;
    private LocalTime studyTime;

    public OpeningScheduled( LocalDate startDate, String address, LocalDate studyDay, LocalTime studyTime) {
        this.id = ++autoId;
        this.startDate = startDate;
        this.address = address;
        this.studyDay = studyDay;
        this.studyTime = studyTime;
    }

    public OpeningScheduled() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        OpeningScheduled.autoId = autoId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStudyDay() {
        return studyDay;
    }

    public void setStudyDay(LocalDate studyDay) {
        this.studyDay = studyDay;
    }

    public LocalTime getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(LocalTime studyTime) {
        this.studyTime = studyTime;
    }

    @Override
    public String toString() {
        return "OpeningScheduled{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", address='" + address + '\'' +
                ", studyDay=" + studyDay +
                ", studyTime=" + studyTime +
                '}';
    }
}
