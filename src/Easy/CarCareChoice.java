package Easy;

import java.util.Scanner;

/**
 * Created by tonyliu on 4/27/17.
 */
// 3.a
public class CarCareChoice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the service string are showing below:");
        System.out.println("oil change, tire rotation, battery check, brake inspection");
        System.out.println("The corresponding price are showing below:");
        System.out.println("$25, $22, $15, $5");
        String message = scan.nextLine();
        System.out.println("*" + message + "*");
        if(!message.equals("oil change") && !message.equals("tire rotation") && !message.equals("battery check")
                && !message.equals("bake inspection")) {
            System.out.println("Error message: please enter the correct services name.");
        } else {
            System.out.println("Got it.");
        }
        scan.close();

    }

}
