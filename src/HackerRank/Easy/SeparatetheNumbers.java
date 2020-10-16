package HackerRank.Easy;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Created by tonyliu on 2018/8/11.
 *
 * https://www.hackerrank.com/challenges/separate-the-numbers/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class SeparatetheNumbers {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        // 1234 -> 1, 2, 3, 4 -> 12, 34

        boolean flag = false;
        int length = 0;
        BigInteger one = new BigInteger("1");
        //int first = 0;
        //ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<String, Integer> maps = new HashMap<>();
        for(int i = 1; i <= s.length() / 2; i++) {
            length = s.substring(0, i).length();
            BigInteger num = new BigInteger(s.substring(0, i));
            maps.put(num.toString(), s.indexOf(String.valueOf(num)));
            while(length < s.length()) {
                num = num.add(one);
                if(s.contains(String.valueOf(num)) ) {
                    length+= String.valueOf(num).length();
                    maps.put(String.valueOf(num), s.indexOf(String.valueOf(num)));
                } else {
                    break;
                }

            }
            //System.out.println("valid length: " + length);
            if(length == s.length()) {
                System.out.println("YES " + s.substring(0, i));
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("NO");
        }

        for(String key: maps.keySet()) {
            System.out.println(key + " -> " + maps.get(key));
        }

    }

    public static void main(String[] args) {
        SeparatetheNumbers.separateNumbers("858687888990919293949596979898");
    }

}
