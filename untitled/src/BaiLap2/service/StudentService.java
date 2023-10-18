package BaiLap2.service;



import BaiLap2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scanner){
        System.out.println("Mời b nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Input địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm toán: ");
        double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm lý: ");
        double scorePhysic = Double.parseDouble(scanner.nextLine());
        return new Student(address, name, scoreMath, scorePhysic);
    }

    public void createStudentList(Scanner scanner, ArrayList<Student> students){
        String choice ="";
        do {
            Student student = inputStudent(scanner);
            students.add(student);
            System.out.println("Do u want to continue?(Y/N)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));
    }

    public void calculatePercent(double countA, double countB, double countC, int studentNumber){
        double perA = countA/studentNumber* 100;
        double perB = countB/studentNumber* 100;
        double perC = countC/studentNumber* 100;
        System.out.println(perA+" - "+perB+" - "+perC);
    }

    public void percentTypeStudent(ArrayList<Student> students){
        int countA = 0, countB=0, countC=0;
        for (Student student: students){
            if(student.classify().equals("A")) countA++;
            else if(student.classify().equals("B")) countB++;
            else countC++;
        }
        System.out.println("CountA: "+countA+" - countB: "+countB+" - countC: "+countC);
        calculatePercent(countA, countB, countC, students.size());
    }
}