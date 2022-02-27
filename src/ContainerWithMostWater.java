public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int curr;
        int result=0;
        while(l<r){
            curr=Math.min(height[l],height[r])*(r-l);
            result=Math.max(result,curr);
            if(height[l]<height[r]){
                l++;

            }
            else{
                r--;

            }
        }
        return result;
    }
}
