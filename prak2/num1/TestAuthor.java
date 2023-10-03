package prak2.num1;
import java.util.Scanner;

public class TestAuthor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
				System.out.print("Name: ");
        String inputname = sc.next();
				System.out.print("Email: ");
        String inputemail = sc.next();
			  System.out.print("Gender: ");
        char inputgender = sc.next().charAt(0);

        Author author1 = new Author(inputname, inputemail, inputgender);
        System.out.print(author1.toString());
    }
}
