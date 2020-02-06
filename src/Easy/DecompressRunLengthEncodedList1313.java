package Easy;

import java.util.ArrayList;

/**
 * Created by tonyliu on 2020/2/5.
 */
public class DecompressRunLengthEncodedList1313 {


    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i += 2) {
            int num0 = nums[i];
            int num1 = nums[i + 1];
            //int count = 0;
//            for(int k = 0; k < list.size(); k++) {
//                if(list.get(k) == num1) {
//                    count++;
//                }
//            }
            //if(num0 > count) {
                for(int j = 0; j < num0; j++) {
                    list.add(num1);
                }
            //}

        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        DecompressRunLengthEncodedList1313 dep = new DecompressRunLengthEncodedList1313();
        int[] arr = new int[]{1,2,3,4};
        int[] drr = dep.decompressRLElist(arr);
        for(int a : drr) {
            System.out.print(a + " ");
        }
    }

}
