package Lap6;

import Lap6.Shop.Account.User;
import Lap6.Shop.Service.*;

import Lap6.Shop.entities.Customer;

import Lap6.View.Menu;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        CustomerService customerService = new CustomerService();
        StaffAccountService staffAccountService = new StaffAccountService();
        RegisterService registerService = new RegisterService();
        ManagerAccountService managerAccountService = new ManagerAccountService();
        OrderService orderService = new OrderService();
        Customer customer = new Customer();
        Menu menu = new Menu();
        menu.optionMenu(scanner,orderService,managerAccountService,registerService,customerService,staffAccountService,users,customer);

    }
}
