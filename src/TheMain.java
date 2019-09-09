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
            Node initial = puzzles[i].getInitNode();
            Node solution = search(initial);
            puzzles[i].solve(doPrint, solution);
        }
    }

    private static Node search(Node initial){
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> searched = new ArrayList<>();

        queue.offer(initial);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            searched.add(current);

            if (current.isGoal()) {
//                System.out.println("Searched size: " + searched.size());
                return current;
            }

            Node[] children = current.expand();
            for (Node child : children) {
                boolean duplicate = false;
                for (Node check : queue) {
                    if (child.equals(check)) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    queue.offer(child);
                }
            }
        }

        return null;
    }
}
