
import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        int calc = (int) Math.pow(x1 + x2, 0.5);

        System.out.println(calc);


    }
}
