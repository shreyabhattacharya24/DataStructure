public class PalindromString {
    static boolean palindrom(String s, int left, int right){
        if(left>=right)
            return true;
        if(s.charAt[left]!=s.charAt[right])
            return false;
        return palindrom(s,left+1,right-1);
    }
    static void powerset(String s,int i,String cur){


        if(i==s.length())
            return;
        powerset(s,i+1,cur+s.charAt(i));
        powerset(s,i+1,cur);
    }
    static void permutationsOfString(String s, int l, int r){
        if(l==r)
            return;
        for(int i=l;i<r;i++){
            swap(s,l,i);
            permutationsOfString(s, l+1,r);
            swap(s,l,i);

        }
    }
}
