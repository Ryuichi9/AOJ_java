/**
 * AOJ 0031 Weight
 */

 import java.util.*;

 public class Weight{

    static int[] weight = {1,2,4,8,16,32,64,128,256,512};

     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while(scn.hasNext()){
            int[] ans = new int[weight.length];
            int num = scn.nextInt();
            int cnt = 0;
            for(int i = weight.length-1;i>=0;i--){
                if((num - weight[i]) >= 0){
                    ans[i] = weight[i];
                    num = num -weight[i];
                    if(cnt<i)cnt = i;
                }
            }
            for(int i = 0;i<cnt;i++){
                if(ans[i]!=0)
                   System.out.print(ans[i]+" ");
            }
            System.out.println(ans[cnt]);
        }

    } 
}