package databaseB1.entities;

import java.time.LocalDate;

public class Orders {
    private static int autoId;
    private int id;
    private int productId;
    private LocalDate orderDate;
    private int numberOfProducts;
    private double total;



    public Orders(int productId, LocalDate orderDate, int numberOfProducts, double total) {
        this.id = ++autoId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.numberOfProducts = numberOfProducts;
        this.total = total;
}


    public Orders() {

    }



    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Orders.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }



    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", total=" + total +
                '}';
    }


}