import java.util.ArrayList;

public class User {
    String name;
    boolean isRegistered;
    ArrayList<Book> issuedBooks = new ArrayList<>();

    User(String name) {
        this.name = name;
    }
}
