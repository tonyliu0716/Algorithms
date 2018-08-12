package HackerRank.Easy;

/**
 * Created by tonyliu on 2018/8/12.
 *
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt( i + 1)) {
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        System.out.println( AlternatingCharacters.alternatingCharacters("AAABBB") );

    }

}
