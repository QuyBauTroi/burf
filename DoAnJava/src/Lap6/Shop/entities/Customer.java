package Lap6.Shop.entities;

import Lap6.Shop.Account.User;

public class Customer extends User{
    private static int autoId;
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private Orders orders;

    public Customer(String username, String email, String password,int role,String name, String phoneNumber, String address) {
        super(username,email,password,role);
        this.id = ++autoId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Customer(String username, String email, int role, String name, String phoneNumber, String address) {
        super(username,email,role);
        this.id = ++autoId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Customer() {
        super();
    }



    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }


    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Customer.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getCustomerInfo() {
        return "ID: " + id + ", Tên: " + name + " Số điện thoại: "+ phoneNumber +", Địa chỉ: " + address;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}