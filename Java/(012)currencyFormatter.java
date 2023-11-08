/*
TASK:
  Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.
INPUT FORMAT:
  A single double-precision number denoting payment.
CONSTRAINTS:
  0 <= payment <= 10^9
OUTPUT FORMAT:
  On the first line, print US: u where u is payment formatted for US currency.
  On the second line, print India: i where i is payment formatted for Indian currency.
  On the third line, print China: c where c is payment formatted for Chinese currency.
  On the fourth line, print France: f, where f is payment formatted for French currency.
*/
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
