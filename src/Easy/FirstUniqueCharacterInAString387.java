package Easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by tao on 6/20/17.
 *
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 *
 */
public class FirstUniqueCharacterInAString387 {

    public int firstUniqChar(String s) {
        if(s.length() == 1) {
            return 0;
        }

        int count = 0;
        boolean[] booleans = new boolean[s.length()];

        for(int i = 0; i < s.length() - 1; i++) {
            if(!booleans[i]) {
                for(int j = i + 1; j < s.length(); j++) {
                    if(s.charAt(i) == s.charAt(j)) {
                        count++;
                        booleans[j] = true;
                    }
                }
                if(count == 0) {
                    return i;
                } else if (count > 0) {
                    booleans[i] = true;
                    count = 0;
                }
            }

        }

        for(boolean b : booleans) {
            System.out.println(b);
        }

        for(int i = 0; i < booleans.length; i++) {
            if(!booleans[i]) {
                return i;
            }
        }



        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aadadaad";

        FirstUniqueCharacterInAString387 string387 = new FirstUniqueCharacterInAString387();
        int value = string387.firstUniqChar(s3);
        System.out.println(value);
    }

}
