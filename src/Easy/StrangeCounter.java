package Easy;

/**
 * Created by tonyliu on 2018/8/2.
 */
public class StrangeCounter {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
//        int orinigal = 3;
//        int initial = 3;
//        int index = 1;
//        if(index == t) {
//            return 3;
//        }
//        while(index != t) {
//            index++;
//            initial--;
//            if(initial == 1) {
//                orinigal = 2 * orinigal;
//                initial = orinigal + 1;
//            }
//        }
//        return initial + 1;
        long orinigal = 3;
        long length = 3;
        long distance = 1;
        if(distance == t) {
            return 3;
        }
        while(length < t) {
            length += length * 2;
        }

        return length - t + 1;
    }

    public static void main(String[] args) {
        System.out.println( StrangeCounter.strangeCounter(1000) );
    }
}
