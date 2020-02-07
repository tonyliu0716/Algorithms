package Easy;

/**
 * Created by tonyliu on 2020/2/6.
 */
public class Maximum69Number1323 {

    public int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(num + "");
        int index = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '6') {
                index = i;
                break;
            }
        }
        if(index == sb.length()) {
            return num;
        } else if(index == 0) {
            return Integer.parseInt("9" + sb.substring(1, sb.length()).toString());
        } else {
            return Integer.parseInt(sb.substring(0, index).toString() + "9" + sb.substring(index + 1, sb.length()).toString());
        }
    }

}
