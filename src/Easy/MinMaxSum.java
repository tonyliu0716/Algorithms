package Easy;


import java.util.*;

/**
 * Created by tonyliu on 2018/7/14.
 */
public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        System.out.println("...we are here...");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        Long min = Long.parseLong(Long.parseLong(arr[0] + "") + Long.parseLong(arr[1] + "") + Long.parseLong(arr[2] + "") + Long.parseLong(arr[3] + "")  + "");
        Long max = Long.parseLong(Long.parseLong(arr[arr.length - 1] + "") + Long.parseLong(arr[arr.length - 2] + "") + Long.parseLong(arr[arr.length - 3] + "")
                + Long.parseLong(arr[arr.length - 4] + "") + "");
        System.out.println(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
