package BaiLap1.service;

import BaiLap1.entities.student;

import java.util.Scanner;

public class Studentservice {
    public student inputStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id cua hoc sinh:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap ten cua hoc sinh:");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap dia chi cua hoc sinh:");
        String address = scanner.nextLine();
        return new student(id,name,address);
    }


}
