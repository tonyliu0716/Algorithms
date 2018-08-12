package Easy;

/**
 * Created by tonyliu on 2018/8/10.
 */
public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(letters.indexOf(s.charAt(i) + "") == -1 && Letters.indexOf(s.charAt(i) + "") == -1) {
                sb.append(s.charAt(i) + "");
                continue;
            } else {
                if(letters.indexOf(s.charAt(i) + "") != -1) {
                    index = letters.indexOf(s.charAt(i) + "") + k;
                    sb.append(letters.charAt(index));
                } else if (Letters.indexOf(s.charAt(i) + "") != -1){
                    index = Letters.indexOf(s.charAt(i)) + k;
                    sb.append(Letters.charAt(index));
                }
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        //System.out.println(CaesarCipher.caesarCipher("www.abc.xy", 87));

        String[] arr = new String[2];
        System.out.println("arr:" + arr[0]);
    }


}
