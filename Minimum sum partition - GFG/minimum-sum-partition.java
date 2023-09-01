//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

 
class Solution
{
 
public int minDifference(int nums[], int n) 
{ 
    // Your code goes here
     int N=nums.length;
        int TotalSum=0;
        for(int i=0;i<N;i++){
            TotalSum+=nums[i];
        }
 
        int halfSum=Math.abs(TotalSum/2);
 
        boolean dp[][]=new boolean[N+1][halfSum+1];
        // base initialization 
        for(int i=0;i<=N;i++){
            for(int j=0;j<=halfSum;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        
        //choice diagram
        for(int i=1;i<=N;i++){
            for(int j=1;j<=halfSum;j++){
               if(nums[i-1]<=j){
                   dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j]; // dono lena hai ya nahi lena 
               }
               else{
                   dp[i][j]=dp[i-1][j]; // nahi lena 
               }
            }
        }
 
        int minValue=Integer.MAX_VALUE;
        for(int j=halfSum;j>=0;j--){
            if(dp[N][j]){ // n beacause last wala row
                minValue=Math.min(minValue,TotalSum-2*j);
            }
        }
        return minValue;
} 
}