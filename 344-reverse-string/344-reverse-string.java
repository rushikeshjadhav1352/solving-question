class Solution {
    public void reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
        ReverseString(s,low,high);
        
    }
    public void ReverseString(char[] s,int low,int high){
        if(low>high){
            return;
        }
        char temp=s[low];
        s[low]=s[high];
        s[high]=temp;
        ReverseString(s,low+1,high-1);
    }
}