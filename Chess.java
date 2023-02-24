import java.util.Scanner;

public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;
    // On decrit brievement la logique du jeu
    public void play() {
        while (true) {
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }


    public void play(){

    }
    private void createPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("quel est le nom du player 1 ?");
        Player player1 = scanner.nextLine();
        System.out.println("quel est le nom du player 2 ?");
        Player player2 = scanner.nextLine();
    }
    private void initialiseBoard(){

    }
    private void printBoard(){

    }
    private String askMove(){

    }
    private boolean isCheckMate(){

    }
    private boolean isValidMove (String move){

    }
    private void updateBoard(String move){

    }
    private void switchPlayer(){

    }
}
