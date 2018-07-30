package Easy;

/**
 * Created by tonyliu on 2018/7/28.
 */
public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        if(s.length() == 0 || t.length() == 0) {
            return "Yes";
        } else if(s.equals(t)) {
            System.out.println("equals");
            return "Yes";
        }
        int shortLength = s.length() > t.length()? t.length() : s.length();
        int index = 0;
        for(int i = 0; i < shortLength; i++) {
            if(s.charAt(i) != t.charAt(i)) {
                index = i - 1;
                break;
            }
        }
        if(index == 0) {
            index = shortLength - 1;
        }
        System.out.println("index: " + index);
        return s.length() - (index + 1) + t.length() - (index + 1) > k ? "No" : "Yes";


    }

    public static void main(String[] args) {

        String s = "qwerasdf";
        String t = "qwerbsdf";
        int k = 6;
       System.out.println(  AppendAndDelete.appendAndDelete(s, t, k) );
    }

}
