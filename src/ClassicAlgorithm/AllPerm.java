package ClassicAlgorithm;
/*

 输入一串字符，然后对字符进行全排列，如“abc”,全排列结果为："abc","acb","bac","bca","cab","cba".

分析：从字符串中选择一个作为第一个字符，然后对剩下的字符串进行全排列，如此递归下去，直到打印出全部排列。如："abc"：

1、选a作为第一个字符：”abc“，”acb“；

2、选b作为第一个字符：”bac“，”bca“；

3、选c作为第一个字符：”cab“，”cba“；
 

*/
public class AllPerm {
    
    private static void swap(char[] str, int a, int b) {
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

    public static void perm(char[] str, int from, int to) {
        if(from == to) {
            System.out.println(str);
            return;
        }
        for(int j = from; j <= to; j++) {
            swap(str, from, j);
            //System.out.println("第一次交换：" + new String(str) + ", from: " + from + ", j: " + j);
            perm(str, from + 1, to);
            swap(str, from, j);
            //System.out.println("第二次交换：" + new String(str) + ", from: " + from + ", j: " + j);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        perm(s.toCharArray(), 0, s.length() - 1);
    }

}
