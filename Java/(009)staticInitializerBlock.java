/*
TASK:
  Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. 
  You should read the variables from the standard input.
  If B <= 0 or H <= 0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
INPUT FORMAT:
  There are two lines of input. 
  The first line contains B: the breadth of the parallelogram. 
  The next line contains H: the height of the parallelogram.
CONSTRAINTS:
  -100 <= B <= 100
  -100 <= H <= 100
OUTPUT FORMAT:
  If both values are greater than zero, then the main method must output the area of the parallelogram. 
  Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner scan = new Scanner(System.in);
    static boolean flag = true;
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
