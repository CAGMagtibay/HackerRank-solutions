/*
TASK:
  Read n lines of input until you reach EOF, then number and print all n lines of content.
INPUT FORMAT:
  Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
OUTPUT FORMAT:
  For each line, print the line number, followed by a single space, and then the line content received as input.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int lineNum = 1;
        while (scan.hasNext()) {
            System.out.printf("%d %s%n", lineNum, scan.nextLine());
            lineNum++;
        }
    }
}
