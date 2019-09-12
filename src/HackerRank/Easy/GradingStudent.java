package HackerRank.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyliu on 2019/9/11.
 */
public class GradingStudent {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> newGrades = new ArrayList<Integer>();
        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) < 38) {
                newGrades.add(grades.get(i));
                continue;
            }
            if(grades.get(i) % 5 == 0) {
                newGrades.add(grades.get(i));
            } else {

                int newGra = grades.get(i);
                for(int j = 1; j < 5; j++) {
                    if( (newGra + j) % 5 == 0 ) {
                        newGra += j;
                        break;
                    }
                }
                if(newGra - grades.get(i) < 3) {
                    newGrades.add(newGra);
                } else {
                    newGrades.add(grades.get(i));
                }
            }

        }

        return newGrades;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);
        List<Integer> newGrades = GradingStudent.gradingStudents(list);
        for(int a : newGrades) {
            System.out.println(a);
        }
    }

}
