public class KadensAlgo {
    static int maxSubArraySum(int[]arr){
        //handling case when all elements are negative as well
        int currSum=0;
        int maxSum=0;
        boolean allNegativeNum=true;
        int highestNegative=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && allNegativeNum)
                highestNegative=Math.max(highestNegative,nums[i]);
            else{
                allNegativeNum=false;
                currSum+=nums[i];
                maxSum=Math.max(maxSum,currSum);
                if(currSum<0)
                    currSum=0;
            }
        }
        if(allNegativeNum)
            return highestNegative;
        else
            return maxSum;
    }
}
