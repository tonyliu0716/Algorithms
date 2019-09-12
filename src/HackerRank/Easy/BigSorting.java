package HackerRank.Easy;

import java.util.*;

/**
 * Created by tonyliu on 2019/9/11.
 *
 * https://www.hackerrank.com/challenges/big-sorting/problem
 */
public class BigSorting {

    static String[] bigSorting(String[] unsorted) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                // If the length is not the same, we return the difference.
                // A negative # means, x Length is shorter, 0 means the same (this doesn't occur) and a postive # means Y is bigger
                if (x.length() != y.length()) return x.length() - y.length();

                // Now the length is the same.
                // Compare the number from the first digit.
                for (int i = 0; i < x.length(); i++)
                {
                    char left = x.charAt(i);
                    char right = y.charAt(i);
                    if (left != right)
                        return left - right;
                }

                // Default: "0" means both numbers are the same.
                return 0;
            }
        };

        List<String> sortByLength = Arrays.asList(unsorted);
        Collections.sort(sortByLength, comparator);





        return sortByLength.toArray(new String[sortByLength.size()]);
    }

    public static void main(String[] args) {
        String[] abc = new String[]{
                "8",
                "44",
                "82",
                "966",
                "88151",
                "96648",
                "63593696",
                "86212388",
                "91478800",
                "139324591",
                "3300953792",
                "4763506513",
                "24851084103222",
                "84617645710",
                "5039608483812",
                "166782206349090",
                "69689336023779290",
                "72091970412420810",
                "8602096560157018758",
                "4285137293297191396703"

        };



        String[] bca = BigSorting.bigSorting(abc);

        for(String a : bca) {
            System.out.println(a);
        }

    }

}
