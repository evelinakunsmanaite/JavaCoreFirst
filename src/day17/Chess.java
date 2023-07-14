package day17;

import java.util.ArrayList;
import java.util.List;

public class Chess {

    public static void getChessPieceArray() {
        List<ChessPiece> chessPieces = new ArrayList<>(List.of(ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK));
        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece.getDesignation() + " ");
        }
    }
}
