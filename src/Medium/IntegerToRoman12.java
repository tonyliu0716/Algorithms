package Medium;


/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. 
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
*/
public class IntegerToRoman12 {

    public String intToRoman(int num) {
        String[] firstLevel = new String[]{"I", "V", "X"};
        String[] secondLevel = new String[]{"X", "L", "C"};
        String[] thirdLevel = new String[]{"C", "D", "M"};
        String numb = String.valueOf(num);
        System.out.println("numb:" + numb + ", length:" + numb.length());
        String roman = "";
        
        if(numb.length() == 4) {
            for(int i = numb.length() - 1; i >= 1; i--) {
                if(i == numb.length() - 1) {
                    roman = IntegerToRoman12.singleIntToRoman(firstLevel, numb.charAt(i) - '0');
                } else if (i == numb.length() - 2) {
                    roman = IntegerToRoman12.singleIntToRoman(secondLevel, numb.charAt(i) - '0') + roman;
                } else {
                    roman = IntegerToRoman12.singleIntToRoman(thirdLevel, numb.charAt(i) - '0') + roman;
                }
            }
            // start dealing with the thousands
            if((numb.charAt(0) - '0') == 1) {
                roman = "M" + roman;
            } else if ((numb.charAt(0) - '0') == 2) {
                roman = "MM" + roman;
            } else {
                roman = "MMM" + roman;
            }
        } else {
            for(int i = numb.length() - 1; i >= 0; i--) {
                System.out.println("To int:" + (numb.charAt(i) - '0'));
                if(i == numb.length() - 1) {
                    roman = IntegerToRoman12.singleIntToRoman(firstLevel, numb.charAt(i) - '0');
                } else if (i == numb.length() - 2) {
                    roman = IntegerToRoman12.singleIntToRoman(secondLevel, numb.charAt(i) - '0') + roman;
                } else {
                    roman = IntegerToRoman12.singleIntToRoman(thirdLevel, numb.charAt(i) - '0') + roman;
                }
            }
        }
        
        return roman;
    }


    public static String singleIntToRoman(String[] romans, int num) {
        String str = "";
        switch(num) {
            case 1:
                str = romans[0];
                break;
            case 2:
                str = romans[0] + romans[0];
                break;
            case 3:
                str = romans[0] + romans[0] + romans[0];
                break;
            case 4:
                str = romans[0] + romans[1];
                break;
            case 5:
                str = romans[1];
                break;
            case 6:
                str = romans[1] + romans[0];
                break;
            case 7:
                str = romans[1] + romans[0] + romans[0];
                break;
            case 8:
                str = romans[1] + romans[0] + romans[0] + romans[0];
                break;
            case 9:
                str = romans[0] + romans[2];
                break;
        }
        System.out.println("Str: " + str);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman12().intToRoman(1994));
    }

}