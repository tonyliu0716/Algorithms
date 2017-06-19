package Easy;

/**
 * Created by tao on 6/19/17.
 */
public class AddDigits258 {

    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(num);
        int sum = 0;
        while(sb.length() != 1) {

            for(int i = 0; i < sb.length(); i++) {
                sum += Integer.parseInt(sb.charAt(i) + "");
            }
            System.out.println(sum);
            if(sum < 10) {
                break;
            } else {
                sb.setLength(0);
                sb.append(sum);
                sum = 0;
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        AddDigits258 digits = new AddDigits258();
        System.out.println(digits.addDigits(38));
    }
}
