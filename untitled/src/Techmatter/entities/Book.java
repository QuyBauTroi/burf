package Techmatter.entities;

public class Book {
    private int id;
    private static int autoid;
    private  String bookName;
    private  String category;
    private String author;
    private int quantity;

    public Book( String bookName, String category, String author, int quantity) {
        this.id = ++autoid;
        this.bookName = bookName;
        this.category = category;
        this.author = author;
        this.quantity = quantity;
    }

    public Book() {

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
        Book.autoid = autoid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
