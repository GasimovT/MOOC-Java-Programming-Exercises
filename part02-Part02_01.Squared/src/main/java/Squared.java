
import java.util.Scanner;
import java.lang.Math;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int num = Integer.valueOf(scanner.nextLine());

        int calc = (int) Math.pow(num, 2);

        System.out.println(calc);


    }
}
