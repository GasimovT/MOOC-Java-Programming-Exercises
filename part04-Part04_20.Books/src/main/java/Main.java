import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, pubYear));


        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String infoAnswer = scanner.nextLine();

        if (infoAnswer.equals("everything")) {
            for (Book i : books) {
                System.out.println(i);
            }
        } else if (infoAnswer.equals("name")) {
            for (Book i : books) {
                System.out.println(i.getTitle());
            }
        }

    }
}
