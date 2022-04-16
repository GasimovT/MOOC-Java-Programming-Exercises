
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        printNumbersInRange(numbers, 1, 8);


    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerlimit, int upperlimit) {
        for (Integer num : numbers) {
            if (num >= lowerlimit && num <= upperlimit) {
                System.out.println(num);
            }
        }
    }

}
