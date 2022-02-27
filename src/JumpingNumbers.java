import java.lang.Math;
public class JumpingNumbers { //or stepping numbers
    static long jumpingNums(long X) {
        // code here
        if(X<=10)
            return X;
        long num=0;
        for(num=X;num>0;num--){
            long temp=num;
            long prevDigit=-1;
            boolean flag=true;
            while(temp>0 && flag==true){
                flag=true;
                long currentDigit=temp%10;


                if(prevDigit!=-1){
                    if(Math.abs(currentDigit-prevDigit)!=1)
                        flag=false;
                }
                prevDigit=currentDigit;
                temp/=10;
            }


            if (flag==true)
                return num;
        }
        return -1;
    }
}
