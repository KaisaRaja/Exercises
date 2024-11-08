package week1;

    public class Book {
        String title;
        String author;
        int yearPublished;

    public Book () { //default program
        title ="Unknown";
        author ="Unknown";
        yearPublished = 1900;

}   public Book (String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public static void main(String[] args) {
        Book book = new Book ("Red", "J.Doe", 2015);
        Book book2 = new Book ("Red", "J.Doe", 2020);
        book.displayDetails();


    }
    public void displayDetails() {
        System.out.println("Book details :" );
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);

    }
}