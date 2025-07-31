import java.util.*;

public class book {
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    Scanner sc = new Scanner(System.in);

    public book() {
        System.out.println("Enter Serial Number of Book: ");
        this.sNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Book Name: ");
        this.bookName = sc.nextLine();

        System.out.println("Enter Author Name: ");
        this.authorName = sc.nextLine();

        System.out.println("Enter Quantity of Book: ");
        this.bookQty = sc.nextInt();
        bookQtyCopy = this.bookQty;
    }
    public static void main(String[] args) {
        
    }
}
