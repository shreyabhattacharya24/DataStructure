public class ThreeSumWithNoDuplicates{
    // [-1,0,1,2,-1,-4]
    public List < List < Integer >> threeSum(int[] nums) {
        // Sort the given array to get all duplicates together and shift all negative to left and positive to right side of array.
        Arrays.sort(nums);
//We will have 3 varaibles. num1Idx will  run in outer loop.
// num2Idx,num3Idx will run in inner loop from start and end sides.

        List < List < Integer >> result = new ArrayList < > ();
        for (int num1Idx = 0; num1Idx + 2 < nums.length; num1Idx++) {
            // Skip all duplicates from left
            // num1Idx>0 ensures this check is made only from 2nd element onwards
            if (num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]) {
                continue;
            }

            int num2Idx = num1Idx + 1;
            int num3Idx = nums.length - 1;
            while (num2Idx < num3Idx) {
                int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
                if (sum == 0) {
                    // Add triplet to result
                    result.add(Arrays.asList(nums[num1Idx], nums[num2Idx], nums[num3Idx]));

                    num3Idx--;

                    // Skip all duplicates from right
                    while (num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1])
                        num3Idx--;
                }
                else if (sum > 0) {
                    // Decrement num3Idx to reduce sum value
                    num3Idx--;
                } else {
                    // Increment num2Idx to increase sum value
                    num2Idx++;
                }
            }
        }
        return result;
    }
}
