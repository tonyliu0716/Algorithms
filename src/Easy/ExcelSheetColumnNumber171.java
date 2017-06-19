package Easy;


/**
 * Created by tao on 6/19/17.
 */
public class ExcelSheetColumnNumber171 {


    // what happen if we got numbers, then how can we get the title?
    // for example, 27 -> "AA"
    public String numberToTitle(int num) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(num <= 26) {
            return str.charAt(num - 1) + "";
        }
        StringBuffer title = new StringBuffer();
        while(num != 0) {
            int remainder = num % 26;
            System.out.println("remainder: " + remainder);
            if(remainder == 0) {
                remainder = 1;
            }
            title.insert(0,  str.charAt(remainder - 1) );
            num = num / 26;
            System.out.println("Now num become: " + num);
        }

        return title.toString();
    }

    // now we get title, then want to convert it into a column number
    public int titleToNumber(String s) {

        int val = 0;
        for (int i = 0; i < s.length(); i++){
            System.out.println(i + " chatAt: " + (int)s.charAt(i));
            System.out.println((int)'A');
            val = val * 26 + 1 + (int) s.charAt(i) - (int) 'A';
        }
        return val;

    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber171 columnNumber171 = new ExcelSheetColumnNumber171();

        // if we got numbers then want to convert it into title
        //String title = columnNumber171.numberToTitle(30*26*29);
        //System.out.println(30*26*29/84);
        //System.out.println(title);

        int num = columnNumber171.titleToNumber("AB");
        System.out.println(num);
    }
}
