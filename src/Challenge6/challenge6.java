import java.util.*;
import java.io.*;


public class challenge6 {
    public static void main(String[] args)
    {
        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(new FileInputStream(file));

            HashMap<Character, Integer> map = new HashMap<>();

            while (sc.hasNext()) {
                String words = sc.next();
                Scanner letterSc = new Scanner(words);
                for (int i = 0; i < words.length(); i++) {
                    String word = words.toLowerCase();
                    char chars = word.charAt(i);
                    map.put(chars, map.getOrDefault(chars, 0) + 1);
                }
            }
            Character mostFrequentWord = 'c';
            int maxCount = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }
            System.out.println("Here is the number of letters in each words : " + map.entrySet());
            System.out.println("Here is the number of type the most used letter has been used : " + maxCount);
            System.out.println("Here is the most used letter : " + mostFrequentWord);
        } catch (FileNotFoundException e) {
            System.out.println("Nope");
        }
    }
}