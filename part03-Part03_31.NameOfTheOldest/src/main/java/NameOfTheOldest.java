
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pieces;
        int max = 0;
        String nameOfOldest = " ";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            pieces = input.split(",");
            if (Integer.valueOf(pieces[1]) > max) {
                max = Integer.valueOf(pieces[1]);
                nameOfOldest = pieces[0];

            }

        }

        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
