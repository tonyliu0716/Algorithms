package Easy;

/**
 * Created by tao on 5/22/18.
 *
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings_415 {

    public String addStrings(String num1, String num2) {
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
            System.out.println("sum " + sum);
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
        AddStrings_415 strings = new AddStrings_415();
        System.out.println(  strings.addStrings("9", "99") );
    }

}
