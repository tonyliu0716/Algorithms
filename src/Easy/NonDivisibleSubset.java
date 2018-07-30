package Easy;

/**
 * Created by tonyliu on 2018/7/28.
 */
public class NonDivisibleSubset {

    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] S) {
        int maxSub = 0;
        int theMaxOne = 0;
        for(int i = 0; i < S.length; i++) {
            for(int j = 0; j < S.length; j++) {
                if(i == j) {
                    continue;
                }
                if( (S[i] + S[j]) % k != 0 ) {
                    maxSub ++;
                }
            }
            if(theMaxOne < maxSub) {
                theMaxOne = maxSub;
            }
            maxSub = 0;
        }
        return theMaxOne + 1;

    }

    public static void main(String[] args) {
        int[] S = {422346306, 940894801, 696810740, 862741861, 85835055, 313720373};
        System.out.println( NonDivisibleSubset.nonDivisibleSubset(9, S) );

        System.out.println();
        StringBuffer sb = new StringBuffer("10111");
        for(int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
        System.out.println("over");
    }

}
