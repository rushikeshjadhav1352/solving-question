class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> ans1=new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String s=emails[i];
            String ans="";
            int j=0;
            while(s.charAt(j)!='@' && s.charAt(j)!='+'){
                if(s.charAt(j)!='.')
                ans=ans+s.charAt(j);
                j++;
            }
            int n=s.indexOf('@');
            for(int k=n;k<s.length();k++){
                ans=ans=ans+s.charAt(k);
            }
            ans1.add(ans);
        }
        return ans1.size();
    }
}