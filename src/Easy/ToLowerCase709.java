package Easy;

import java.util.HashMap;

/**
 * Created by tonyliu on 2020/2/6.
 */
public class ToLowerCase709 {

    public String toLowerCase(String str) {
        HashMap<String, String> maps = new HashMap<String, String>();
        maps.put("A", "a");
        maps.put("B", "b");
        maps.put("C", "c");
        maps.put("D", "d");
        maps.put("E", "e");
        maps.put("F", "f");
        maps.put("G", "g");
        maps.put("H", "h");
        maps.put("I", "i");
        maps.put("J", "j");
        maps.put("K", "k");
        maps.put("L", "l");
        maps.put("M", "m");
        maps.put("N", "n");
        maps.put("O", "o");
        maps.put("P", "p");
        maps.put("Q", "q");
        maps.put("R", "r");
        maps.put("S", "s");
        maps.put("T", "t");
        maps.put("U", "u");
        maps.put("V", "v");
        maps.put("W", "w");
        maps.put("X", "x");
        maps.put("Y", "y");
        maps.put("Z", "z");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(maps.get(String.valueOf(str.charAt(i))) == null) {
                sb.append(str.charAt(i));
            } else {
                sb.append(String.valueOf(maps.get(String.valueOf(str.charAt(i)))));
            }
        }
        return sb.toString();
    }

}
