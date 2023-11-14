/*
FUNCTION DESCRIPTION:
  Complete the isAnagram function in the editor.
    isAnagram has the following parameters:
      string a: the first string
      string b: the second string
  RETURNS:
    boolean: if a and b are case-insensitive anagrams, return true. Otherwise, return false.
  INPUT FORMAT:
    The first line contains a string a.
    The second line contains a string b.
  CONSTRAINTS:
    1 <= length(a), length(b) <= 50
    Strings a and b consist of English alphabetic characters.
    The comparison should NOT be case sensitive.
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // check length
        if (a.length() != b.length()) {
            return false;
        }
        
        // make both Strings the same case
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // map characters of b and frequencies
        java.util.HashMap<Character, Integer> charMap = new java.util.HashMap<>();
        
        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            
            if (!charMap.containsKey(letter)) {
                charMap.put(letter, 1);
            }
            else {
                Integer frequency = charMap.get(letter);
                charMap.put(letter, ++frequency);
            }
        }
        
        // compare characters of a to the charMap of b
        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            
            if (!charMap.containsKey(letter)) {
                return false;
            }
            
            Integer frequency = charMap.get(letter);
            
            if (frequency == 0) {
                return false;
            }
            else {
                charMap.put(letter, --frequency);
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
