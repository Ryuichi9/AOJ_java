/**
 * AOJ 0159 The Best Body
 */

 import java.util.Scanner;
 public class TheBestBody{

     public static void main(String[] args){


        Scanner scn = new Scanner(System.in);
        int n;
        while(scn.hasNext()){
            n = scn.nextInt();
            if(n==0)break;
            int[][] data = new int[n][3];
            for(int i=0;i<n;i++){
                data[i][0] = scn.nextInt();
                data[i][1] = scn.nextInt();
                data[i][2] = scn.nextInt();
            }
            double[] bmi = new double[n];
            for(int j = 0;j<n;j++){
                bmi[j]=getBMI(data[j][2], data[j][1]);
            }
            System.out.println(data[getMin(bmi)][0]);
        }
        
     }

     public static double getBMI(int weight , int hight){
        final int BESTBMI =22;
        double hi = hight/100.0;
         return Math.abs(BESTBMI - weight/(hi*hi));
     }

     public static int  getMin(double[] bmi){
         double temp = Integer.MAX_VALUE;
         int num = 0;
         for(int i = 0;i<bmi.length;i++){
             if(temp > bmi[i]){
                temp = bmi[i];
                num = i;
             }
         }

         return num;
     }
 }