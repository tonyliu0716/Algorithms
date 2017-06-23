package ClassicAlgorithm;

/**
 * Created by tonyliu on 6/22/17.
 *
 * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 */
public class InsertionSort {

    public static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void insertionSort(int[] a) {
        int length = a.length;
        for(int i = 1; i < length; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j] < a[j - 1]) {
                    exchange(a, j, j - 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {12, 2, 1, 5, 8, 0};
        InsertionSort.insertionSort(a);
        for(int num : a) {
            System.out.print(num + " ");
        }
    }

}
