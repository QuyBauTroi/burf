package Lap6;

import Lap6.FPTShop.Service.ProductService;
import Lap6.FPTShop.entities.Product;
import Lap6.Role.RoleFPTShopService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoleFPTShopService roleFPTShopService = new RoleFPTShopService();
        roleFPTShopService.roleAccount(scanner);

    }
}
