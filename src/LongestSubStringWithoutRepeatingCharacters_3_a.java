import java.util.HashSet;
import java.util.Set;

/**
 * Created by 桢 on 2017/4/12.
 */
public class LongestSubStringWithoutRepeatingCharacters_3_a {
    public static void main(String[] args ){
        LongestSubStringWithoutRepeatingCharacters_3_a ll=new LongestSubStringWithoutRepeatingCharacters_3_a();
        System.out.println(ll.lengthOfLongestSubstring("abadc"));
    }

    public int lengthOfLongestSubstring(String s) {

        int i=0;
        int j=0;
        int tempMax=0;
        int max=0;
        Set<Character> set=new HashSet<>();
        while(i<s.length() && j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                tempMax++;
            }
            else {
                i++;
                j=i;
                set.clear();
                tempMax=0;
            }
            if(tempMax>max){
                max=tempMax;
            }
        }
        return max;
    }
}
