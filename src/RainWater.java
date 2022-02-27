public class RainWater {
    //Through ArrayPreprocessing where we traverse array 2 times to get
    // max height till now on left and max height till now at right side of a block
    //and then 3rd loop to get min of them
    //O(3n)
    static int rainWater(int[]arr){
        int ans=0;
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
            left[i]=Math.max(arr[i],left[i-1]);
        right[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--)
            right[j]=Math.max(arr[j],right[j+1]);
        for(int k=0;k<n;k++)
            ans+=Math.min(left[k],right[k])-arr[k];
        return ans;
    }
    //Instead we can use 2 pointers and do this in one loop
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int leftMax=height[l],rightMax=height[r];
        int result=0;
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                result+=leftMax-height[l];
            }
            else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                result+=rightMax-height[r];
            }
        }
        return result;
    }
}
