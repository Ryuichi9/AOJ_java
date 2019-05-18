/**
 * AOJ 0093 Leap Year
 */

 import java.util.Scanner;

 public class LeapYear{
     public static void main(String[] args){
         int a,b;
         Scanner scn = new Scanner(System.in);
         int y;
         boolean first = true;
         while(scn.hasNext()){
             a = scn.nextInt();
             b = scn.nextInt();
             int cnt = 0;
             y = a;
             if(a + b == 0)break;

             if(!first)System.out.println();
             else first = false;

             while(y<=b){
                while(true){
                    if(y%4 != 0)y++;
                    else break;
                }
                if(y>b)break;
                if(y % 100 == 0){
                    if(y % 400 == 0){
                        System.out.println(y);
                        cnt++;
                    }
                }else{
                    System.out.println(y);
                    cnt++;
                }
                y = y+4;
             }
             if(cnt == 0)
                System.out.println("NA");
         }
     }
 }