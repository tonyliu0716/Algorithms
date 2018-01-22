package Easy;

/**
 * Created by tonyliu on 2018/1/21.
 *
 *
 * Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.

 (Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)

 Example 1:

 Input: L = 6, R = 10
 Output: 4
 Explanation:
 6 -> 110 (2 set bits, 2 is prime)
 7 -> 111 (3 set bits, 3 is prime)
 9 -> 1001 (2 set bits , 2 is prime)
 10->1010 (2 set bits , 2 is prime)
 Example 2:

 Input: L = 10, R = 15
 Output: 5
 Explanation:
 10 -> 1010 (2 set bits, 2 is prime)
 11 -> 1011 (3 set bits, 3 is prime)
 12 -> 1100 (2 set bits, 2 is prime)
 13 -> 1101 (3 set bits, 3 is prime)
 14 -> 1110 (3 set bits, 3 is prime)
 15 -> 1111 (4 set bits, 4 is not prime)
 Note:

 L, R will be integers L <= R in the range [1, 10^6].
 R - L will be at most 10000.
 */
public class Prime_Number_of_Set_Bits_in_Binary_Representation762 {

    public int countPrimeSetBits(int L, int R) {
        int primeNumber = 0;
        for(int i = L; i <= R; i++) {
            primeNumber += (isPrime(getBinaray(i)) == true) ? 1 : 0;
        }

        return primeNumber;
    }

    public static int getBinaray(int num) {
        int oneNumber = 0;

        while(true) {
            if(num == 0) {
                break;
            }
            if(num % 2 == 1) {
                oneNumber += 1;
                num = num / 2;
            } else {
                num = num / 2;
            }

        }

        return oneNumber;
    }

    public static boolean isPrime(int a) {

        boolean flag = true;

        if (a < 2) {// 素数不小于2
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {// 若能被整除，则说明不是素数，返回false
                    flag = false;
                    break;// 跳出循环
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Prime_Number_of_Set_Bits_in_Binary_Representation762 rep = new Prime_Number_of_Set_Bits_in_Binary_Representation762();
        System.out.println( rep.countPrimeSetBits(10, 15) );

    }
}
