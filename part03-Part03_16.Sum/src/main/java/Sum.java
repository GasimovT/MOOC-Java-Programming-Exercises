
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);
        numbers.add(0);

        int sum = sum(numbers);

        System.out.println(sum);

    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        if (list.size() == 0) {
            return -1;
        }
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

}
