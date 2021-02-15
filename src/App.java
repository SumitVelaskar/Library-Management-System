import java.util.Scanner;

public class App {

    public static void manager() {

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Library myLibrary = new Library();
        User sumit = new User("Sumit");
        Book hp = new Book("Harry Potter", "J.K. Rowling");
        boolean killswitch = true;

        while (killswitch) {
            System.out.println(
                    "1. Add book to library\n2. Register user to library\n3. Isuue book from library\n4. Return book to library\n9. Exit application. ");
            System.out.println("Enter a option number");

            int num = scan.nextInt();
            switch (num) {
                case 1:
                    myLibrary.add(hp);
                    break;
                case 2:
                    myLibrary.registerUser(sumit);
                    break;
                case 3:
                    myLibrary.issueBook(hp, sumit);
                    break;
                case 4:
                    myLibrary.returnBook(sumit, hp);
                    break;
                case 9:
                    killswitch = false;
                    break;
                default:
                    System.out.println("Enter a valid option number");

            }
        }
        scan.close();

    }
}
