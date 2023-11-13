/*
TASK:
  Given a string, s and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.
FUNCTION DESCRIPTION:
  getSmallestAndLargest has the following parameters:
    string s: a string
    int k: the length of the substrings to find
  RETURNS:
    string: the string '+"/n"+' where and are the two substrings
INPUT FORMAT:
  The first line contains a string denoting s.
  The second line contains an integer denoting k.
CONSTRAINTS:
  1 <= |s| <= 1000
  s consists of English alphabetic letters only
*/
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // initialize smallest
        String smallest = s.substring(0, k);
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        // iterate through s
        for (int i = 0; i + k <= s.length(); i++) {
            String sub = s.substring(i, i + k);
            // compare to smallest and largest 
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
