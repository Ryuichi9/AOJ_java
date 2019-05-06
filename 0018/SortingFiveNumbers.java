/**
 * AOJ 0018 Sorting Five Numbers
 */

 import java.util.Scanner;

 public class SortingFiveNumbers{
     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         int[] nums = new int[5];
         for(int i = 0; i < 5; i++){
            nums[i] = scn.nextInt();
         }
         nums = sort(nums);

         for(int i = 0;i < nums.length - 1; i++){
            System.out.print(nums[i] +" ");
         }
         System.out.println(nums[nums.length-1]);

     }

     public static int[] sort(int[] nums){
        int temp;
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[j] > nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        return nums;
     }
 }