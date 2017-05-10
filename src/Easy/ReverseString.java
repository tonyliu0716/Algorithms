package Easy;

/**
 * Created by tonyliu on 5/9/17.
 */
public class ReverseString {

    public String reverseString(String s) {
        StringBuffer str = new StringBuffer("");
        if(s.length() == 0) {
            return str.toString();
        }
        for(int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("hello"));
    }
}
