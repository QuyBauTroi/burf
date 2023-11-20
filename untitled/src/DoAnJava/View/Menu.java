package DoAnJava.View;


import DoAnJava.entities.Orders;
import DoAnJava.entities.Product;
import DoAnJava.entities.User;
import DoAnJava.service.UserService;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void optionMenu(Scanner scanner, ArrayList<User> users, UserService userService, Map<Integer, Product> productMap, ArrayList<Orders> orders, Product product){
        boolean isContinue = true;
        do {
            System.out.println("1-Đăng nhập");
            System.out.println("2-Dăng ký");
            System.out.println("Mời bạn lựa chọn: ");
            int select=Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    isContinue = userService.inputLogin(scanner, users, userService,productMap,orders,product);
                    break;
                case 2:
                    userService.inputRegister(scanner,users);
                    break;
            }
        }while (isContinue);
    }
}
