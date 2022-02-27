public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int min=Integer.MAX_VALUE;

        for(int a=1;a<=amount;a++)
            for(int i=0;i<coins.length;i++)
                if(coins[i]<=a && dp[a-coins[i]]!=Integer.MAX_VALUE)
                    dp[a]=Math.min(dp[a],dp[a-coins[i]]+1);


        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
