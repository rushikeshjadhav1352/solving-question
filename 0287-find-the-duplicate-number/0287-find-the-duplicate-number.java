class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
       while(i<nums.length){
           int curr=nums[i]-1;
           if(nums[i]!=nums[curr]){
               swap(nums,i,curr);
           }else{
               i++;
           }
       }
        for(int j=0;j<nums.length;j++){
           if(j+1!=nums[j]){
               return nums[j];
           }
        }
        return 0;
        
    }
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}