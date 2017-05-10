package Easy;

/**
 * Created by tonyliu on 4/24/17.
 */
public class HammingDistance461 {

    public int hammingDistance(int x, int y) {

        byte[] bytesx = new byte[4];
        byte[] bytesy = new byte[4];

        for(int i = 0; i < 4; i++) {
            bytesx[i] = (byte)(x >>> (i * 8));
            System.out.println(bytesx[i]);
        }



        return 0;
    }

    public static void main(String[] args) {
        HammingDistance461 distance = new HammingDistance461();
        distance.hammingDistance(1, 4);
    }
}
