
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num==0) {
                break;
            } else if (num>0) {
                count=count+1;
                sum=sum+num;
                continue;

            } else if (num<0){
                continue;
            }
        }

        if (count>0) {
            double avg = (double) sum/count;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
