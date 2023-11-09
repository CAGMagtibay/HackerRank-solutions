/*
TASK:
  Given two strings of lowercase English letters, A and B, perform the following operations:
    Sum the lengths of A and B.
    Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
    Capitalize the first letter in A and B and print them on a single line, separated by a space.
INPUT FORMAT:
  The first line contains a string A. The second line contains another string B. 
  The strings are comprised of only lowercase English letters.
OUTPUT FORMAT:
  There are three lines of output:
    For the first line, sum the lengths of A and B.
    For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
    For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
