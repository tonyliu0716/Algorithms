package Easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by tonyliu on 4/27/17.
 * 'a' -> 'd'
 * 'A' -> 'D'
 */
public class AToD {

    public static String doChange(String message, int amount) {
        String str = "";
        int begin = 'A';
        int end = 'Z';
        int lowerBegin = 'a';
        int lowerEnd = 'z';
        for(int i = 0; i < message.length(); i++) {

            char c = message.charAt(i);

            if(c == ' ') {
                str += " ";
                continue;
            }

            if((int)c >= begin && (int)c <= end) {
                // upper case:
                int current = (int)c + amount;
                if(current <= end) {
                    str += (char) current;
                } else {
                    str += (char)(current - end - 1 + begin);
                }

            } else {
                // lower case:
                int current = (int)c + amount;
                if(current <= lowerEnd) {
                    str += (char)current;
                } else {
                    str += (char)(current - lowerEnd + 1 + lowerBegin);
                }
            }
        }
        return str;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the message: ");
        String message = scan.nextLine();
        System.out.println(doChange(message, 2));
    }



}
