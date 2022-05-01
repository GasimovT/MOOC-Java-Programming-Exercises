
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        try {
            File file = new File(fileName);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String st;
            while ((st = bf.readLine()) != null) {
                list.add(st);
            }

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((Integer.parseInt(list.get(i)) >= lowerBound) && (Integer.parseInt(list.get(i)) <= upperBound)) {
                count++;
            }
        }
        System.out.print("Numbers: " + count);


    }

}
