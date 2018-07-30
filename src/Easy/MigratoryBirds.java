package Easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by tonyliu on 2018/7/26.
 */
public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] ar) {
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int bird: ar) {
            if(maps.get(bird) != null) {
                maps.put(bird, maps.get(bird) + 1);
            } else {
                maps.put(bird, 1);
            }
        }

        int max = 0;
        int maxIndex = 0;
        for(int i = 1; i <= 5; i++) {
            if(maps.get(i) != null) {
                if(max < maps.get(i)) {
                    max = maps.get(i);
                    maxIndex = i;
                }
            }
        }
        return maxIndex;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[arCount];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < arCount; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = migratoryBirds(ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();

        char word = 'a';
        System.out.println((int)word);

    }


}
