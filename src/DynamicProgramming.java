public class DynamicProgramming {

    static int fibonaci(int n,int[] dp){
       if(n==0||n==1) return n;
       if(dp[n]!=0)
           return dp[n];
       else
       {int n=fibonaci(n-1)+fibonaci(n-2);
          dp[n]=(n);}
       return dp[n];
    }
    static int stairClimb(int n){
        int[]dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(dp[i]==1)
                dp[i]=dp[i-1];
            else if (dp[i]==2)
                dp[i]=dp[i-1]+dp[i-2];
            else
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }

        return dp[n];
    }
    static int stairClimbWithAnyNo.ofJump(int n){
        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=arr[i] && i+j< dp.length;j++)
                dp[i]+=dp[i+j];
        }
        return dp[n];
    }
    static int stairClimbWithMinSteps(int n){
       Integer [] dp=new Integer[n+1];
       dp[n]=0;
       int min=Integer.MAX_VALUE;
       for(int i=n-1;i>=0;i--){
           if(arr[i]>0) {
               for (int j = 1; j <= arr[i] && i+j<dp.length; j++) {
                   {
                       if(dp[i+j]!=null)
                           min = Math.min(min, dp[i + j]);
                   }
               if(min!=Integer.MAX_VALUE)
                   dp[i]=1+min;
               else
                   arr[i]=null;
               }
           }
       }
       return dp[n];
    }
}
