package Easy;

import java.util.Scanner;

/**
 * Created by tonyliu on 4/27/17.
 */
// 3.b
public class CarCareChoice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the service string are showing below:");
        System.out.println("oil change, tire rotation, battery check, brake inspection");
        System.out.println("The corresponding price are showing below:");
        System.out.println("$25, $22, $15, $5");
        String message = scan.nextLine();
        String subMessage = message.substring(0, 3);

        System.out.println("*" + subMessage + "*");
        if(!subMessage.equals("oil") && !subMessage.equals("tir") && !subMessage.equals("bat") && !subMessage.equals("bak")) {
            System.out.println("Error message: please enter the correct services name.");
        } else {
            System.out.println("Got it.");
        }
        scan.close();
    }

}
