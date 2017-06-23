package ClassicAlgorithm;

import java.util.Comparator;

/**
 * Created by tonyliu on 6/22/17.
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 */
public class SelectionSort {

    // 交换位置
    public static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //1. 先找到数组中最小的那个元素；
    //2. 将它和数组中第一个元素交换位置（如果第一个元素是自己，和自己交换）；
    //3. 在剩下的数组中找到最小的元素，将它和第二个元素交换位置，以此类推。

    public static void selectionSort(int[] a) {
        int length = a.length;
        for(int i = 0; i < length; i++) {
            int min = i;
            for(int j = i + 1; j < length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 12, 3, 5, 17, 2, 6, 0};
        SelectionSort.selectionSort(a);
        for(int num : a) {
            System.out.print(num + " ");
        }
    }

}
