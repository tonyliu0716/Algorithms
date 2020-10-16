package HackerRank.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by tonyliu on 2018/8/10.
 *
 * https://www.hackerrank.com/challenges/weighted-uniform-string/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class WeightedUniformStrings {

    // One possible solution but could not pass all the tests
    static String[] weightedUniformStrings(String s, int[] queries) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Integer> weight = new ArrayList<Integer>();
        HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
        int value = 0;
        int time = 1;
        for(int i = 0; i < s.length(); i++) {
            if(maps.get(s.charAt(i)) != null) {
                value = maps.get(s.charAt(i));
                // ddcd
                if(value + 1== i) {
                    time++;
                    maps.put(s.charAt(i), i);
                    weight.add((abc.indexOf(s.charAt(i)) + 1) * time);
                } else {
                    // dcd
                    time = 1;
                    maps.put(s.charAt(i), i);
                    weight.add(abc.indexOf(s.charAt(i)) + 1);
                }
            } else {
                // ab
                time = 1;
                maps.put(s.charAt(i), i);
                weight.add(abc.indexOf(s.charAt(i)) + 1);
            }
        }

        String[] result = new String[queries.length];
        boolean[] flags = new boolean[queries.length];
        for(int q = 0; q < queries.length; q++) {
            for(int i = 0; i < weight.size(); i++) {
                if(!flags[q] && queries[q] == weight.get(i)) {
                    result[q] = "Yes";
                    flags[q] = true;
                    break;
                }
            }
            if(result[q] != "Yes") {
                result[q] = "No";
                flags[q] = true;
            }
        }
        return result;
    }


    // Time out
    static String[] weightedUniformStrings2(String s, int[] queries) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        int time = 0;
        String[] result = new String[queries.length];
        for(int k = 0; k < queries.length; k++) {
            for(int i = 26; i >= 1; i--) {
                if(queries[k] % i == 0) {
                    time = queries[k] / i;
                    for(int j = 0; j < time; j++) {
                        sb.append(abc.charAt(i - 1));
                    }
                    System.out.println("queries[k]: " + queries[k] + ", sb:" + sb.toString() + ". time:" + time);
                    if(s.indexOf(sb.toString()) != -1) {
                        result[k] = "Yes";
                        break;
                    } else {
                        sb.setLength(0);
                        time = 0;
                    }

                }
            }
            if(result[k] == null) {
                result[k] = "No";
            }
            time = 0;
            sb.setLength(0);
        }
        return result;
    }

    // runtime error???
    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings3(String s, int[] queries) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        //ArrayList<Integer> weight = new ArrayList<Integer>();
        HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
        int showTimes = 1;
        int value = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            // dddddd
            if(s.charAt(i) == s.charAt(i + 1)) {
                showTimes++;
            } else {
                // adadddc
                if(maps.get(s.charAt(i)) != null) {
                    value = maps.get(s.charAt(i));
                    if(showTimes > value) {
                        maps.put(s.charAt(i), showTimes);
                    }
                } else {
                    maps.put(s.charAt(i), showTimes);
                }
                showTimes = 1;
            }
        }
        // adding the last element of String s
        if(s.length() != 1 && s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
            maps.put(s.charAt(s.length() - 1), maps.get(s.charAt(s.length() - 1)) + 1);
        } else {
            maps.put(s.charAt(s.length() - 1), 1);
        }
        Set<Character> keys =  maps.keySet();
        for(Character i : keys) {
            System.out.println(i + " " + maps.get(i));
        }
        String[] result = new String[queries.length];
        for(int i = 0; i < queries.length; i++) {
            for(int j = 1; j <= 26; j++ ) {
                if(queries[i] % j == 0) {
                    if(maps.get(abc.charAt(j - 1)) != null) {
                        if(queries[i] <= j * maps.get(abc.charAt(j - 1))) {
                            result[i] = "Yes";
                        }
                    }
                }
            }
            if(result[i] != "Yes") {
                result[i] = "No";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] q = new int[]{2, 1, 12};
        String[] result = WeightedUniformStrings.weightedUniformStrings3("l", q);
        for(String r : result) {
            System.out.print(r + " ");
        }
    }

}
