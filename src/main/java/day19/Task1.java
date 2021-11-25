package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> countword = new HashMap<>();
        int count = 0;
        try {
            File file = new File("src/main/resources/dushi.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (countword.containsKey(word)) {
                    count++;
                }
                countword.put(word, count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        ArrayList<Integer> num = new ArrayList<>(countword.values());
        Collections.sort(num);
        //System.out.println("Чичиков" + countword.get("Чичиков")); 87726
        System.out.println(num.subList(num.size() - 100, num.size()));
    }
}
