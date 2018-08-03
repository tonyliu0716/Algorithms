package Easy;

/**
 * Created by tonyliu on 2018/8/3.
 */
public class AbsolutePermutation {

    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
        int[] newOne = new int[n];

        if(k == 0) {
            for(int i = 0; i < n; i++) {
                newOne[i] = i + 1;
            }
            return newOne;
        }
        int count0 = -1;
        StringBuilder banned = new StringBuilder();
        boolean[] indexs = new boolean[n];
        while(count0 != 0) {

            for(int i = 1; i <= n; i++) {
                int choiceOne = k + i;
                int choiceTwo = -1 * k + i;
                System.out.println("One & Two: " + choiceOne + ", " + choiceTwo);
                if( (choiceOne >= 1 && choiceOne <= n) && (choiceTwo < 1 || choiceTwo > n) ) {
                    if(!indexs[i - 1]) {
                        if(banned.indexOf(choiceOne + ",") == -1) {
                            newOne[i - 1] = choiceOne;
                            indexs[i - 1] = true;
                            System.out.println( (i - 1) + " -> " + choiceOne);
                            banned.append(choiceOne + ",");
                        } else {
                            return new int[]{-1};
                        }
                    }
                    System.out.println("Banned: " + banned);
                } else if( (choiceTwo >= 1 && choiceTwo <= n) && (choiceOne < 1 || choiceOne > n) ) {
                    if(!indexs[i - 1]) {
                        if(banned.indexOf(choiceTwo + ",") == -1 ) {
                            banned.append(choiceTwo + ",");
                            System.out.println( (i - 1) + " -> " + choiceTwo);
                            newOne[i - 1] = choiceTwo;
                            indexs[i - 1] = true;
                        } else {
                            return new int[]{-1};
                        }
                    }
                    System.out.println("Banned: " + banned);
                } else if( (choiceOne < 1 || choiceOne > n) && (choiceTwo < 1 || choiceTwo > n) ) {
                    return new int[]{-1};
                } else {
                    // (choiceOne >= 1 && choiceOne <= n) && (choiceTwo >= 1 && choiceTwo <= n)
                    if(!indexs[i - 1]) {
                        if (banned.indexOf(choiceOne + ",") == -1 && banned.indexOf(choiceTwo + ",") == -1) {
                            continue;
                        } else if (banned.indexOf(choiceOne + ",") != -1 && banned.indexOf(choiceTwo + ",") != -1) {
                            return new int[]{-1};
                        } else if ( banned.indexOf(choiceOne + ",") == -1 && banned.indexOf(choiceTwo + ",") != -1) {

                            banned.append(choiceOne + ",");
                            newOne[i - 1] = choiceOne;
                            indexs[i - 1] = true;

                            System.out.println("Banned: " + banned);
                        } else if (banned.indexOf(choiceOne + ",") != -1 && banned.indexOf(choiceTwo + ",") == -1) {

                            banned.append(choiceTwo + ",");
                            newOne[i - 1] = choiceTwo;
                            indexs[i - 1] = true;

                            System.out.println("Banned: " + banned);
                        }
                    }


                }
                count0 = 0;
                // 如果count0 == 0 所有元素都安插进去了
                for(int a : newOne) {
                    if(a == 0) {
                        count0 ++;
                    }
                }
            }
        }

        // newOne 已经全部插入了元素， 需要check是不是所有1~n 的元素都在里面
        boolean[] flags = new boolean[newOne.length];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i + 1 == newOne[j]) {
                    flags[j] = true;
                }
            }
        }
        for(boolean flag: flags) {
            if(!flag) {
                System.out.println(-1);
                break;
            }
        }

        // testing
        for(int a : newOne) {
            System.out.print(a + " ");
        }
        System.out.println();
        return newOne;
    }

    public static void main(String[] args) {
        int[] one = AbsolutePermutation.absolutePermutation(94, 47);
        for(int o : one) {
            System.out.print(o + " ");
        }

    }

}
