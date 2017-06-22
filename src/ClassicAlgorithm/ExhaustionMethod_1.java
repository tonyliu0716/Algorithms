package ClassicAlgorithm;

/**
 * Created by tonyliu on 6/21/17.
 * 穷举法，找出所有可能的组合
 * For example, giving a string "abcdd", find out all the possible patterns
 * Like: a, b, c, d, d, ab, ac, ad, ad, bc...
 */
public class ExhaustionMethod_1 {

    public static void exhaustion(String a) {
        StringBuffer sb = new StringBuffer();
        int length = a.length();

        for(int i = 0; i < length; i++) {
            sb.delete(0, sb.length());

            for(int j = length-i-1; j>-1; j--){
                char chh=a.charAt(j);
                sb.append(chh);
                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcdd";
        exhaustion(str);
    }

}
