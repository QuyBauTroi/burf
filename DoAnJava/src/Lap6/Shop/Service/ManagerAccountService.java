package Lap6.Shop.Service;


import Lap6.Shop.entities.Product;
import Lap6.Shop.entities.STATUS;
import Lap6.Utils.Utils;

import java.util.*;

public class ManagerAccountService {
    Utils utils = new Utils();

    Map<Integer, Product> productMap = new HashMap<>();

    public void menuManager(Scanner scanner, RegisterService registerService, StaffAccountService staffAccountService) {
        System.out.println("1 - Tạo tài khoản cho nhân viên");
        System.out.println("2 - Đăng bài bán sản phẩm");
        System.out.println("3. Xem tất cả sản phẩm");
        System.out.println("4. Xoá sản phẩm");
        System.out.println("5. Xem thong tin cua tat ca nhan vien");
        System.out.println("6. Cập nhật sản phẩm");
        System.out.println("7. Tìm kiếm sản phẩm theo tên");
        System.out.println("8. Đăng xuất");
        System.out.println("---------- Enter your choice -----------");
        int choice;
        do {
            choice = utils.inputInt(scanner);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerService.registerStaff(scanner);
                    break;
                case 2:
                    addProduct(scanner);
                    break;
                case 3:
                    viewProduct();
                    break;
                case 4:
                    deleteProduct(scanner);
                    break;
                case 5:
                    registerService.viewStaff();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }




    // 2 - Thêm mới sản phẩm //
    public void addProduct(Scanner scanner){
        System.out.println("Them san pham");
        System.out.print("Nhap so luong san pham ban muon them : ");
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


    // 3 - Hiển thị tất cả sản phẩm //
    public void viewProduct(){
        System.out.println(productMap);
    }


    // 4 - Xoá sản phấm //
    public void deleteProduct(Scanner scanner){
        String choice = "";
        do {
            System.out.println("Nhap ten san pham muon xoa: ");
            String productId = utils.inputString(scanner);
            Set<Integer> set = productMap.keySet();
            for (Integer key: set) {
                if (productId.equalsIgnoreCase(productMap.get(key).getName())) {
                    productMap.remove(key);
                    System.out.println("da xoa san pham tim thay");
                }
                else {
                    System.out.println("khong tim thay lam lai ? y/n");
                    choice = utils.inputString(scanner);
                }
            }
        }
        while (choice.equalsIgnoreCase("y"));
    }



    public Product findProductByName(Scanner scanner){
        System.out.println("Nhap ten sản phẩm muốn tìm");
        while (true){
            String name = utils.inputString(scanner);
            if (productMap.containsKey(name)){
                return productMap.get(name);
            }else {
                System.out.println("Khong tim thay san pham , vui long nhap lai");
            }
        }
    }




}