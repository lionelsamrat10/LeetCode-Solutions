class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int fibo[]=new int[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<n+1;i++){
            fibo[i]=fibo[i-2]+fibo[i-1];
        }            
        return fibo[n];
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
//Memory Usage: 35.7 MB, less than 64.76% of Java online submissions for Fibonacci Number.
