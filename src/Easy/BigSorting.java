package Easy;



/**
 * Created by tonyliu on 2018/8/6.
 */
public class BigSorting {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {

        // sort Strings
        int len = unsorted.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (!lessThan(unsorted[j], unsorted[j + 1]) ) {
                    sb.append(unsorted[j]);
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = sb.toString();
                    sb.setLength(0);
                }
            }
        }

        return unsorted;

    }

    static boolean lessThan(String a, String b) {
        if(a.length() < b.length()) {
            return true;
        } else if(a.length() == b.length()) {
            for(int i = 0; i < a.length(); i++) {
                if(Integer.parseInt(a.charAt(i) + "") > Integer.parseInt(b.charAt(i) + "")) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //HashSet<Character> set = new HashSet<>();

        String a = "0,2,4,9,11,15,18,19";
        String[] arr = a.split(",");
        String b = "1,3,7,10,12,14,";
        String[] brr = b.split(",");
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(index = 0; index < arr.length; index++) {
            sb.append(arr[index] + ",");
            for(int j = index; index < brr.length;) {
                sb.append(brr[index] + ",");
                break;
            }
        }
        // how to add the rest of the elements
        if(index < brr.length) {
            for(int i = index; i < brr.length; i++) {
                sb.append(brr[i] + ",");
            }
        }
        System.out.println(sb);
    }

}
