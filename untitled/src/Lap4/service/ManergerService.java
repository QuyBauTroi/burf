package Lap4.service;

import Lap4.entities.Manerger;
import Lap4.entities.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManergerService {
    public void inputManerger(Scanner scanner, ArrayList<Staff> staffs){
        System.out.println("Nhap so luong quan ly:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap quan ly thu"+(i+1));
            System.out.println("Nhap ten:");
            String name = scanner.nextLine();
            System.out.println("Nhap tien luong:");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap tien luong trach nghiem:");
            double bonusSalary = Double.parseDouble(scanner.nextLine());
            Manerger staff1 = new Manerger(name,salary,bonusSalary);
            staff1.setSalary(staff1.manergerSalary());
            staffs.add(staff1);
        }
    }


}
