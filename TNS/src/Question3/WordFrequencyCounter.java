package Question3;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

	public static void main(String[] args) {
String input = "This is a test string. This string is for testing.";
        
        
        input = input.toLowerCase();
        
        
        String[] words = input.split("\\s+");

        
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        
        for (String word : words) {
            
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
               
                wordCountMap.put(word, 1);
            }
        }
        
     
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
