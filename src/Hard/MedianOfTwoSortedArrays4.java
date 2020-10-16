package Hard;

import java.util.Arrays;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
*/

class MedianOfTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newNums = new int[nums1.length + nums2.length];
        int index = 0;
        int[] lessNum = nums1.length >= nums2.length ? nums2 : nums1;
        int[] moreNum = nums1.length < nums2.length ? nums2 : nums1;
        
        if(lessNum.length != 0) {
            for(int i = 0; i < lessNum.length; i++) {
                newNums[i] = lessNum[i];
                index = i;
            }
            for(int i = 0; i < moreNum.length; i++) {
                newNums[index + 1] = moreNum[i];
                index += 1;
            }
        } else {
            for(int i = 0; i < moreNum.length; i++) {
                newNums[index] = moreNum[i];
                index += 1;
            }
        }
        
        Arrays.sort(newNums);
        // for(int j = 0; j < newNums.length; j++) {
        //     System.out.print(newNums[j] + " ");
        // }
        System.out.println();
        if(newNums.length == 1) {
            return Double.valueOf(newNums[0]);
        }
        if(newNums.length % 2 != 0) { // 7
            return Double.valueOf(newNums[newNums.length / 2]);
        } else { // 6
           // System.out.println(newNums[newNums.length / 2 - 1] + " " + newNums[newNums.length / 2]);
            return (Double.valueOf(newNums[newNums.length / 2 - 1]) + 
                Double.valueOf(newNums[newNums.length / 2])) / 2.00000;
        }
        
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2, 3};

        System.out.println(new MedianOfTwoSortedArrays4().findMedianSortedArrays(nums1, nums2));
    }
}