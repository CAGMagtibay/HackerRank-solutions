/*
INPUT FORMAT:
  The first line contains a single string denoting s.
  The second line contains two space-separated integers denoting the respective values of start and end.
CONSTRAINTS:
  1 <= |s| <= 100
  0 <= start < end <=n
  String s consists of English alphabetic letters only.
OUTPUT FORMAT:
  Print the substring in the inclusive range from start to end - 1.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
    }
}
