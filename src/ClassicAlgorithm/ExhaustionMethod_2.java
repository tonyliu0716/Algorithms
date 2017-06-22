package ClassicAlgorithm;

/**
 * Created by tonyliu on 6/21/17.
 *
 * 案例：鸡兔同笼问题

 在一个笼子里关着若干只鸡和若干兔子。一共有35个头，和94只脚。问在一个笼子里鸡和兔子各有多少个。
 *
 */
public class ExhaustionMethod_2 {

    public static void exhaustion(int head, int foot) {
        int chicken, rabbit;
        for(chicken = 0; chicken <= head; chicken++) {
            rabbit = head - chicken;
            if(chicken * 2 + rabbit * 4 == foot) {
                System.out.println("Chicken: " + chicken + ", rabbit: " + rabbit);
            }
        }
    }

    public static void main(String[] args) {
        ExhaustionMethod_2 ex = new ExhaustionMethod_2();
        ex.exhaustion(35, 94);
    }

}
