import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    //abcaabcdba
//1) Brute force where all substrings are found. O(N3)
 //2) Using hashSet where one by one all elements while moving start variable are removed whenever repeated char is found. O(2N).
// 3) Using HasMap where last index of char is recorded to make jump for start variable. O(N)

    public static int findSubstring(String s){
        int max=0;
        int start=0;
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(int end=0;end<s.length();end++){
            if(map.containsKey(s.charAt(end)))
                start=Math.max(start,map.get(s.charAt(end)+1));
            map.put(s.charAt(end),end);
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}
