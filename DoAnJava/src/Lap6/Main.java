package Lap6;

import Lap6.FPTShop.Account.User;
import Lap6.FPTShop.LogInOutService.AccountService;
import Lap6.FPTShop.LogInOutService.RegisterService;
import Lap6.FPTShop.Service.ProductService;
import Lap6.FPTShop.Service.StaffAccountService;

import Lap6.FPTShop.Service.CustomerService;
import Lap6.FPTShop.entities.Customer;

import Lap6.View.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        CustomerService customerService = new CustomerService();
        ProductService productService = new ProductService();
        Map<Integer, Customer>customerMap = new HashMap<>();
        StaffAccountService staffAccountService = new StaffAccountService();
        RegisterService registerService = new RegisterService();
        Menu menu = new Menu();
        menu.optionMenu(scanner,productService,registerService);
        Map<String, User> accounts = new HashMap<>();

        /* Register -> tạo account
        User user = new User("QUy", "123","quy^123", "1");
        User admin = new User("admin","123","123","3");
        User staff = new User("staf","123","123","2");
        switch (currentUser.getRole()){
                case "1":
                    // Menu customer
                    break;
                case "2":
                    // staff
                    break;
                case "3":
                    break;
                    */


    }
}
