/*
TASK:
  INPUT FORMAT:
    A single string, s.
  CONSTRAINTS:
    1 <= length of s <= 4 * 10^5
    s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points, commas, question marks, periods, underscores, apostrophes, and at symbols.
  OUTPUT FORMAT:
    On the first line, print an integer, n, denoting the number of tokens in string s (do not need to be unique).
    Next, print each of the n tokens on a new line in the same order as they appear in input string s.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        String[] splitS = s.trim().split("[ !,?.\\_'@]+");
        
        if (s.trim().length() == 0 || s.trim().length() > 400000) {
            System.out.println(0);
            return;
        }
        else {
            System.out.println(splitS.length);
        }
        
        
        for (String token : splitS) {
            System.out.println(token);
        }
    }
}
