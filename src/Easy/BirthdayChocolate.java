package Easy;

/**
 * Created by tonyliu on 2018/7/19.
 *
 *https://www.hackerrank.com/challenges/the-birthday-bar/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 *
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.

 Consider the chocolate bar as an array of squares, . She wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria: .

 Input Format

 The first line contains an integer , the number of squares in the chocolate bar.
 The second line contains  space-separated integers , the numbers on the chocolate squares where .
 The third line contains two space-separated integers,  and , Ron's birth day and his birth month.

 Constraints

 , where ()
 Output Format

 Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

 Sample Input 0

 5
 1 2 1 3 2
 3 2
 Sample Output 0

 2
 *
 */
public class BirthdayChocolate {


    // Complete the solve function below.
    static int solve(int[] s, int d, int m) {
        int count = 0;
        if(m == 1) {
            for(int i = 0; i < s.length; i++) {
                count++;
                if(s[i] == d) {
                    return 1;
                }
            }
            if(count == s.length) {
                return 0;
            }
        }

        //连续的蛋糕数
        int numbersOfWay = 0;
        int cakeCount = 0;

        for(int i = 0; i < s.length; i++) {
            cakeCount = s[i];

            for(int j = i + 1; j < i + m && j < s.length; j++) {
                if(cakeCount + s[j] < d) {
                    cakeCount += s[j];
                    System.out.print(cakeCount + " ");
                    continue;
                }
                if(cakeCount + s[j] == d) {
                    if(j - i + 1 == m) {
                        numbersOfWay ++;
                    }

                    System.out.println("break =: " + (cakeCount + s[j]));
                    System.out.println("j: " + j + ", i: " + i + ", m =" + m);
                    break;
                }
                if(cakeCount + s[j] > d) {
                    System.out.println("break >: " + (cakeCount + s[j]));
                    break;
                }
                System.out.println();
            }

        }

        return numbersOfWay;
    }

    public static void main(String[] args) {
        int[] s =  {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
        int d = 18;
        int m = 7;
        System.out.println("numbers of way: " + BirthdayChocolate.solve(s, d, m) );

    }


}
