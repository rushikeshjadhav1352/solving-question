class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
       double ak=0.0;
        for(int i:nums1){
            ans.add(i);
        }
        for(int i:nums2){
            ans.add(i);
        }
      Collections.sort(ans);
        if(ans.size()%2==0){
            ak=(double)(ans.get((ans.size()/2))+ans.get((ans.size()/2)-1))/2;
        }
        else
        {
            ak=(double)ans.get((ans.size()/2));
        }
        return ak;
    }
}