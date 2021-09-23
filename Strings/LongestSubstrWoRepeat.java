import java.util.HashMap;
import java.util.Map;

//Program to find the length of the longest substring without any repeating characters
public class LongestSubstrWoRepeat {
    public static void main(String[] args) {
        String str = "dvdf";
        //longest substring without repeating characters is "abc" with length 3
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0, j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if(map.containsKey(c)) {
                i = Math.max(i, map.get(c));
            }
            map.put(c, j + 1);
            result = Math.max(result, j - i + 1);
        }
        System.out.println("Length of the longest substring without any repeating characters is: " + result);
    }
}