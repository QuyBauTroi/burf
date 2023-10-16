package Bai8_1;

import java.time.LocalDate;

public class Family {
    private int id;
    private String name;
    private LocalDate dob;
    private String job;

    public Family(int id, String name, LocalDate dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }


    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
}
