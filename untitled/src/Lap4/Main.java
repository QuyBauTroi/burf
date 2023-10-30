package Lap4;

import Lap4.entities.MarketingStaff;
import Lap4.entities.Staff;
import Lap4.service.ManergerService;
import Lap4.service.MarketingStaffService;
import Lap4.service.StaffService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffs = new ArrayList<>();
        StaffService service = new StaffService();
        MarketingStaffService marketingStaff = new MarketingStaffService();
        ManergerService manergerService = new ManergerService();

        service.inputStaff(scanner,staffs);
        marketingStaff.inputMarketingStaff(scanner,staffs);
        manergerService.inputManerger(scanner,staffs);
        service.deleteStaff(scanner,staffs);
        service.findBySalary(scanner,staffs);
        System.out.println(staffs);

        }


}

