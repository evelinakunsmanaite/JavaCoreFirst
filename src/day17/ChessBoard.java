package day17;

public class ChessBoard {
    static ChessPiece[][] chessPiece;

    public ChessBoard(ChessPiece[][] chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void print() {
        for (ChessPiece[] chessPieces : chessPiece) {
            for (ChessPiece piece : chessPieces) {
                System.out.print(piece.getDesignation() + " ");
            }
            System.out.println("");
        }
    }
}
