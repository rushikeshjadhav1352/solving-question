class Solution {
    public int maxProfit(int[] nums) {
        int ans=0;
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            
            
            
            
           min=Math.min(min,nums[i]); 
            profit=nums[i]-min;
           ans=Math.max(ans,profit); 
            
        }
        return ans;
    }
}