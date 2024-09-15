package Codewars;

public class GoStoneScroing {

	public static void main(String[] args) {
        char[][] board = {
            {'W', 'W', 'W', 'B', 'B', 'B'},
            {'W', 'W', 'W', 'W', 'B', 'B'},
            {'W', 'W', 'W', 'B', 'B', 'B'},
            {'W', 'X', 'W', 'B', 'B', 'B'},
            {'X', 'W', 'B', 'B', 'B', 'B'},
            {'W', 'W', 'B', 'X', 'B', 'X'}
        };

        System.out.println(determineWinner(board));
    }

    public static Tuple<String, Integer> determineWinner(char[][] board) {
        int blackCount = 0;
        int whiteCount = 0;

        for (char[] row : board) {
            for (char cell : row) {
                if (cell == 'B') {
                    blackCount++;
                } else if (cell == 'W') {
                    whiteCount++;
                }
            }
        }

        if (blackCount > whiteCount) {
            return new Tuple<>("B", blackCount);
        } else if (whiteCount > blackCount) {
            return new Tuple<>("W", whiteCount);
        } else {
            return new Tuple<>("T", blackCount); // Since blackCount and whiteCount are the same, either can be used.
        }
    }
}

// Helper class to return a tuple
class Tuple<T1, T2> {
    public final T1 first;
    public final T2 second;

    public Tuple(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
