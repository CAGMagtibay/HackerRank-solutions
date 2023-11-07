/*
TASK:
  Given an input integer, you must determine which primitive data types are capable of properly storing that input.
INPUT FORMAT:
  The first line contains an integer, T, denoting the number of test cases.
  Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.
OUTPUT FORMAT:
  For each input variable n and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. 
    If yes, then print: 
      n can be fitted in:
      * dataType
    If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long).
    If the number cannot be stored in one of the four aforementioned primitives, print the line:
      n can't be fitted anywhere.
*/
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=(long)Math.pow(-2, 31) && x<=(long)(Math.pow(2,31)-1))System.out.println("* int");
                if(x>=(long)Math.pow(-2, 63) && x<=(long)(Math.pow(2,63)-1))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
