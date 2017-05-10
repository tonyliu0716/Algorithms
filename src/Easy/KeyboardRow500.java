package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tonyliu on 4/27/17.
 *
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 *
 */
public class KeyboardRow500 {

    public String[] findWords(String[] words) {
        HashMap<Character, Integer> firstRow = new HashMap<Character, Integer>();
        firstRow.put('q', 1);
        firstRow.put('w', 2);
        firstRow.put('e', 3);
        firstRow.put('r', 4);
        firstRow.put('t', 5);
        firstRow.put('y', 6);
        firstRow.put('u', 7);
        firstRow.put('i', 8);
        firstRow.put('o', 9);
        firstRow.put('p', 10);

        HashMap<Character, Integer> secondRow = new HashMap<Character, Integer>();
        secondRow.put('a', 1);
        secondRow.put('s', 2);
        secondRow.put('d', 3);
        secondRow.put('f', 4);
        secondRow.put('g', 5);
        secondRow.put('h', 6);
        secondRow.put('j', 7);
        secondRow.put('k', 8);
        secondRow.put('l', 9);

        HashMap<Character, Integer> thirdRow = new HashMap<Character, Integer>();
        thirdRow.put('z', 1);
        thirdRow.put('x', 2);
        thirdRow.put('c', 3);
        thirdRow.put('v', 4);
        thirdRow.put('b', 5);
        thirdRow.put('n', 6);
        thirdRow.put('m', 7);

        boolean first = true;
        boolean second = true;
        boolean third = true;

        List<String> list = new ArrayList<String>();

        for(int i = 0; i < words.length; i++) {
            String word =words[i].toLowerCase();
            for(int j = 0; j < word.length(); j++) {
                if(firstRow.get(word.charAt(j)) == null) {
                    first = false;
                    break;
                }
            }
            System.out.println(word);
            if(first == false) {
                for(int j = 0; j < word.length(); j++) {
                    if(secondRow.get(word.charAt(j)) == null) {
                        second = false;
                        break;
                    }
                }
            }

            if(second == false) {
                for(int j = 0; j < word.length(); j++) {
                    if(thirdRow.get(word.charAt(j)) == null) {
                        third = false;
                        break;
                    }
                }
            }

            if(first == true || second == true || third == true) {
                list.add(words[i]);
            }
            // reset the flags:
            first = true;
            second = true;
            third = true;

        }
        String[] strings = new String[list.size()];

        for(int i = 0; i < strings.length; i++) {
            strings[i] = list.get(i);
        }
        System.out.println(strings.length);
        return strings;
    }

    public static void main(String[] args) {
        KeyboardRow500 row = new KeyboardRow500();
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(row.findWords(strings));
    }

}
