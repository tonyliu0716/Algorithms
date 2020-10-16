package Easy;

/**
 * Created by tonyliu on 2017/12/6.
 *
 *
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:

 'A' : Absent.
 'L' : Late.
 'P' : Present.
 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

 You need to return whether the student could be rewarded according to his attendance record.

 Example 1:
 Input: "PPALLP"
 Output: True
 Example 2:
 Input: "PPALLL"
 Output: False
 *
 */
public class StudentAttendanceRecordI551 {

    public static boolean checkRecord(String s) {

        int countA = 0;

        if(s.length() == 1) {
            return true;
        }

        if(s.length() == 2) {
            if(s.charAt(0) == 'A' && s.charAt(0) == s.charAt(1)) {
                return false;
            }
        }

        //Boolean flagL = false;

        for(int i = 0; i < s.length() - 2; i++) {
            if(s.charAt(i) == 'A') {
                countA++;
                if(countA > 1) {
                    return false;
                }
            }

            if(s.charAt(i) == 'L' && s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println( StudentAttendanceRecordI551.checkRecord("LLLL") );
    }

}
