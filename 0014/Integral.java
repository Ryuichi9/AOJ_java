/**
 * AOJ 0014 Integral
 */

 import java.util.Scanner;

 public class Integral{

    final static int WIDTH = 600;

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int d = 0;
        while(scn.hasNext()){
            d = scn.nextInt();
            System.out.println(integral(d));
        }
        scn.close();
    }

    public static int f(int x){
        return x*x;
    }

    public static int integral(int d){
        int cnt = WIDTH / d;
        int sum = 0;
        
        for(int i = 0; i < cnt; i++){
            sum += d * f(i * d);
        }
        return sum;
        
    } 
 }