package Lap6.Shop.Service;

import Lap6.Shop.entities.Customer;
import Lap6.Shop.entities.Orders;
import Lap6.Shop.entities.Product;
import Lap6.Shop.entities.STATUS;
import Lap6.Utils.Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    Utils utils = new Utils();
    Customer customer = new Customer();

    public void menuCustomer(Scanner scanner,OrderService orderService, ManagerAccountService managerAccountService, RegisterService registerService,Customer customer){
        int choose;
        do {
            System.out.println("1. Xem thong tin tat ca san pham");
            System.out.println("2. Order san pham");
            System.out.println("3. Xem thong tin don hang cua ban than");
            System.out.println("4. Xem thong tin ca nhan");
            System.out.println("5. Thay doi username");
            System.out.println("6. Thay doi mat khau");
            System.out.println("7. Thay doi email");
            System.out.println("8. Dang xuat");
            choose = utils.inputInt(scanner);
            switch (choose){
                case 1:
                    managerAccountService.viewProduct();
                    break;
                case 2:
                    orderService.order(scanner, managerAccountService,customer);
                    break;
                case 3:
                    orderService.viewOrders();
                    break;
                case 4:
                    displayCustomerInfo(customer,scanner);
                    break;
                case 5:
                    registerService.changeUsername(scanner);
                    break;
                case 6:
                    registerService.changePassword(scanner);
                    break;
                case 7:
                    registerService.changeEmail(scanner);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lua chọn không hợp lệ , vui lòng chọn lại");
                    break;
            }
        }while (true);
    }

    public void displayCustomerInfo(Customer customer,Scanner scanner){
        if (customer.getName() == null || customer.getPhoneNumber() == null || customer.getAddress() == null) {
            System.out.println("Thông tin chưa được nhập. Vui lòng nhập thông tin sau:");
            System.out.print("Họ và tên: ");
            String name = utils.inputString(scanner);
            System.out.print("Số điện thoại: ");
            String phoneNumber = utils.inputString(scanner);
            System.out.print("Địa chỉ nhà: ");
            String address = utils.inputString(scanner);

            // Cập nhật thông tin
            customer.setName(name);
            customer.setPhoneNumber(phoneNumber);
            customer.setAddress(address);
        } else {
            // Hiển thị thông tin đã có và hỏi người dùng có muốn thay đổi không
            System.out.println("Họ và tên: " + customer.getName());
            System.out.println("Số điện thoại: " + customer.getPhoneNumber());
            System.out.println("Địa chỉ nhà: " + customer.getAddress());

            System.out.print("Bạn có muốn thay đổi thông tin không? (yes/no): ");
            String choice = utils.inputString(scanner);

            if ("yes".equalsIgnoreCase(choice)) {
                System.out.print("Họ và tên mới: ");
                String newName = utils.inputString(scanner);
                customer.setName(newName);

                System.out.print("Số điện thoại mới: ");
                String newPhoneNumber = utils.inputString(scanner);
                customer.setPhoneNumber(newPhoneNumber);

                System.out.print("Địa chỉ nhà mới: ");
                String newAddress = utils.inputString(scanner);
                customer.setAddress(newAddress);
            }
        }
    }
}

