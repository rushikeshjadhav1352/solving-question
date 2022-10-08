class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
           char j=s.charAt(i);
          if(j=='[' || j=='{' || j=='('){
                ans.push(j);
        }
            else if(ans.isEmpty()){
                return false;
            }
        else {if((ans.peek()=='[' && s.charAt(i)!=']') || (ans.peek()=='{' && s.charAt(i)!='}' )|| (ans.peek()=='(' && s.charAt(i)!=')')){
               return false;
            }else
            ans.pop();
        }
        }
        if(ans.size()!=0){
            return false;
        }
        return true;
    }
}