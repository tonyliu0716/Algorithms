package ClassicAlgorithm;

/**
 * Created by tonyliu on 2018/1/21.
 */
public class IsPrime {

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
        IsPrime number = new IsPrime();
        System.out.println( number.isPrime(147) );

    }
}
