package Easy;

import java.util.HashMap;
import java.util.Map.Entry;


public class CountAndSay38 {

    int temp = 0;
    HashMap<Integer, String> maps = new HashMap<Integer, String>();

    public String countAndSay(int n) {
        
        maps.put(0, "1");
        
        
        while(temp <= n - 1) {
            String str = maps.get(temp);
            StringBuffer sb = new StringBuffer();
            int count = 1;
            for(int i = 0; i < str.length(); i++) {
                if(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    sb.append(count + "" + str.charAt(i));
                    count = 1;
                }
            }
            temp++;
            maps.put(temp, sb.toString());
            
        }

        for(Entry<Integer, String> entry: maps.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return maps.get(n - 1);
    }


    public static void main(String[] args) {
        System.out.println("result: " + new CountAndSay38().countAndSay(6));
    }
}
