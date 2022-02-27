public class RotateArray {
    void leftRotate(int arr[], int d, int n) {

        d = d % n;
        int start = d;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[start];
            start = (start + 1) % n;
        }
    }
    //another way to split array in 2 parts and reverse them
//    Reverse A to get ArB, where Ar is reverse of A.
//    Reverse B to get ArBr, where Br is reverse of B.
//    Reverse all to get (ArBr) r = BA.
    static void leftRotate(int arr[], int d)
    {

        if (d == 0)
            return;

        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
