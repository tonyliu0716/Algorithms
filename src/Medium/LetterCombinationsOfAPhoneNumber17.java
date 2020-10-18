package Medium;

import java.util.ArrayList;
import java.util.List;

/*
 Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]

*/
public class LetterCombinationsOfAPhoneNumber17 {

    public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<String>();
        // represent 2 - 9 digits
        String[] keys = new String[]{"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
        if(digits.length() == 0) {
            return letters;
        } else if (digits.length() == 1 && String.valueOf(digits.charAt(0)).equals("1")) {
            return letters;
        } else if(digits.length() == 1 && !String.valueOf(digits.charAt(0)).equals("1")){
            String d = keys[Integer.parseInt(digits) - 1];
            String[] drr = d.split("");
            for(String dEle: drr) {
                letters.add(dEle);
            }
        } else { // digits.length --> 2, 3, 4
            String[] digitsElm = digits.split(""); // --> 2, 8, 7
            String[] lettersElm = new String[digitsElm.length]; // --> "abc", "tuv", "pqrs"
            for(int i = 0; i < digitsElm.length; i++) {
                lettersElm[i] = keys[Integer.parseInt(digitsElm[i]) - 1];
            }
            
            for(int i = 0; i < lettersElm.length; i++) {
                for(int j = i + 1; j < lettersElm.length; j++) {
                    String[] first = lettersElm[i].split("");
                    String[] second = lettersElm[j].split("");
                    String[] third;
                    String[] fourth;
                    if(digits.length() == 2) {
                        for(int k = 0; k < first.length; k++) {
                            for(int q = 0; q < second.length; q++) {
                                letters.add(first[k] + second[q]); // --> 2 digits
                            }
                        }
                    }
                    
                    if(digits.length() == 3) { // --> 3 digits
                        for(int t = j + 1; t < lettersElm.length; t++) {
                            third = lettersElm[t].split("");
                            for(int k = 0; k < first.length; k++) {
                                for(int q = 0; q < second.length; q++) {
                                    for(int g = 0; g < third.length; g++) {
                                        letters.add(first[k] + second[q] + third[g]);
                                    }
                                }
                            }
                            
                        }
                    }

                    if(digits.length() == 4) { // --> 4 digits
                        for(int t = j + 1; t < lettersElm.length; t++) {
                            third = lettersElm[t].split("");
                            for(int f = t + 1; f < lettersElm.length; f++) {
                                fourth = lettersElm[f].split("");
                                for(int k = 0; k < first.length; k++) {
                                    for(int q = 0; q < second.length; q++) {
                                        for(int g = 0; g < third.length; g++) {
                                            for(int fl = 0; fl < fourth.length; fl++) {
                                                letters.add(first[k] + second[q] + third[g] + fourth[fl]);
                                            }
                                        }
                                    }
                                }
                            }
                            
                        }
                    }
                }
            }
            

        }
        
        return letters;
    }

    public static void main(String[] args) {
        List<String> strs = new LetterCombinationsOfAPhoneNumber17().letterCombinations("2322");
        System.out.println("length: " + strs.size());
        for(String s: strs) {
            System.out.print(s + " ");
        }
    }
    
}
