package Lap6.FPTShop.Service;


import Lap6.FPTShop.entities.Staff;
import Lap6.Utils.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StaffAccountService {
    Utils utils = new Utils();
    Map<Integer, Staff>staffMap = new HashMap<>();

    // Thực hiện điền thông tin của nhân viên
    public void inputStaffAccount(Scanner scanner){
        System.out.println("Moi ban xac thuc thong tin cho tai khoan:");
        System.out.println("Nhap ho va ten :");
        String name = utils.inputString(scanner);
        System.out.println("Nhap so dien thoai :");
        String phoneNumber = utils.inputString(scanner);
        System.out.println("Nhap dia chi nha :");
        String address = utils.inputString(scanner);
        System.out.println("Nhap email");
        String email =utils.inputString(scanner);
        Staff staff = new Staff(name,phoneNumber,address,email);
        staffMap.put(staff.getId(),staff);
        System.out.println("Chao mung"+ staff.getName() + ", ban co the thuc hien cong viec sau:");
        menuStaff(scanner);
    }



    public void menuStaff(Scanner scanner){
        int choice;
        do {
            System.out.println("1. Xem thong tin tat ca san pham");
            System.out.println("2. Xem thong tin tat ca don hang");
            System.out.println("3. Chinh sua thong tin don hang");
            System.out.println("4. Xem thong tin Khach hang");
            System.out.println("5. Chinh sua thong tin khach hang");
            System.out.println("6. Thay doi password");
            System.out.println("7. Thay doi email");
            System.out.println("8. Dang xuat");
            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai:");
                    break;
            }
        }while (true);
    }







}
