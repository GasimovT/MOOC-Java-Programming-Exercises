
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String st;
            while ((st = bf.readLine()) != null) {
                String[] parts = st.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
