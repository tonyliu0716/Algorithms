package Easy;

import java.util.ArrayList;

/**
 * Created by tonyliu on 2018/1/18.
 *
 * Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order
 * of the elements in A.

 We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.

 These lists A and B may contain duplicates. If there are multiple answers, output any of them.

 For example, given

 A = [12, 28, 46, 32, 50]
 B = [50, 12, 32, 46, 28]
 We should return
 [1, 4, 3, 2, 0]
 as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4],
 and so on.

 Note:

 A, B have equal lengths in range [1, 100].
 A[i], B[i] are integers in range [0, 10^5].
 */
public class FindAnagramMappings760 {

    public int[] anagramMappings(int[] A, int[] B) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] booleans = new boolean[A.length];
        // for(boolean b : booleans) {
        //     b = false;
        // }

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < B.length; j++) {
                if(A[i] == B[j] && !booleans[j]) {
                    list.add(j);
                    booleans[j] = true;
                    break;
                }
            }
        }

        int[] integers = new int[list.size()];
        for(int i = 0; i < integers.length; i++) {
            integers[i] = list.get(i);
        }

        return integers;
    }

    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        FindAnagramMappings760 mappings = new FindAnagramMappings760();
        int[] C = mappings.anagramMappings(A, B);
        for(int i : C) {
            System.out.print(i + ", ");
        }
    }

}
