package Easy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by tonyliu on 2018/8/3.
 */
public class EmaSupercomputer {

    // Complete the twoPluses function below.
    static int twoPluses(String[] grid) {

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, StringBuilder> maps = new HashMap<>();
        ArrayList<Integer> notCross = new ArrayList<>();
        int max = 0;
        int cell = 1;
        boolean changed = false;
        // boolean cross = false;
        // int locationOfMax = 0;
        // int start = 0;
        // int end = 0;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length(); j++) {
                if ((i == 0 || i == grid.length - 1) && grid[i].charAt(j) == 'G') {

                    sb.append("|" + i + "," + j);
                    maps.put(1, sb);
                    sb.setLength(0);
                    continue;
                }

                if ((j == 0 || j == grid[i].length() - 1) && grid[i].charAt(j) == 'G') {

                    sb.append("|" + i + "," + j);
                    maps.put(1, sb);
                    sb.setLength(0);
                    continue;
                }
                // good or bad cell?
                if (grid[i].charAt(j) == 'G') {
                    while (true) {

                        if (i - cell >= 0 && i + cell < grid.length && j - cell >= 0 && j + cell < grid[i].length()) {
                            if (grid[i - cell].charAt(j) == 'G' && grid[i + cell].charAt(j) == 'G' && grid[i].charAt(j - cell) == 'G' && grid[i].charAt(j + cell) == 'G') {
                                sb.append("|" + (i - cell) + "," + j + "|" + (i + cell) + "," + j + "|" + i + "," + (j - cell) + "|" + i + "," + (j + cell) + "|" + i + "," + j);
                                System.out.println("sb: " + sb + "  *** max is " + max);
                                cell++;
                                changed = true;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }

                    }

                    // after the while loop we get the good cells number
                    System.out.println("Location: i -> " + i + ", j -> " + j + ", add -> " + ((cell - 1) * 4 + 1));
                    //int sum = (cell - 1) * 4 + 1;
                    if (changed) {

                        //sb.append("|max" + ((cell - 1) * 4 + 1) + "|");
                        cell = 1;
                        changed = false;
                        max = 0;
                        sb.setLength(0);
                    }
                }
            }
        }

        // Hashmap 中存的是所有cross里面最大的
        // 如果有非cross的，存在ArrayList里面
        for(int key: maps.keySet()) {
            notCross.add(key);
        }
        Collections.sort(notCross);

        return notCross.get(notCross.size() - 1) * notCross.get(notCross.size() - 2);
    }

    public static void main(String[] args) {

        System.out.println(EmaSupercomputer.twoPluses(new String[]{"GGGGGGG", "BGBBBBG", "BGBBBBG", "GGGGGGG", "GGGGGGG", "BGBBBBG"}) );

    }

}
