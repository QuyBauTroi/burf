package Lap6.ServiceFPTShop;

import Lap6.Utils.Utils;
import Lap6.entitiesFTPShop.Staff;

import java.util.Map;
import java.util.Scanner;

public class FPTShopService {
    Utils utils = new Utils();
    public void inputStaffAccout(Scanner scanner, Map<Integer, Staff>staffMap){
        System.out.println("Moi ban xac thuc thong tin cho tai khoan:");
        System.out.println("Nhap ho va ten :");
        String name = scanner.nextLine();
        System.out.println("Nhap so dien thoai :");
        int phoneNumber = utils.inputInt(scanner);
        System.out.println("Nhap dia chi nha :");
        String address = scanner.nextLine();
        System.out.println("Nhap email");
        String email =scanner.nextLine();
        Staff staff = new Staff(name,phoneNumber,address,email);
        staffMap.put(staff.getId(),staff);
        System.out.println("Chao mung"+ staffMap + ", ban co the thuc hien cong viec sau:");
        int choice;
        do {
            System.out.println("1.");
        }while (true);
    }

}