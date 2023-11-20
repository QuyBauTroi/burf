package LogIn_LogOut.service;

import LogIn_LogOut.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Log {
    LogInOutService login = new LogInOutService();
    public  void inputMenu(Scanner scanner, ArrayList<User> users){
        int choose;
        do {
            System.out.println("Chon mot tuy chon:");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ky");
            System.out.println("Enter your choice:");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    login.login(scanner, users);
                    break;
                case 2:
                    login.register(scanner, users);
                    break;
                default:
                    System.out.println("Lua chon khong hop len , vui long nhap lai");
                    break;
            }
        }while (true);
    }
}
