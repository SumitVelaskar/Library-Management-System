import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> registeredUsers = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        if (!registeredUsers.contains(user)) {
            registeredUsers.add(user);
            user.isRegistered = true;
        } else
            System.out.println("The user " + user.name + " is already registered");
    }

    public void issueBook(Book book, User user) {
        if (books.contains(book) && user.isRegistered) {
            book.issueDate = LocalDate.now();
            book.issuedTo = user;
            user.issuedBooks.add(book);
            books.remove(book);
            System.out.println(user.name + " issued the book " + book.name + " by the author " + book.author);
        } else
            System.out.println("Sorry book was not issued");
    }

    public void returnBook(User user, Book book) {
        if (registeredUsers.contains(user)) {
            if (user.issuedBooks.contains(book)) {
                books.add(book);
                book.issuedTo = null;
                book.issueDate = null;
                user.issuedBooks.remove(book);
                System.out.println(user.name + " succesfully added the book " + book.name + " to the library");
            }
        } else {
            System.out.println("This user is not registered");
        }
    }
}
