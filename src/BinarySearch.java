public class BinarySearch {
    static int binarySearch(int[] arr, int key){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    static void infinteSortedArraySearch(int[] arr),int key{
        int low=0,high=1;
        while(arr[high]<key){
            low=high;
            high=2*high;}
        return binarySearch(arr,key, low,high);

        }

    }
    static int sortedRotatedArray(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[low] < arr[mid]) //left sorted
            {
                if (key >= arr[low] && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else { //right sorted
                if (key >=arr[mid] && key < =arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;

            }
        }
        return -1;
    }

}
