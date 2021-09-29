package Mirea.pr1.task3;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Anna Karenina", "unknown", 300);
        Book b2 = new Book("The Man Without Qualities", "Robert");
        Book b3 = new Book("Odyssey", "unknown");
        Book b4 = new Book("The Arabian Nights", 350);
        Book b5 = new Book("Faust");
        Book b6 = new Book();
        b1.setAuthor("Leo Tolstoy");
        b2.setPrice(350);
        b3.setAuthor("Home");
        b5.setAuthor("Jame");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b4.discount10();
        b5.discount10();
        b6.discount10();
    }
}
