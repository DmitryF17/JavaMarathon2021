package day17;

public class ChessBoard {

    private ChessPiece[][] chessboard;

    public ChessBoard(ChessPiece[][] chessboard) {
        this.chessboard = chessboard;
    }
    public void print() {
        for (int i = 0; i != 8; i++) {
            for (int j = 0; j != 8; j++) {
                System.out.print(chessboard[i][j].getChessPiece());
            }
            System.out.println();
        }
    }
}
