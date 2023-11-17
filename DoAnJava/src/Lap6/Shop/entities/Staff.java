package Lap6.Shop.entities;


import Lap6.Shop.Account.User;

public class Staff extends User {
    private static int autoId;
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;

    public Staff(String username, String password,int role, String name, String phoneNumber, String address, String email) {
        super(username,password,role);
        this.id = ++autoId; 
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public Staff(String username, String email, String password, int role, String name, String phoneNumber, String address) {
        super(username,email,password,role);
        this.id = ++autoId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Staff.autoId = autoId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
