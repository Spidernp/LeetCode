package leet;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

            public static int lengthOfLongestSubstring(String s) {
                int n = s.length();
                Set<Character> set = new HashSet<>();
                int maxLength = 0, start = 0, end = 0;

                while (end < n) {
                    if (!set.contains(s.charAt(end))) {
                        set.add(s.charAt(end));
                        end++;
                        maxLength = Math.max(maxLength, end - start);
                    } else {
                        set.remove(s.charAt(start));
                        start++;
                    }
                }

                return maxLength;
            }

            public static void main(String[] args) {
                String s = "abcabcbb";
                System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s));
            }

}
