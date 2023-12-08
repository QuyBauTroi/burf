package databaseB1;

import DoAnJava.entities.Orders;
import DoAnJava.entities.Product;
import DoAnJava.entities.STATUS;
import databaseB1.entities.Products;
import databaseB1.service.OrderService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Products> productMap = new HashMap<>();
        Products product = new Products("iphone X",5000000,5);
        Products product1 = new Products("iphone Xs",6000000,5);
        Products product2 = new Products("iphone Xs Max",7000000,5);

        productMap.put(product.getId(),product);productMap.put(product1.getId(),product1);productMap.put(product2.getId(),product2);


        OrderService orderService = new OrderService();
        ArrayList<Orders> orders = new ArrayList<>();
        Orders order = new Orders();
        orders.add(order);
        do {
            System.out.println("Menu");
            System.out.println("1 Order        2 Xem tất cả order đã order     3 Cook");
            System.out.print("Chọn đáp án đúng :");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n){
                case 1:
                    orderService.order(scanner,orders,productMap);
                    break;
                case 2:
                    orderService.viewOrders(orders,product);
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
