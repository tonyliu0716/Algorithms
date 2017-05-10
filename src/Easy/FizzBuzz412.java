package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyliu on 5/8/17.
 *
 * n = 15,

 Return:
 [
 "1",
 "2",
 "Fizz",
 "4",
 "Buzz",
 "Fizz",
 "7",
 "8",
 "Fizz",
 "Buzz",
 "11",
 "Fizz",
 "13",
 "14",
 "FizzBuzz412"
 ]
 *
 */
public class FizzBuzz412 {

    public List<String> fizzBuzz(int n) {

        List<String> lists = new ArrayList<String>();
        if(n == 0) {
            lists.add("0");
        } else {
            for(int i = 1; i <= n; i++) {
                if(i % 3 != 0 && i % 5 != 0) {
                    lists.add(i + "");

                }
                if(i % 3 == 0 && i % 5 != 0) {
                    lists.add("Fizz");

                }
                if(i % 3 != 0 && i % 5 == 0) {
                    lists.add("Buzz");

                }
                if(i % 3 == 0 && i % 5 == 0) {
                    lists.add("FizzBuzz412");
                }
            }
        }


        return lists;
    }

    public static void main(String[] args) {
        FizzBuzz412 buzz = new FizzBuzz412();
        List<String> lists = buzz.fizzBuzz(15);
        for(int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }

}
