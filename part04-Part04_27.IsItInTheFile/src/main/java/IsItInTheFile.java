
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String st;
            while ((st = bf.readLine()) != null) {
                list.add(st);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
