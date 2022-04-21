
import java.util.Scanner;

import static java.util.Collections.max;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pieces;
        int sum = 0;
        int count = 0;
        int max = 0;
        String longestName = " ";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            pieces = input.split(",");
            sum += Integer.valueOf(pieces[1]);
            count++;
            if (pieces[0].length() > max) {
                max = pieces[0].length();
                longestName = pieces[0];

            }
        }
        System.out.println("Longest name: " + longestName);
        if (count > 0) {
            System.out.println("Average of the birth years: " + 1.0 * sum / count);
        }


    }
}
