class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1,num=0,val=0,idx1=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                num=nums[i];
                break;
            }
        }
        if(idx==-1){
            reverse(0,nums.length-1,nums);
            return;
        }
        int n=Integer.MAX_VALUE;
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]>num && nums[i]<=n){
                idx1=i;
                n=nums[i];
            }
        }
        int temp=nums[idx1];
        nums[idx1]=nums[idx];
        nums[idx]=temp;
        
         reverse(idx+1,nums.length-1,nums);
        
    }
    public void reverse(int s,int e,int arr[]){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            ++s;
            --e;
        }
    }
}