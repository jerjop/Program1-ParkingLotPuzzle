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
        int num_puzzles = 6;

        boolean doPrint = true;
        // solve each of the first six puzzles.  The others will likely take too long
        for (int i = 0; i < num_puzzles; i++) {
            puzzles[i].solve(doPrint);
        }
}

}
