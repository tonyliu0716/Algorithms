package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 5/26/18.
 *
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

 Please note that the string does not contain any non-printable characters.

 Example:

 Input: "Hello, my name is John"
 Output: 5
 */
public class NumberofSegmentsinaString_434 {

    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.length() == 0) return 0;
        String[] splittedString = trimmed.split("\\s+");
        List<String> list = new ArrayList<>();
        for ( int i = 0; i <splittedString.length; i++){
            list.add(splittedString[i]);
        }

        return list.size();
    }

}
