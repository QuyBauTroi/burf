package Lap6.FPTShop.Service;

import Lap6.FPTShop.entities.Product;
import Lap6.FPTShop.entities.STATUS;
import Lap6.Utils.Utils;

import java.util.*;

public class ProductService {
    Utils utils = new Utils();
    Map<Integer,Product>productMap = new HashMap<>();

    public void addProduct(Scanner scanner){
        System.out.println("Them san pham");
        System.out.println("Nhap so luong san pham ban muon them:");
        int n = utils.inputInt(scanner);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten san pham thu " +(i+1)+":");
            String name = utils.inputString(scanner);
            boolean isValidStatus = false;
            STATUS status = null;
            while (!isValidStatus) {
                System.out.print("Nhap tinh trang san pham: (NEW/OLD)");
                String typeString = scanner.nextLine().toUpperCase();
                try {
                    status = STATUS.valueOf(typeString);
                    isValidStatus = true;
                } catch (Exception e) {
                    System.out.println("Tinh trang nhap vao khong hop le. Vui long nhap lai.");
                }
            }
            System.out.print("Nhap gia tien :");
            double price = utils.inputDouble(scanner);
            System.out.print("Su mieu ta :");
            String description = utils.inputString(scanner);
            System.out.print("Nhap so luong san pham thu" + (i+1) +":");
            int quantity = utils.inputInt(scanner);
            Product product = new Product(name,price,description,quantity,status);
            productMap.put(product.getId(),product);
        }


    }

    public void viewProduct(){
        System.out.println(productMap);

    }

    public Product findProductById(Scanner scanner){
        while (true) {
            int id  = utils.inputInt(scanner);
            if (productMap.containsKey(id)){
                return productMap.get(id);
            }else {
                System.out.println("Khong tim thay san pham , vui long nhap lai");
            }
        }
    }
    public Product findProductByName(Scanner scanner){
        while (true){
            String name = utils.inputString(scanner);
            if (productMap.containsKey(name)){
                return productMap.get(name);
            }else {
                System.out.println("Khong tim thay san pham , vui long nhap lai");
            }
        }
    }

    public void deleteProduct(Scanner scanner){
        String choice = "";
        do {
            System.out.println("Nhap ten sach muon xoa: ");
            String productName = utils.inputString(scanner);
            Set<Integer> set = productMap.keySet();
            for (Integer key: set) {
                if (productName.equalsIgnoreCase(productMap.get(key).getName())) {
                    productMap.remove(key);
                    System.out.println("da xoa sach tim thay");
                }
                else {
                    System.out.println("khong tim thay lam lai ? y/n");
                    choice = utils.inputString(scanner);
                }
            }
        }
        while (choice.equalsIgnoreCase("y"));

    }


}
