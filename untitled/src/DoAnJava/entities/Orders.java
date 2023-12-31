package DoAnJava.entities;

import java.time.LocalDate;

public class Orders {
    private static int autoId;
    private int id;
    private int productId;
    private LocalDate orderDate;
    private STATUS status;
    private int numberOfProducts;
    private double total;
    private User user;
    private Approve approval;


    public Orders( int productId, LocalDate orderDate, STATUS status, int numberOfProducts, double total, Approve approval, User user) {
        this.id = ++autoId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.status = status;
        this.numberOfProducts = numberOfProducts;
        this.total = total;
        this.user = user;
        this.approval = approval;
    }

    public Orders(int productId, LocalDate orderDate, STATUS status, int numberOfProducts, double total, User user) {
        this.id = ++autoId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.status = status;
        this.numberOfProducts = numberOfProducts;
        this.total = total;
        this.user = user;
    }

    public Orders(int productId, LocalDate orderDate, int numberOfProducts, double total) {
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public Approve getApproval() {
        return approval;
    }

    public void setApproval(Approve approval) {
        this.approval = approval;
    }

    public Orders() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public User getCustomer() {
        return user;
    }

    public void setCustomer(User customer) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", status=" + status +
                ", total=" + total +
                ", customer=" + user +
                '}';
    }


}