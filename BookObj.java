class Book {
    String name;
    String writer;
    int pages;
    int publishedYear;

    public Book(String name, String writer, int pages, int publishedYear) {
        this.name = name;
        this.writer = writer;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    public void showDetails() {
        System.out.println("Book Title: " + name);
        System.out.println("Written by: " + writer);
        System.out.println("Pages: " + pages);
        System.out.println("Published: " + publishedYear);
        System.out.println();
    }
}

public class BookObj {
    public static void main(String[] args) {
        Book firstBook = new Book("The Hobbit", "J.R.R. Tolkien", 310, 1937);
        Book secondBook = new Book("To Kill a Mockingbird", "Harper Lee", 281, 1960);

        System.out.println("First Book:");
        firstBook.showDetails();

        System.out.println("Second Book:");
        secondBook.showDetails();
    }
}
