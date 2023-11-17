package Lap6.Shop.Service;

import Lap6.Shop.entities.Customer;
import Lap6.Shop.entities.Orders;
import Lap6.Shop.entities.Product;
import Lap6.Shop.entities.STATUS;
import Lap6.Utils.Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    Utils utils = new Utils();
    ArrayList<Orders> orders = new ArrayList<>();
    // Phương thức order sản phẩm //
    public void order(Scanner scanner , ManagerAccountService managerAccountService, Customer customer){
        // Hiển thị danh sách sản phẩm
        managerAccountService.viewProduct();
        //Nhap san pham mua
        System.out.println("Nhap id  san pham ban muon mua:");
        int productId = utils.inputInt(scanner);
        Product product = managerAccountService.productMap.get(productId);
        if (product != null) {
            System.out.println("Nhap so luong san pham muon order:");
            int numberOfProducts = utils.inputInt(scanner);
            // Kiểm tra số lượng đặt hàng có đủ hay không
            if (numberOfProducts <= product.getQuantity()) {
                // Giảm số lượng trong danh sách sản phẩm
                product.setQuantity(product.getQuantity() - numberOfProducts);
            }
            // Phuong thuc kiem tra san pham ( neu ko con hang se bao Het hang / neu dat qua so luong trong kho se order lai )
            else if(product.getQuantity() ==  0 ){
                System.out.println("San pham da het hang, vui long order sản phẩm khác");
                return;
            } else if (product.getQuantity()< numberOfProducts) {
                System.out.println("Ban da order qua so luong san pham trong kho , vui long order lai:");
                return;
            }
            //  Nhap Status và kiểm tra status //
            boolean isValidStatus = false;
            STATUS status = null;
            while (!isValidStatus) {
                System.out.println("Nhap tinh trang san pham: (NEW/OLD)");
                String typeString = scanner.nextLine().toUpperCase();
                try {
                    status = STATUS.valueOf(typeString);
                    isValidStatus = true;
                    boolean foundMatchingStatus = false;
                    for (Product product1 : managerAccountService.productMap.values()) {
                        if (product1.getStatus() == status) {
                            foundMatchingStatus = true;
                            break;
                        }
                    }
                    if (!foundMatchingStatus) {
                        System.out.println("Không có sản phẩm có tình trạng này. Vui lòng nhập lại.");
                        isValidStatus = false;
                    }
                } catch (Exception e) {
                    System.out.println("Tinh trang nhap vao khong hop le. Vui long nhap lai.");
                }
            }
            // Ngày dặt hàng (ngày hiện tại)
            LocalDate orderDate = LocalDate.now();

            // In ra đơn hàng và tính tiền
            double total = numberOfProducts * product.getPrice();
            System.out.println("\nThông tin đơn hàng :");
            System.out.println("Sản phẩm: " + product.getName());
            System.out.println("Số lượng: " + numberOfProducts);
            System.out.println("Tổng tiền: $" + total);
            Orders order = new Orders(productId,orderDate,status,numberOfProducts,total,customer);
            orders.add(order);

        }else {
            System.out.println("Không tìm thấy sản phẩm với ID đã nhập.");
        }

        System.out.println("Sản phảm của bạn đã được thêm vào giỏ hàng");
    }
    // Xem tất cả đơn hàng đã được order
    public void viewOrders(){
        System.out.println(orders);
    }
}
