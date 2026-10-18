
public class GameOfLife {

    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int liveNeighbors = 0;

                // Check all 8 neighboring cells
                for (int r = Math.max(0, i - 1);
                     r <= Math.min(m - 1, i + 1); r++) {

                    for (int c = Math.max(0, j - 1);
                         c <= Math.min(n - 1, j + 1); c++) {

                        if (r == i && c == j) {
                            continue;
                        }

                        // Original state: 1 or 2 means alive
                        if (board[r][c] == 1 || board[r][c] == 2) {
                            liveNeighbors++;
                        }
                    }
                }

                // Rule 1 & 3: Live cell dies
                if (board[i][j] == 1 &&
                    (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 2;
                }

                // Rule 4: Dead cell becomes alive
                else if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 3;
                }
            }
        }

        // Convert temporary states into final states
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                } else if (board[i][j] == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        gameOfLife(board);

        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

