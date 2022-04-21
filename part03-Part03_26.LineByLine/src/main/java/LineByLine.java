
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pieces;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            pieces = input.split(" ");
            if (pieces.length != 0) {
                for (String piece : pieces) {
                    System.out.println(piece);
                }
            }
        }


    }
}
