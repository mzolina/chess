public abstract class ChessPiece{
    protected String color;
    public boolean check = true;


    public ChessPiece(String color){
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();

    public boolean hasOwnChessPiece(ChessBoard chessBoard, int line, int column) {
        ChessPiece p = chessBoard.board[line][column];
        return p.getColor() == color;
    }
}