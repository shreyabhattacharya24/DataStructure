public class NoOfWaysInNMMatrix {
    static int ways(int n, int m){
        if(n==1 || m ==1)
            return 1;
       return ways(n,m-1)+ways(n-1,m);
    }
    static int josephus(int n, int k){
        if(n==1)
            return 0;
        return (josephus(n-1,k)+k)%n;
    }
}
