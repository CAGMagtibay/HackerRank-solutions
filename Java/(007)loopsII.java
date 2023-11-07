/*
TASK:
  You are given q queries in the form of a, b, and n. 
  For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
    (a + 2^0 * b), (a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + ... + 2^(n - 1) * b)
INPUT FORMAT:
  The first line contains an integer, q, denoting the number of queries.
  Each line i of the q subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.
CONSTRAINTS:
  0 <= q <= 500
  0 <= a, b <= 50
  1 <= n <= 15
OUTPUT FORMAT:
  For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            // added code
            int s = a;
            for (int j = 0; j < n; j++) {
                int additive = b * (int) Math.pow(2, j);
                s += additive;
                System.out.printf("%d ", s);
                
            }
            System.out.printf("%n");
        }
        in.close();
    }
}
