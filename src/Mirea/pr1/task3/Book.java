package Mirea.pr1.task3;

public class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.price = 200;
    }

    public Book(String name, int price) {
        this.name = name;
        this.author = "anonymous";
        this.price = 200;
    }

    public Book(String name) {
        this.name = name;
        this.author = "anonymous";
        this.price = 150;
    }

    public Book() {
        this.name = "Note Book";
        this.author = "unknown";
        this.price = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " + name + ", author: " + author + ", price: " + price + " rub";
    }

    public void discount10() {
        int newPrice = price - price * 10 / 100;
        System.out.println("Discount 10% Book: " + name + ", author: " + author + ", price: " + newPrice + " rub");
    }
}
