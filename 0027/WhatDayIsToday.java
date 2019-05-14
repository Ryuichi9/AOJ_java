/**
 * AOJ 0027 What day is today? 
 */

 import java.util.Scanner;
 import java.util.Calendar;

 public class WhatDayIsToday{
     public static void main(String[] args){
         final int YEAR = 2004;
         final String[] week ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int month,date;
        Scanner scn = new Scanner(System.in);
        while(scn.hasNext()){
            month = scn.nextInt()-1;
            date = scn.nextInt();
            if(month+date == -1)break;
            Calendar cal = Calendar.getInstance();
            cal.set(YEAR,month,date);
            System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)-1]);
        }

     }
 }