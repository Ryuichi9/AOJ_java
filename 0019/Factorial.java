/**
 * AOJ 0019 Factorial
 */

 import java.util.Scanner;

 public class Factorial{
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(f(n));
        scn.close();
     }

     public static long f(long x){
        if(x!=0){
            return x * f(x-1);
        }else{
            return 1;
        }
     }
 }