package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []
*/

class ThreeSum15 {

    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        ArrayList<Integer> inner = new ArrayList<Integer>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        if(nums.length == 3) {
            if(nums[0] + nums[1] + nums[2] == 0) {
                inner = new ArrayList<Integer>();
                inner.add(nums[0]);
                inner.add(nums[1]);
                inner.add(nums[2]);
                output.add(inner);
            }
        } else if (nums.length > 3) {
            for(int i = 0; i < nums.length; i++) {
                for(int j = i + 1; j < nums.length; j++) {
                    for(int k = j + 1; k < nums.length; k++) {
                        if(nums[i] + nums[j] + nums[k] == 0) {
                            inner = new ArrayList<Integer>();
                            inner.add(nums[i]);
                            inner.add(nums[j]);
                            inner.add(nums[k]);
                            Collections.sort(inner);
                            set.add(inner);
                        }
                    }
                }
            }
            // remove duplicate
            
            
            // convert set back to list
            Iterator<List<Integer>> value = set.iterator();
            while(value.hasNext()) {
                output.add(value.next());
            }

        }

        return output;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
    //List to store the final solution.
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    //Set to avoid storing duplicate triplets.
    HashSet<List<Integer>> set=new HashSet<List<Integer>>();
    
    //Corner cases(If no.of elements in the array is less than three,then return empty array.)
    if(nums.length < 3 ) {
        return res; 
    }
     
    //First of all sorting the array.
    Arrays.sort(nums);
        
    //Using the concept of three pointers(Two pointer concept+one array traversing pointer).
    int ptr1 = 0,ptr2 = 0;
    for(int i = 0;i < nums.length - 2; i++) {
      
      //Initialising both values.
      ptr1=i+1;
      ptr2=nums.length-1;
      while(ptr1<ptr2)
      {
          if(nums[i]+nums[ptr1]+nums[ptr2]<0)
              ptr1++;//As array is sorted,so moving towards left is increasing order.
          else if(nums[i]+nums[ptr1]+nums[ptr2]>0)
              ptr2--;//As array is sorted,so moving towards right is decreasing order.
          else
          {
             //If solution is found,then add it to set(for uniqueness).
             set.add(Arrays.asList(nums[i],nums[ptr1],nums[ptr2]));
             ptr1++;//or ptr2--;
          }
      }
    }
     
    //Retreiving distinct values from set to result list.
    for(List<Integer> list:set)
    res.add(list);
    
    return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> output = new ThreeSum15().threeSum(new int[]{-1,0,1,2,-1,-4});

        for(int i = 0; i < output.size(); i++) {
            for(int j = 0; j < output.get(i).size(); j++) {
                System.out.print(output.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
