/*
INPUT FORMAT:
  Every line of input will contain a String followed by an integer.
  Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
OUTPUT FORMAT:
  In each line of output there should be two columns:
    The first column contains the String and is left justified using exactly  characters.
    The second column contains the integer, expressed in exactly 3 digits; 
      if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line 
                // %-15s - "-" left-justifies the string; "15" is the string's minimum field width
                // %03d - "0" pads extra 0s; "3" is the integer's minimum field width
                // %n - new line
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}
