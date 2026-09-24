import java.util.HashMap;
import java.util.Map;

public class ACP_SubstringCounter {

    /**
     * Determines the number of occurrences of all substrings of a given length.
     * 
     * @param str The original input string.
     * @param length The length of the substrings to find.
     * @return A map containing each unique substring and its frequency count.
     */
    public static Map<String, Integer> countSubstrings(String str, int length) {
        // Create a map to store substrings and their respective counts
        Map<String, Integer> counts = new HashMap<>();
        
        // Return an empty map if inputs are invalid or length is out of bounds
        if (str == null || length <= 0 || length > str.length()) {
            return counts;
        }
        
        // Loop through the string to extract all possible substrings of the given length
        for (int i = 0; i <= str.length() - length; i++) {
            String sub = str.substring(i, i + length);
            
            // Update the count for the substring in the map
            counts.put(sub, counts.getOrDefault(sub, 0) + 1);
        }
        
        return counts;
    }
}
