package day17;

public enum ChessPiece {
    KING_WHITE(10, "Король (белый)"),
    KING_BLACK(10, "Король (чёрный)"),
    QUEEN_WHITE(9, "Ферзь (белый)"),
    QUEEN_BLACK(9, "Ферзь (чёрный)"),
    ROOK_WHITE(5, "Ладья (белая)"),
    ROOK_BLACK(5, "Ладья (чёрный)"),
    BISHOP_WHITE(3.5, "Слон (белый)"),
    BISHOP_BLACK(3.5, "Слон (чёрный)"),
    KNIGHT_WHITE(3, "Конь (белый)"),
    KNIGHT_BLACK(3, "Конь (чёрный)"),
    PAWN_WHITE(1, "Пешка (белая)"),
    PAWN_BLACK(1, "Пешка (чёрный)"),
    EMPTY(-1, "_");

    private double value;
    private String designation;

    ChessPiece(double value, String designation) {
        this.value = value;
        this.designation = designation;
    }

    public double getValue() {
        return value;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "ChessPiece: " +
                "value = " + value +
                ", designation = " + designation + "\n";
    }
}
