package Lap4.service;

import Lap4.entities.MarketingStaff;
import Lap4.entities.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketingStaffService {
    public void inputMarketingStaff(Scanner scanner, ArrayList<Staff> staffs){
        System.out.println("Nhap so luong nhan vien sales:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien sales thu"+(i+1));
            System.out.println("Nhap ten:");
            String name = scanner.nextLine();
            System.out.println("Nhap tien luong:");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap doanh so ban hang:");
            double sales = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap ty le hoa hong:");
            double percentBonus = Double.parseDouble(scanner.nextLine());
            MarketingStaff staff1 = new MarketingStaff(name,salary,sales,percentBonus);
            staff1.setSalary(staff1.marketingSalary());
            staffs.add(staff1);
        }

    }
}
