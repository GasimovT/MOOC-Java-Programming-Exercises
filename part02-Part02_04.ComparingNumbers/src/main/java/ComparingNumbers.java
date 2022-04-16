
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();


        if (x1>x2) {
            System.out.println(x1+" is greater than "+x2+".");
        } else if (x2>x1) {
            System.out.println(x1+" is smaller than "+x2+".");

        } else {
            System.out.println(x1+" is equal to "+x2+".");

        }




    }
}
