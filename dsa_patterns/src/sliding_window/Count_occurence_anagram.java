package sliding_window;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Count_occurence_anagram {
    public static void main(String[] args) {

    }
    static int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();
        Map<Character, Integer> mp = new HashMap<>();

        // mapping the frequency of pattern
        for (char c : pat.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int count = mp.size();
        int ans = 0;
        int i = 0, j = 0;

        while (j < n) {
            // calculation calculation 
            char charJ = txt.charAt(j);
            if (mp.containsKey(charJ)) {
                mp.put(charJ, mp.get(charJ) - 1);
                if (mp.get(charJ) == 0) count--;
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // answer cheack answer cheack
                if (count == 0) ans++;

                // window sliding window sliding
                char charI = txt.charAt(i);
                if (mp.containsKey(charI)) {
                    mp.put(charI, mp.get(charI) + 1);
                    if (mp.get(charI) == 1) count++;
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}
