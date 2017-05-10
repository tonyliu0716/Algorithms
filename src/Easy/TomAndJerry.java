package Easy;

/**
 * Created by tonyliu on 4/27/17.
 */
public class TomAndJerry {

    public static void main(String[] args) {
        int year = 0;
        double tomAnnual = 50000;
        double jerryAnnual = 60000;
        while(tomAnnual < jerryAnnual) {
            year++;
            tomAnnual = tomAnnual * (1 + 0.05);
            jerryAnnual = jerryAnnual * (1 + 0.01);
        }
        System.out.println("After " + year + ", tom's income exceeds the income of Jerry.");
        System.out.println("Tom's income: " + tomAnnual);
        System.out.println("Jerry's income: " + jerryAnnual);
    }

}
