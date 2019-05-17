/**
 * AOJ 3051 Lunch
 */

 import java.util.*;

 public class Lunch{
     public static void main(String[] args){
         int a,b,c;
         Scanner scn = new Scanner(System.in);

         a = scn.nextInt();
         b = scn.nextInt();
         c = scn.nextInt();

         if(a>b){
            if(a>c){
                System.out.println("A");
            }else{
                System.out.println("C");
            }
         }else{
             if(b>c){
                System.out.println("B");
             }else{
                System.out.println("C");
             }
         }
     }
 }