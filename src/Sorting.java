public class Sorting {
    static void BubbleSort(int[] arr)//ON2
    {
        int n=arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    swapped=true;
                    swap(arr[j], arr[j + 1]);
                }
            }
            if(!swapped)
                return;

        }
    }
    static void InsertionSort(int[] arr)//ON2
    {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            for(int j=i-1;j>0;j--){
                if(arr[j]>temp)
                    arr[j+1]=arr[j];
                else
                    break;
            arr[j+1]=temp;
            }
        }
    }
    static void SelectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min)
                    min=j;
            }
            if(min!=i)
                swap(arr[i],arr[min]);
        }
    }
    static int partition(int[] arr, int l, int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i<j)
                swap(a[i],a[j]);
        }
        swap(a[j],pivot);
        return j;
    }
    static void quickSort(int l, int h){  // ON2
        if(l<h){
            int pivot=partition(arr,l,h);
            quickSort(l,pivot-1);
            quickSort(pivot+1,h);

        }
    }
    static void mergeSort(int l,int h){ //O(NLogN)
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(l,mid);
            mergeSort(mid+1,h);
            merge(arr,l,mid,r);
        }
    }
    static void merge(int[] arr, int l, int mid, int r){
        int i=l;
        int j=r;
        int k=l;
        int[] b=new int[];
        while(i<=mid &&j<=r){
            if(arr[i]<arr[j]) {
                b[k] = arr[i];
                i++;
            }
            else{
                b[k]=arr[j];
            j++;
            }
            k++;
        }
        if(i<mid){
            while(j<=r) {
                b[k] = arr[j];
                k++;
                j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=arr[i];
                k++;
                i++;
            }
        }
        for(int i=l;i<=r;i++){
            arr[k]=b[k];
        }
    }
}
