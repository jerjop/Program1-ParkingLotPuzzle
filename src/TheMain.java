import java.io.*;
import java.text.*;
import java.util.*;

/**
 * The main begins by reading in
 * all of the puzzles described in a file named jams.txt.
 * It then proceeds to run a brute force solution., In each case, it prints out the solution
 * path that was computed.
 */

public class TheMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // read all the puzzles in file.  Only the first few are solvable without additional strategies
        Puzzle[] puzzles = Puzzle.readPuzzlesFromFile("jamsAll.txt");
        //int num_puzzles = puzzles.length;
        int num_puzzles = 1;

        boolean doPrint = true;
        // solve each of the first six puzzles.  The others will likely take too long
        for (int i = 0; i < num_puzzles; i++) {


            System.out.println();

//            Queue<Node> q = new LinkedList<>();
//            Node initial = puzzles[i].getInitNode();
//
//            if (initial.isGoal()) {
//                puzzles[i].solve(doPrint, initial);
//            }
//
//            q.offer(initial);
//            Node[] moves = initial.expand();
//            for (Node move : moves) {
//                boolean matches = false;
//                for (Node check : q) {
//                    if (move.equals(check)) {
//                        matches = true;
//                        break;
//                    }
//                }
//
//                if (matches) {
//                    continue;
//                }
//
//                if (move.isGoal()) {
//                    puzzles[i].solve(doPrint, move);
//                }
//
//                q.offer(move);
//            }
//
//            System.out.println(q);


//            puzzles[i].solve(doPrint);
        }
    }

}
