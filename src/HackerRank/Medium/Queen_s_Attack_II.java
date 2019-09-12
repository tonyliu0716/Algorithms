package HackerRank.Medium;

/**
 * Created by tonyliu on 2019/9/11.
 * https://www.hackerrank.com/challenges/queens-attack-2/problem
 *
 * You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares the queen can attack.

 A queen is standing on an  chessboard. The chess board's rows are numbered from  to , going from bottom to top. Its columns are numbered from  to , going from left to right. Each square is referenced by a tuple, , describing the row, , and column, , where the square is located.

 The queen is standing at position . In a single move, she can attack any square in any of the eight directions (left, right, up, down, and the four diagonals). In the diagram below, the green circles denote all the cells the queen can attack from :
 */



public class Queen_s_Attack_II {

    /*
    *  The first line contains two space-separated integers n and k, the length of the board's sides and the number of obstacles.
    *  The next line contains two space-separated integers r_q and c_q, the queen's row and column position.
    *
    *
    * */
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        // how many points should have if no obstacles
        int totalPoints = 0;

        // r_q  col - 1, r_q  col - 2, r_q col - 3 stop r_q  col + 1, r_q  col + 2, r_q  col + 3 -->   9 to 3
        // r_q - 1  col - 1,  r_q - 2, col - 2, stop  r_q + 1  col + 1, r_q + 2  col + 2     --> 7 to 1
        // r_q - 1  col + 1, r_q - 2, col + 2, stop,  r_q + 1  col + 1, r_q + 2  col + 2  --> 11 to 4
        // r_q  col - 1, r_q  col - 2  stop,  r_q  col + 1, r_q  col + 2  --> 12 to 6





        return 0;
    }

    // skip their methods


}
