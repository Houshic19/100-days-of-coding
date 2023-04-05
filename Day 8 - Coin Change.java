//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends

class Solution{
    public long count(int coins[], int N, int sum) {
    long dp[][] = new long[N][sum+1]; 
    for(long ref[]:dp) Arrays.fill(ref,-1);
    return form(sum,coins,dp,0);
    }
    long form(int sum,int coins[],long dp[][],int index){
    if(sum < 0) return 0;
       if(sum == 0) return 1;
          if(dp[index][sum] > -1) return dp[index][sum];
                long total = 0;
                for(int i = index; i < coins.length; i++)
                total += form(sum-coins[i],coins,dp,i);
                return dp[index][sum] = total;
    
        
    }
}
