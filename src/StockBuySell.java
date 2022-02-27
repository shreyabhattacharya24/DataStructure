public class StockBuySell {
    static int maxProfit(int[] a){
        int minSoFar=a[0];
        int maxProfit=0;
        int profit;
        for(int i=0;i<a.length;i++){
            if(a[i]<minSoFar)
                minSoFar=a[i];
            profit=a[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    static int maxProfitMultipleArray(int[] a){
        int profit=0;
        for(int i=1;i<a.length;i++)
            if(a[i]>a[i-1])
                profit+=a[i]-a[i-1];
        return profit;
    }


}
