class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
		 
        for(int i=s.length()-1;i>=0;i--){
            sb.insert(0,s.charAt(i));
            sb.deleteCharAt(s.length());
            String str=sb.toString();
            
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}