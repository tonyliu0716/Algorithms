package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 5/23/18.
 *
 * Write a program to find the n-th ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

 Example:

 Input: n = 10
 Output: 12
 Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 Note:

 1 is typically treated as an ugly number.
 n does not exceed 1690.
 */
public class UglyNumberII_264 {

    //It works, but Time limit exceeded solution
    public int nthUglyNumber(int n) {
        int uglyNumber = 0;
        int num = 1;
        while(uglyNumber != n) {
            if(num == 1) {
                uglyNumber++;
            } else {
                if(findUglyNumber(num)) {
                    uglyNumber++;
                }
            }
            //System.out.println("num is " + num + ", uglyNumber is " + uglyNumber);
            if(uglyNumber != n) {
                num++;
            }

        }
        return num--;
    }

    private boolean findUglyNumber(int n) {
        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
                continue;
            }
            if(n % 3 == 0) {
                n = n / 3;
                continue;
            }
            if(n % 5 == 0) {
                n = n / 5;
                continue;
            }
            if(n != 1) {
                return false;
            }
        }
        return true;
    }

    // Much faster solution
    public int nthUglyNumber2(int n) {
        if(n<=0) return 0;
        int a=0,b=0,c=0;
        List<Integer> table = new ArrayList<Integer>();
        table.add(1);
        while(table.size()<n)
        {
            int next_val = Math.min(table.get(a)*2,Math.min(table.get(b)*3,table.get(c)*5));
            table.add(next_val);
            if(table.get(a)*2==next_val) a++;
            if(table.get(b)*3==next_val) b++;
            if(table.get(c)*5==next_val) c++;
        }
        return table.get(table.size()-1);
    }



    public static void main(String[] args) {
        UglyNumberII_264 ugly = new UglyNumberII_264();
        System.out.println(ugly.nthUglyNumber(109));
    }

}
