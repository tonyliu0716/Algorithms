package Easy;

import java.util.ArrayList;

/**
 * Created by tao on 5/22/18.
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

 Example 1:

 Input: num1 = "2", num2 = "3"
 Output: "6"
 Example 2:

 Input: num1 = "123", num2 = "456"
 Output: "56088"
 Note:

 The length of both num1 and num2 is < 110.
 Both num1 and num2 contain only digits 0-9.
 Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class MultiplyStrings_43 {

    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if(num1.equals("1")) {
            return num2;
        }
        if(num2.equals("1")) {
            return num1;
        }
        StringBuffer numStrings1 = new StringBuffer(num1);
        StringBuffer numStrings2 = new StringBuffer(num2);

        //   123
        // x 456
        int carry = 0;
        int last = 0;

        ArrayList<StringBuffer> numbers = new ArrayList<>();
        for(int i = numStrings1.length() - 1; i >= 0; i--) { // 123
            StringBuffer sum = new StringBuffer();
            for(int j = numStrings2.length() - 1; j >= 0; j--) { // 456
                carry = Integer.parseInt(numStrings1.charAt(i) + "") * Integer.parseInt(numStrings2.charAt(j) + "");
                if(carry + last >= 10) {
                    sum.insert(0, (carry + last) % 10);
                    //System.out.print("append1 " + (carry + last) % 10);
                    // 进位
                    last = (carry + last) / 10;
                    //System.out.print(", last" + last);
                    //System.out.println();
                } else {
                    if(carry + last >= 10) {
                        sum.insert(0, (carry + last) % 10);
                        //System.out.println("append2 " + (carry + last) % 10);
                        // 进位
                        last = (carry + last) / 10;
                    } else {
                        sum.insert(0, (carry + last));
                        //System.out.println("append3 " + (carry + last));
                        last = 0;

                    }
                }
            }
            if(last != 0) {
                sum.insert(0, last);
            }
            if(i == numStrings1.length() - 1) {
                numbers.add(sum);
            } else {
                for(int k = 0; k < numStrings1.length() - i - 1; k++) {
                    sum.append(0);
                }

                numbers.add(sum);
            }

            carry = 0;
            last = 0;

        }

        String sum = "";
        for(StringBuffer sb : numbers) {
            sum = addStringByIndex(new StringBuffer(sum), sb);
        }

        return sum;
    }

    public String addStringByIndex(StringBuffer num1, StringBuffer num2) {
        int sum = 0;
        int carry = 0;
        StringBuffer number1 = new StringBuffer(num1);
        StringBuffer number2 = new StringBuffer(num2);

        StringBuffer sb = new StringBuffer();

        // "1234" + "0078"
        if(number1.length() < number2.length()) {
            while(number1.length() != number2.length()) {
                number1.insert(0, "0");
            }
        } else {
            while(number1.length() != number2.length()) {
                number2.insert(0, "0");
            }
        }

        for(int i = number2.length() - 1; i >= 0; i--) {
            sum = Integer.parseInt(number2.charAt(i) + "") + Integer.parseInt(number1.charAt(i) + "");
            //System.out.println("sum " + sum);
            if(sum + carry >= 10) {
                sb.insert(0, (sum + carry) % 10);
                carry = (sum + carry) / 10;
            } else {
                sb.insert(0, sum + carry);
                carry = 0;
            }
        }

        if(carry != 0) {
            sb.insert(0, carry);
        }
        // "00123" after integer.parseInt --> 123
        return sb + "";
    }

    public static void main(String[] args) {
        MultiplyStrings_43 strings = new MultiplyStrings_43();
        System.out.println( strings.multiply("123", "456") );

//        StringBuffer sb1 = new StringBuffer("123");
//        StringBuffer sb2 = new StringBuffer("3");
//
//        System.out.println( strings.addStringByIndex(sb1, sb2) );
//        System.out.println(Integer.parseInt("00123"));

    }

}
