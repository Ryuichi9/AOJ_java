/**
 * AOJ 0094 Calculation of Area
 */

 import java.util.Scanner;

 public class CalculationOfArea{
     public static void main(String[] args){
         final double TUBO = 3.305785;
         Scanner scanner = new Scanner(System.in);
         int a,b;
         a = scanner.nextInt();
         b = scanner.nextInt();

         System.out.printf("%.6f",a*b/TUBO);
     }
 }