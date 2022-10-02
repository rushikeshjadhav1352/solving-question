class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums,0,nums.length-1,target);
    }
    int binarysearch(int arr[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
             return binarysearch(arr,low,mid-1,target);
        }
        return  binarysearch(arr,mid+1,high,target);
    }
}