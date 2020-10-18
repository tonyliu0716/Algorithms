package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target?
 Find all unique quadruplets in the array which gives the sum of target.

Notice that the solution set must not contain duplicate quadruplets.

 
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [], target = 0
Output: []
 
*/
public class FourSum18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        ArrayList<Integer> subArr;
        if(nums.length < 4) {
            return list;
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    for(int q = k + 1; q < nums.length; q++) {
                        if(nums[i] + nums[j] + nums[k] + nums[q] == target) {
                            subArr = new ArrayList<Integer>();
                            subArr.add(nums[i]);
                            subArr.add(nums[j]);
                            subArr.add(nums[k]);
                            subArr.add(nums[q]);
                            Collections.sort(subArr);
                            set.add(subArr);
                        }
                    }
                }
            }
        }
        Iterator<List<Integer>> it = set.iterator();
        while(it.hasNext()) {
            list.add(it.next());
        }
        
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new FourSum18().fourSum(new int[]{2,-1,-1,1,1,2,2}, 0);
      
        for(List<Integer> l : list) {
            for(int i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
