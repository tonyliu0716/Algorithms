package Easy;

/**
 * Created by tao on 5/23/18.
 *
 * Given two binary strings, return their sum (also a binary string).

 The input strings are both non-empty and contains only characters 1 or 0.

 Example 1:

 Input: a = "11", b = "1"
 Output: "100"
 Example 2:

 Input: a = "1010", b = "1011"
 Output: "10101"
 */
// information: 1 + 0 = 1, 0 + 0 = 1, 1 + 1 = 10, 1 + 1 + 1 = 11
    //     1010
    //    +1011
    //    10101
public class AddBinary_67 {

    public String addBinary(String a, String b) {
        StringBuffer number1 = new StringBuffer(a);
        StringBuffer number2 = new StringBuffer(b);
        if(number1.length() < number2.length()) {
            // add 0 until they have the same length
            while(number1.length() != number2.length()) {
                number1.insert(0, '0');
            }
        } else {
            while(number1.length() > number2.length()) {
                while(number1.length() != number2.length()) {
                    number2.insert(0, '0');
                }
            }
        }

        StringBuffer result = new StringBuffer();
        int carry = 0;
        for(int i = number1.length() - 1; i >= 0; i--) {
            char c1 = number1.charAt(i);
            char c2 = number2.charAt(i);
            if(carry == 0) {
                if(c1 == '0' && c2 == '1') {
                    result.insert(0, '1');
                }
                if(c1 =='1' && c2 == '0') {
                    result.insert(0, '1');
                }
                if(c1 == '0' && c2 == '0') {
                    result.insert(0, '0');
                }
                if(c1 == '1' && c2 == '1') {
                    result.insert(0, '0');
                    carry = 1;
                }
            } else if (carry == 1) {
                if(c1 == '0' && c2 == '1') {
                    result.insert(0, '0');
                    carry = 1;
                }
                if(c1 =='1' && c2 == '0') {
                    result.insert(0, '0');
                    carry = 1;
                }
                if(c1 == '0' && c2 == '0') {
                    result.insert(0, '1');
                    carry = 0;
                }
                if(c1 == '1' && c2 == '1') {
                    result.insert(0, '1');
                    carry = 1;
                }
            }
        }
        if(carry != 0) {
            result.insert(0, '1');
        }

        return result.toString();
    }




    public static void main(String[] args) {
        AddBinary_67 binary = new AddBinary_67();
        System.out.println( binary.addBinary("11", "1") );
    }

}
