package Lap6.Role;

import Lap6.FPTShop.Account.Manager;
import Lap6.FPTShop.Account.SalesUser;
import Lap6.FPTShop.Account.User;
import Lap6.FPTShop.LogInOutService.ManagerAccountService;
import Lap6.FPTShop.LogInOutService.StaffAccountService;
import Lap6.FPTShop.LogInOutService.UserAccountService;
import Lap6.Utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoleFPTShopService {
    Utils utils = new Utils();
    StaffAccountService salesAccountService = new StaffAccountService();
    UserAccountService userAccountService = new UserAccountService();
    ManagerAccountService managerAccountService = new ManagerAccountService();
    Map<String, Manager> managerMap = new HashMap<>();
    ArrayList<User>Users = new ArrayList<>();
    ArrayList<SalesUser>salesUsers = new ArrayList<>();


    public void roleAccount(Scanner scanner){
        int choice;
        do {
            System.out.println("Chon role :");
            System.out.println("1. Staff Account");
            System.out.println("2. User Account");
            System.out.println("3. Manager Account");
            System.out.println("4. Guest");
            choice = utils.inputInt(scanner);
            switch (choice){
                case 1:
                    salesAccountService.inputLoginStaff(scanner,salesUsers);
                    break;
                case 2:
                    userAccountService.inputMenu(scanner, Users);
                    break;
                case 3:
                    managerAccountService.inputLogin(scanner,managerMap);
                    break;
                case 4:

            }
        }while (true);
    }
}
