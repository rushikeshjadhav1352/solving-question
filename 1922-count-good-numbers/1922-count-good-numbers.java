class Solution {
    public int countGoodNumbers(long n) {
        int mod=1000000007;
        long count=n%2==0?1:5;
        long x=20;;
        for(long i=n/2;i>0;i/=2){
            if(i%2!=0){
                 count=count*x%mod;
            }
            x=x*x%mod;
        }
        //System.out.println(count);
        return (int)count;
    }
}