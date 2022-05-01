
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        try {
            File file = new File(fileName);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String st;
            int gamesCount = 0;
            int gamesWins = 0;
            int gamesLoss = 0;
            while ((st = bf.readLine()) != null) {
                String[] parts = st.split(",");
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].contains(teamName)) {
                        gamesCount++;
                        if (parts[0].contains(teamName)) {
                            if (Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
                                gamesWins++;
                            } else if ((Integer.parseInt(parts[2]) < Integer.parseInt(parts[3]))) {
                                gamesLoss++;
                            }
                        }
                        if (parts[1].contains(teamName)) {
                            if (Integer.parseInt(parts[3]) > Integer.parseInt(parts[2])) {
                                gamesWins++;
                            } else if ((Integer.parseInt(parts[3]) < Integer.parseInt(parts[2]))) {
                                gamesLoss++;
                            }
                        }
                    }

                }
            }
            System.out.println("Games: " + gamesCount);
            System.out.println("Wins: " + gamesWins);
            System.out.println("Losses: " + gamesLoss);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }

}
