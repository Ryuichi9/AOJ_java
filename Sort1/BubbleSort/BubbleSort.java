/**
 * AOJ Sort1 - Bubble Sort
 */

import java.util.Scanner;

 public class BubbleSort{
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i<n; i++){
            nums[i] = scn.nextInt();
        }

        int hoge, cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                if(nums[j] < nums[j-1]){
                    hoge = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = hoge;
                    cnt++;
                }
            }
        }

        for(int i = 0; i<n-1; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[n-1]+"\n"+cnt);
     }
 }