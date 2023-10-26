//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int rs=0,re=matrix.length-1,cs=0,ce=matrix[0].length-1;
        
        while(rs<=re && cs<=ce){
            
            
            
           
            for(int i=cs;i<=ce;i++){
                //System.out.print(matrix[i][rs]);
                ans.add(matrix[rs][i]);
            }
            rs++;
           
            for(int i=rs;i<=re;i++){
                 //System.out.print(matrix[i][ce]);
                 ans.add(matrix[i][ce]);
                
            }
             ce--;
             if(rs<=re)
              for(int i=ce;i>=cs;i--){
                 //System.out.print(matrix[re][i]);
                 ans.add(matrix[re][i]);
                
            }
            re--;
            if(cs<=ce)
            for(int i=re;i>=rs;i--){
                
                 //System.out.print(matrix[i][cs]);
                 ans.add(matrix[i][cs]);
                
            }
            cs++;
        }
        return ans;
    }
}
