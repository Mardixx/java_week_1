import java.util.*;
import java.io.*;

public class challenge7 {
        public static void main (String[] args){
            String filePath = "test.csv";

            try{
                List<employee> csvLines = readCSVFile(filePath);

                //Accessing and printing a particular piece of information
                for (employee line : csvLines){
                    System.out.println(line.getName());
                }
            } catch (FileNotFoundException e){
                System.out.println("File not found: " + filePath);
            }
        }
        private static List<employee> readCSVFile(String filePath) throws FileNotFoundException {
            List<employee> csvLines = new ArrayList<>();

            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                // Ensure the array has enough elements
                if (data.length >= 3) {
                    String name = data[0];
                    String age = data[1];
                    String city = data[2];

                    employee csvLine = new employee(name, age, city);
                    csvLines.add(csvLine);
                }
            }

            scanner.close();

            return csvLines;
        }
}