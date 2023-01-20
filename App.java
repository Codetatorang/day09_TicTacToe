package sg.edu.nus.iss;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] tttBoard = new String[9];

        //player x and o
        String player1 = "X";
        String player2 = "O";

        //fill up the board
        for(int i=0;i<9;i++){
            tttBoard[i] = String.valueOf(i+1);
        }

        TicTacToe ttt = new TicTacToe();
        //print out the board
        ttt.printBoard(tttBoard);
    }
}
