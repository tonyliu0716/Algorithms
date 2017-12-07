package Easy;

/**
 * Created by tonyliu on 2017/12/6.
 *
 * Given an integer, return its base 7 string representation.

 Example 1:
 Input: 100
 Output: "202"
 Example 2:
 Input: -7
 Output: "-10"
 Note: The input will be in range of [-1e7, 1e7].
 */
public class Base7_504 {

    public static String convertToBase7(int num) {

        StringBuffer sb = new StringBuffer();
        int reminder = 0;

        String first = num < 0 ? "-" : "";
        num = num < 0 ? 0 - num : num;

        while(true) {

            if(num < 7 ) {
                reminder = num % 7;
                sb.append(reminder);
                break;
            } else {
                reminder = num % 7;
                num = num / 7;
                sb.append(reminder);
            }

        }

        StringBuffer sb1 = new StringBuffer();
        for(int i = sb.length() - 1; i >= 0; i--) {
            sb1.append(sb.charAt(i));
        }

        System.out.println(first + sb1);
        return first + sb1.toString();
    }

    public static void main(String[] args) {
        Base7_504.convertToBase7(-7);

    }

}
