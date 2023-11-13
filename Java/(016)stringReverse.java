/*
TASK:
  Given a string A, print Yes if it is a palindrome, print No otherwise.
CONSTRAINTS:
  A will consist of at most 50 lower-case English letters.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = "";
        
        for (int i = 0; i < A.length(); i++) {
            char letter = A.charAt(i);
            reversed = letter + reversed;        
        }
        
        if (A.compareTo(reversed) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
