package HackerRank.Easy;

/**
 * Created by tonyliu on 2018/8/13.
 *
 * https://www.hackerrank.com/challenges/richie-rich/problem
 */
public class HighestValuePalindrome {

    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                count++;
                sb.append(Math.max(Integer.parseInt(s.charAt(i) + ""), Integer.parseInt(s.charAt(s.length() - 1 - i) + "")));
            } else {
                sb.append( Integer.parseInt(s.charAt(i) + "") );
            }
            System.out.println("sb: " + sb);
            // 3943
            // 3,
        }
        // 39453
        StringBuilder middle = new StringBuilder();
        if(s.length() % 2 != 0) {
            middle.append(s.charAt(s.length() / 2));
        }
        System.out.println("middle: " + middle);
        StringBuilder end = new StringBuilder();
        end.append(sb);
        end.reverse();
        System.out.println("end: " + end);
        sb.append(middle);
        sb.append(end);
        int length = k - count;
        if(k > count) {

            for(int j = 0; j <= sb.length() / 2; j++) {
                if(sb.charAt(j) != '9') {
                    sb.setCharAt(j, '9');
                    sb.setCharAt(sb.length() - 1 - j, '9');
                    length -= 2;
                }
                if(length <= 0) {
                    break;
                }
            }

            return sb.toString();
        } else if(k == count) {
            return sb.toString();
        } else {
            return "-1";
        }

    }

    public static void main(String[] args) {
        System.out.println( HighestValuePalindrome.highestValuePalindrome("12321", 5, 1) );
    }

}
