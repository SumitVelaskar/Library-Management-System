import java.time.LocalDate;

public class Book {
    String name, author;
    User issuedTo;
    LocalDate issueDate;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
