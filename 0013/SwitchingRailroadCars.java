/**
 * AOJ 0013 Switching Railroad Cars
 */

 import java.util.Scanner;
 import java.util.Stack;

 public class SwitchingRailroadCars{
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int num;
        while(scn.hasNext()){
            num = scn.nextInt();
            if(num == 0){
                System.out.println(stack.pop());
            }else{
                stack.push(num);
            }
        }
        scn.close();


     }
 }