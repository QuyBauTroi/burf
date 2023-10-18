package BaiLap2.entities;

public class Student {
    private static int autoId;
    private int id;
    private String address;
    private String name;
    private double math;
    private double physic;

    public Student(String address, String name) {
        this.id = ++autoId;
        this.address = address;
        this.name = name;
    }

    public Student() {
        this.id = ++autoId;
    }

    public Student(int id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public Student(String address, String name, double math, double physic) {
        this.id = ++autoId;
        this.address = address;
        this.name = name;
        this.math = math;
        this.physic = physic;
    }

    public String classify(){
        double avgScore = (math+ physic)/2;
        if(avgScore>=8) return "A";
        else if (avgScore>=6.5)return "B";
        return "C";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
