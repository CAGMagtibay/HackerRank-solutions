/*
TASK:
  You are given a date. You just need to write the method, findDay, which returns the day on that date. 
  To simplify your task, we have provided a portion of the code in the editor.
FUNCTION DESCRIPTION:
  Complete the findDay function in the editor below.
    findDay has the following parameters:
      int: month
      int: day
      int: year
  RETURNS:
    string: the day of the week in capital letters
INPUT FORMAT:
  A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
CONSTRAINTS:
  2000 < year < 3000
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
        
        switch(dayNum) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6: 
                return "FRIDAY";
            case 7: 
                return "SATURDAY";
            default:
                return "INVALID DATE";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
