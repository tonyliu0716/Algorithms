package Easy;

/**
 * Created by tonyliu on 2018/7/31.
 */
public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int games = 0;
        while(s > 0) {
            System.out.println(s);
            s = s - p;
            if(s < 0) {
                break;
            }
            p = p - d >= m ? p - d : m;
            games++;
        }

        return games;

    }

    public static void main(String[] args) {
       //System.out.println("Return : " + HalloweenSale.howManyGames(16, 2, 1, 9981) );
        System.out.println((int)'a' + ", " + (int)'z');
    }

}
