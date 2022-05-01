
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String st;
            while ((st = bf.readLine()) != null) {
                System.out.println(st);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
