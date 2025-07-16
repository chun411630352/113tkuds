import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initBoard();

        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard();

        while (true) {
            int row, col;

            while (true) {
                System.out.print("玩家 " + currentPlayer + " 請輸入位置 (row col)：");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("錯誤：座標超出範圍，請重新輸入。");
                } else if (board[row][col] != '.') {
                    System.out.println("錯誤：該位置已有棋子，請重新輸入。");
                } else {
                    break;
                }
            }

            board[row][col] = currentPlayer;
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");
            printBoard();

            if (checkWin(row, col)) {
                System.out.println("玩家 " + currentPlayer + " 獲勝！");
                break;
            }

            if (isBoardFull()) {
                System.out.println("平手！");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '.';
            }
        }
    }

    static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == '.')
                    return false;
        return true;
    }

    static boolean checkWin(int row, int col) {
        char symbol = board[row][col];
        // 檢查列
        boolean win = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] != symbol) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // 檢查行
        win = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] != symbol) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // 檢查主對角線 (左上到右下)
        if (row == col) {
            win = true;
            for (int i = 0; i < SIZE; i++) {
                if (board[i][i] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // 檢查反對角線 (右上到左下)
        if (row + col == SIZE - 1) {
            win = true;
            for (int i = 0; i < SIZE; i++) {
                if (board[i][SIZE - 1 - i] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;
    }
}
