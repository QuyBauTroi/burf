package Lap4.service;

import Lap4.entities.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffService {
    public void inputStaff(Scanner scanner, ArrayList<Staff>staffs){
        System.out.println("Nhap so lượng nhan viên :");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien thu"+(i+1));
            System.out.println("Nhap ten:");
            String name = scanner.nextLine();
            System.out.println("Nhap tien luong:");
            double salary = Double.parseDouble(scanner.nextLine());
            Staff staff1 = new Staff(name,salary);
            staff1.setSalary(staff1.staffSalary());
            staffs.add(staff1);
        }
    }

    public void deleteStaff(Scanner scanner,ArrayList<Staff> staffs){
        System.out.println("Xoa nhan vien khoi danh sách");
        System.out.println("Mời bạn nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        staffs.removeIf(staff -> id == staff.getId());
    }
    public void findBySalary(Scanner scanner,ArrayList<Staff> staffs){
        System.out.println("Mời bạn nhập lương:");
        double salary= Double.parseDouble(scanner.nextLine());
        for (Staff staff : staffs){
            if (salary == staff.getSalary()){
                System.out.println(staff);
            }
        }
    }


}
