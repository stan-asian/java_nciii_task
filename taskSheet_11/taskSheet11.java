package taskSheet_11;

public class taskSheet11 {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 2000, 12.34);
        Book book2 = new Book("Joke Lang!", "JK Rowling", 2000, 12.34);
        System.out.println(book1);
        System.out.println(book2);
    }
}

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    static int num;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nBook" + (++num) +
                "\nTitle: " + this.title +
                "\nAuthor: " + this.author +
                "\nYear Published: " + this.yearPublished +
                "\nPrice: " + this.price;
    }

}
