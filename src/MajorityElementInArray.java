public class MajorityElementInArray {
    public static int majorityElement(int[]arr){
        int maj_index=0, count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[maj_index])
                count++;
            else
                count--;
            if(count==0)
                maj_index=i;
        }
        return arr[maj_index];
    }
    //check if arr[maj_index] is really majority element
    static boolean checkMajority(int[] arr, int val){
    int c=0;
    for(int i=0;i<arr.length;i++) {
        if (arr[i] == val)
            c++;
        if (c >= arr.length / 2)
            return true;
    }
    return false;
    }
}
