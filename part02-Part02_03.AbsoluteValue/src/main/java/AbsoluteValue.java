
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int num = Integer.valueOf(scanner.nextLine());

        if (num<0) {
            num = -1 * num;
            System.out.println(num);
        } else {
            System.out.println(num);
        }

    }
}
