package Easy;

/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Follow up: Could you solve it without converting the integer to a string?

 

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false

*/

public class PalindromeNumber {
    
    public boolean isPalindromeNumber(int x) {
        
        if(x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }else if(x % 10 == 0) {
            return false;
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append(String.valueOf(x));
            boolean flag = true;
            for(int i = 0; i < sb.length()/2; i++)  {
                if(Integer.parseInt(String.valueOf(sb.charAt(i))) != Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 1 - i)))) {
                    flag = false;
                    break;
                }
            }
            return flag;
        } 
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindromeNumber(1234567899));
    }
}
