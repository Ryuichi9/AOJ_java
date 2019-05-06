/**
 * Getting Started - MaximumProfit
 * 2019/5/4
 */

import java.util.Scanner;
import java.lang.Integer;

public class MaximumProfit{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int set = scn.nextInt();

        int[] nums = new int[set];

        for(int i = 0; i < set; i++){
            nums[i] = scn.nextInt();
        }
        scn.close();

        int max = ReturnMaximumProfit(nums);
        
        System.out.println(max);
    }

    public static int ReturnMaximumProfit(int[] nums){
        int max = Integer.MIN_VALUE;

        int min = nums[0];
        for(int j = 1; j<nums.length; j++){
            if(max < nums[j]-min)
                max = nums[j]-min;
            if(min > nums[j])
                min = nums[j];
        }

        return max;
    }
}