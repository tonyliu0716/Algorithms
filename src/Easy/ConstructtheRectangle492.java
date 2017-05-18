package Easy;

/**
 * Created by tonyliu on 5/17/17.
 *
 * 1. The area of the rectangular web page you designed must equal to the given target area.

 2. The width W should not be larger than the length L, which means L >= W.

 3. The difference between length L and width W should be as small as possible.
 You need to output the length L and the width W of the web page you designed in sequence.
 Example:
 Input: 4
 Output: [2, 2]
 *
 */


public class ConstructtheRectangle492 {

    public int[] constructRectangle(int area) {
        if(area == 1) {
            return new int[]{1, 1};
        }
        if(area == 2) {
            return new int[]{2, 1};
        }

        int distance = 0;
        int minDistance = 0;
        int[] areas = new int[2];
        for(int i = 1; i <= area/2; i++) {
            if(area % i == 0) {
                int W = i;
                int L = area/i;
                System.out.println("W: " + W + ", L: " + L);
                if(i == 1) {
                    minDistance = distance = Math.abs(L - W);
                    if(W > L) {
                        areas[0] = W;
                        areas[1] = L;
                    } else {
                        areas[0] = L;
                        areas[1] = W;
                    }
                } else {
                    distance = Math.abs(L - W);
                    if (minDistance > distance) {
                        minDistance = distance;
                        if (W > L) {
                            areas[0] = W;
                            areas[1] = L;
                        } else {
                            areas[0] = L;
                            areas[1] = W;
                        }

                    }
                }
            }
        }

        return areas;
    }

    public static void main(String[] args) {
        ConstructtheRectangle492 rec = new ConstructtheRectangle492();
        int[] areas = rec.constructRectangle(6);
        for(int i = 0; i < areas.length; i++) {
            System.out.println(areas[i]);

        }
        //System.out.println(3/2);
    }
}
