package Techmatter.entities;

public class Reader {
    private int id;
    private static int autoid;
    private String name;
    private int phoneNumber;
    private String address;

    public Reader( String name, int phoneNumber, String address) {
        this.id = ++autoid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Reader() {

    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoid() {
        return autoid;
    }

    public static void setAutoid(int autoid) {
        Reader.autoid = autoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
