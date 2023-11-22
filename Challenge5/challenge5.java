import java.util.*;
import java.io.*;


public class challenge5 {
    public static void main(String[] args)
    {
        File file = new File("test.txt");

        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            Map<String, Integer> wordCountMap = new HashMap<>();
            int totalCount = 0;

            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                totalCount++;
            }
            String mostFrequentWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }
            System.out.println("Here is the number of words in the text file : " + wordCountMap.entrySet());
            System.out.println("Number of words: " + totalCount);  // Use totalCount instead of wordCountMap.size()
            System.out.println("Most frequent word: " + mostFrequentWord);
            System.out.println("Frequency: " + maxCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
    }

}

//Thanks to Toshiro