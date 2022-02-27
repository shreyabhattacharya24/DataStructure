import java.util.Arrays;
public class SieveofEratoSthenes {
    public static void main(String[] args){
        SieveofEratoSthenes s=new SieveofEratoSthenes();
        for(int i=0;i<=20;i++)
            System.out.println(i+" "+ s.sieveOfEratoSthenes(20));
    }
    static int gcd(int a,int b){
        return a%b==0?b:gcd(b,a%b);
    }
    public boolean[] sieveOfEratoSthenes(int n){
       boolean[] arr=new boolean[n+1];

       Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i)
                arr[j]=false;
        }
        return arr;
    }
}
