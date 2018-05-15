package Easy;

/**
 * Created by tao on 5/15/18.
 *
 *
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target,
 * find the smallest element in the list that is larger than the given target.

 Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.

 Examples:
 Input:
 letters = ["c", "f", "j"]
 target = "a"
 Output: "c"

 Input:
 letters = ["c", "f", "j"]
 target = "c"
 Output: "f"

 Input:
 letters = ["c", "f", "j"]
 target = "d"
 Output: "f"

 Input:
 letters = ["c", "f", "j"]
 target = "g"
 Output: "j"

 Input:
 letters = ["c", "f", "j"]
 target = "j"
 Output: "c"

 Input:
 letters = ["c", "f", "j"]
 target = "k"
 Output: "c"
 Note:
 letters has a length in range [2, 10000].
 letters consists of lowercase letters, and contains at least 2 unique letters.
 target is a lowercase letter.
 */
public class FindSmallestLetterGreaterThanTarget_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++) {
            if((int)letters[i] > (int)target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
//        System.out.println((int)('a'));
//        System.out.println((int)('z'));
        FindSmallestLetterGreaterThanTarget_744 target = new FindSmallestLetterGreaterThanTarget_744();

        char[] letters = {'a', 'f', 'j'};
        System.out.println(target.nextGreatestLetter(letters, 'z'));
    }
}
