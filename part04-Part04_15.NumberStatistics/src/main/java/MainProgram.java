
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers: ");
        Statistics x = new Statistics();
        Statistics y = new Statistics();
        Statistics z = new Statistics();


        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }
            x.addNumber(input);
            if (input % 2 == 0) {
                y.addNumber(input);

            } else{
                z.addNumber(input);

            }

        }
        System.out.println("Sum: " + x.sum());
        System.out.println("Sum of even numbers: " + y.sum());
        System.out.println("Sum of odd numbers: " + z.sum());


    }
}
