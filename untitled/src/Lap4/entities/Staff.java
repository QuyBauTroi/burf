package Lap4.entities;

import Lap4.service.StaffService;

public class Staff {
    private static int autoId;
    private int id;
    private String name;
    private double salary;

    public Staff( String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }



    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Staff.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double staffSalary(){
        double staffSalary = 0;
        if (salary>11000000){
             staffSalary = salary-(salary *0.1);
        }return staffSalary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
