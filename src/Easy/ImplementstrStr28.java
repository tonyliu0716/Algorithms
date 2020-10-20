package Easy;

/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:
Input: haystack = "", needle = ""
Output: 0

*/

public class ImplementstrStr28 {
    
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }

        if(haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }

        if(!haystack.contains(needle)) {
            return -1;
        }

        int index = 0;
        for(int i = 0; i < haystack.length(); i++) {
            System.out.println(haystack.substring(i));
            
            if(i + needle.length() <= haystack.length() && haystack.substring(i, i + needle.length()).equals(needle)) {
                index = i;
                break;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new ImplementstrStr28().strStr("hello", "lo"));

        //System.out.println("aa".contains("aa"));
    }

}
