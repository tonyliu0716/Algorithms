package Easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tonyliu on 6/19/17.
 *
 *
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

 You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

 Example 1:
 Input:
 ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 Output: ["Shogun"]
 Explanation: The only restaurant they both like is "Shogun".
 Example 2:
 Input:
 ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 ["KFC", "Shogun", "Burger King"]
 Output: ["Shogun"]
 Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 *
 */
public class MinimumIndexSumOfTwoLists599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        boolean[] mapIndex = new boolean[list1.length];

        for(int i = 0; i < list1.length; i++) {
            maps.put(list1[i], i);
        }
        int count = 0;
        int value = 0;
        for(int i = 0; i < list2.length; i++) {
            if(maps.get(list2[i]) != null) {
                value = maps.get(list2[i]);
                mapIndex[value] = true;
                count ++;
                maps.put(list2[i], value + i);
            }
        }

        if(count == 1) {
            return new String[]{list1[value]};
        }
        int min = maps.get(list1[value]);
        for(int i = 0; i < mapIndex.length; i++) {
            if(mapIndex[i]) {

                // now the question become: how to find the min number of a array
                int val = maps.get(list1[i]);
                if(val < min) {
                    min = val;
                }
                maps.get(list1[i]);
            }
        }

        for(boolean b : mapIndex) {
            System.out.print(b + " ");
        }

        ArrayList<String> lists = new ArrayList<String>();
        // another for loop to find the correct element
        for(int i = 0; i < maps.size(); i++) {
            if(maps.get(list1[i]) == min && mapIndex[i] == true) {
                lists.add(list1[i]);
            }
        }
        String[] str = new String[lists.size()];
        for(int i = 0; i < lists.size(); i++) {
            str[i] = lists.get(i);
        }

        return str;
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists599 lists = new MinimumIndexSumOfTwoLists599();

        String[] str1 = new String[]{"afeu","atzm","KFC"};
        String[] str2 = new String[]{"atzm","tbt","KFC"};

        String[] strs = lists.findRestaurant(str1, str2);
        for(String str : strs) {
            System.out.println(str);
        }

    }

}
