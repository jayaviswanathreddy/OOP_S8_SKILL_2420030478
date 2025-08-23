package skill4;

public class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Book[Title=" + title + ", Author=" + author + ", Price=" + price + "]";
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("The Great Gatsby");
        b.setAuthor("F. Scott Fitzgerald");
        b.setPrice(10.99);
        System.out.println(b);
    }
}

