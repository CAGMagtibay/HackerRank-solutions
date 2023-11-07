/*
TASK:
  Given an integer, N, print its first 10 multiples. 
  Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
INPUT FORMAT:
  A single integer, N.
CONSTRAINTS:
  2 <= N <= 20
OUTPUT FORMAT:
  Print  lines of output; each line i (where 1 <= i <= 10) contains the result of N x i in the form:
    N x i = result.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }
    }
}
