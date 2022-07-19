public class Queen extends ChessPiece{

    public Queen(String color){
        super(color);
    }

    public String getColor(){
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (toColumn > 7 || toColumn < 0 || toLine > 7 || toLine < 0){
            return false;
        }
        if (toColumn == column && toLine == line){
            return false;
        }
        if (hasOwnChessPiece(chessBoard, toLine, toColumn)) { return false; }

        int difx = Math.abs(toColumn - column);
        int dify = Math.abs(toLine - line);

        if (difx == 0 || dify == 0 || difx == dify) {
            return true;
        }

        return false;
    }

    public String getSymbol(){
        return "Q";
    }
}// write your code here