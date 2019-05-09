/**
 * AOJ 0030 Sum of Integers
 */

 import java.util.Scanner;

 public class SumOfIntegers{
     public static void main(String[] args){

         Scanner scn = new Scanner(System.in);
         int n;
         int sum;
        while(true){
            n = scn.nextInt();
            sum = scn.nextInt();
            if(n + sum == 0)
                break;
            int[] set = new int[n];
            System.out.println(dfs(n,sum,9));
        }
     }

     private static int dfs(int n,int s,int r){
         if(n == 0 && s == 0)return 1;
         else if(n == 0 || s < 0 || r == -1)return 0;
         else return dfs(n,s,r-1) + dfs(n-1,s-r,r-1);
     }
 }