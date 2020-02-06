package Easy;

/**
 * Created by tonyliu on 2020/2/5.
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.

 A defanged IP address replaces every period "." with "[.]".



 Example 1:

 Input: address = "1.1.1.1"
 Output: "1[.]1[.]1[.]1"
 Example 2:

 Input: address = "255.100.50.0"
 Output: "255[.]100[.]50[.]0"


 Constraints:

 The given address is a valid IPv4 address.
 */
public class DefangingAnIPAddress1108 {


    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(new DefangingAnIPAddress1108().defangIPaddr(address));
    }
}
