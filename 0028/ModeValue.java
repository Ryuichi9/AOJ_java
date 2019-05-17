/**
 * AOJ 0028 Mode Value
 */

 import java.util.*;

 public class ModeValue{
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] nums = new int[101];
        while(scn.hasNext()){
            nums[scn.nextInt()]++;
        }

        int max = -1;

        for(int i=0; i<nums.length;i++){
            if(max<nums[i])
                max = nums[i];
        }
        for(int j =0;j<nums.length;j++){
            if(nums[j]==max)
            System.out.println(j);
        }
     }
 }