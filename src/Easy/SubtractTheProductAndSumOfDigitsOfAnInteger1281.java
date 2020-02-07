package Easy;

/**
 * Created by tonyliu on 2020/2/6.
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger1281 {

    public int substractProductAndSUm(int n) {
        int mul = 1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for(int i = 0; i < sb.length(); i++) {
            int num = Integer.parseInt(sb.charAt(i) + "");
            System.out.println("--> " + num);
            mul *= num;
            sum += num;
        }

        return mul - sum;
    }

    public static void main(String[] args) {
        int n = 4421;
        SubtractTheProductAndSumOfDigitsOfAnInteger1281 arr = new SubtractTheProductAndSumOfDigitsOfAnInteger1281();
        System.out.println(arr.substractProductAndSUm(n));
    }

}
