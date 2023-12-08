package databaseB1.service;


import DoAnJava.Utils.Utils;
import DoAnJava.entities.*;
import databaseB1.entities.Products;

import java.time.LocalDate;
import java.util.*;

public class OrderService {
    Utils utils = new Utils();
    ProductService productService = new ProductService();
    public void order(Scanner scanner , ArrayList<Orders> orders, Map<Integer, Products> productsMap) {
        productService.viewProduct(productsMap);
        String choice;
        do {
            System.out.print("Nhap id  san pham ban muon mua:");
            int productId = utils.inputInt(scanner);
            Products product = productsMap.get(productId);
            if (product != null) {
                System.out.print("Nhap so luong san pham muon order:");
                int numberOfProducts = utils.inputInt(scanner);
                if (numberOfProducts <= product.getQuantity()) {

                    product.setQuantity(product.getQuantity() - numberOfProducts);
                }
                else if (product.getQuantity() == 0) {
                    System.out.println("San pham da het hang, vui long order sản phẩm khác");
                    return;
                } else if (product.getQuantity() < numberOfProducts) {
                    System.out.println("Ban da order qua so luong san pham trong kho , vui long order lai:");
                    return;
                }
                LocalDate orderDate = LocalDate.now();
                double total = numberOfProducts * product.getPrice();
                Orders order = new Orders(productId, orderDate, numberOfProducts, total);
                orders.add(order);
                viewOrders(orders,product);
                System.out.println("Đơn hàng của bạn đã được thêm vào giỏ hàng.");
            } else {
                System.out.println("Không tìm thấy sản phẩm với ID đã nhập.");
            }
            System.out.print("Ban co muon tiep tuc order san pham khong ? (Y/N)");
             choice= scanner.nextLine();
        }while (choice.equalsIgnoreCase("y"));
    }




    public void viewOrders(ArrayList<Orders> orders, Products product) {
        System.out.println("=======DANH SÁCH ĐƠN HÀNG CỦA BẠN=======");
        if (orders.isEmpty()) {
            System.out.println("Bạn chưa có đơn hàng nào.");
        } else {
            for (Orders order : orders) {
                System.out.print("ID Sản phẩm: " + product.getId());
                System.out.print("|| Tên sản phẩm: " + product.getName());
                System.out.print("|| Giá: " + product.getPrice());
                System.out.print("|| Số lượng sản phẩm order: " + order.getNumberOfProducts());
                System.out.println("|| Tổng tiền: $" + order.getTotal());
            }
        }
    }




}