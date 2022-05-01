
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try {
            File file1 = new File(file);
            BufferedReader bf = new BufferedReader(new FileReader(file1));
            String st;
            while ((st = bf.readLine()) != null) {
                String[] parts = st.split(",");
                persons.add(new Person(parts[0], Integer.parseInt(parts[1])));
            }

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        // and printing the read records
        return persons;

    }
}
