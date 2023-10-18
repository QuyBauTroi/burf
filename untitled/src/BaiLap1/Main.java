package BaiLap1;

import BaiLap1.entities.student;
import BaiLap1.service.Studentservice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String chose = "";
        do {
            Studentservice studentservice = new Studentservice();
            student student = studentservice.inputStudent();
            students.add(student);
            System.out.println("Do you want to continue ? (Y/N)");
            chose = scanner.nextLine();
        }while (chose.equalsIgnoreCase("y"));
    }
}
