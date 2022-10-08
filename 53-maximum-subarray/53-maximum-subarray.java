class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ans=0;
       // HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          ans=ans+nums[i];
          max=Math.max(max,ans);
            if(ans<0){
                ans=0;
            }
            
        }
        return max;
        
    }
}