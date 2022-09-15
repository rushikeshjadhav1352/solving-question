class Solution {
    
    public int[][] merge(int[][] intervals) {
       Pair[] pairs=new Pair[intervals.length];
        
        for(int i=0;i<intervals.length;i++){
            pairs[i]=new Pair(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<pairs.length;i++){
            if(i==0){
                st.push(pairs[i]);
            }else{
                Pair top=st.peek();
                if(pairs[i].st>top.et){
                    st.push(pairs[i]);
                }else
                    top.et=Math.max(top.et,pairs[i].et);
            }
        }
        Stack<Pair> rs=new Stack<>();
        while(st.size()>0){
            rs.push(st.pop());
        }
        int arr[][]=new int[rs.size()][2];
        for(int i=0;i<arr.length;i++){
            Pair p=rs.pop();
            arr[i][0]=p.st;
            arr[i][1]=p.et;
        }
        return arr;
    }
}
class Pair implements Comparable<Pair>{
    
    int st;
    int et;
    Pair(int s,int e){
        this.st=s;
        this.et=e;
    }
    public int compareTo(Pair other){
        if(this.st!=other.st){
            return this.st-other.st;
        }else
            return this.et-other.et;
    }
}