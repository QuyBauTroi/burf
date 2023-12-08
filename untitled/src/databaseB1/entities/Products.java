package databaseB1.entities;

public class Products {
    private static int autoId;
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Products(String name, double price, int quantity) {
        this.id = ++autoId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name) {
        this.name = name;
    }

    public Products() {

    }
    

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Products.autoId = autoId;
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
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}