package Easy;

/**
 * Created by tao on 6/19/17.
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
 */
public class RansomNote383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int sumNote = 0;
        boolean[] magazineIndex = new boolean[magazine.length()];
        for(int i = 0; i < ransomNote.length(); i++) {
            for(int j = 0; j < magazine.length(); j++) {
                if(ransomNote.charAt(i) == magazine.charAt(j) && magazineIndex[j] == false) {
                    magazineIndex[j] = true;
                    sumNote += 1;
                    break;
                }
            }
        }


        return sumNote == ransomNote.length();
    }

    public static void main(String[] args) {
        RansomNote383 note = new RansomNote383();
        System.out.println(note.canConstruct("aa", "ab"));
    }
}
