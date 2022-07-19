public class Pawn extends ChessPiece{

    public Pawn(String color){
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

        if (difx > 0) {
            return false;
        }

        boolean result = false;

        if ((line == 1 || line == 6) && (dify > 0) && (dify <= 2)){
            result = true;
        } else if (dify == 1){
            result = true;
        } else {
            result = false;
        }

        // System.out.println("difx = " + difx + ", dify = " + dify);
        // System.out.println(isWhite() ? "W: " : "B: " + "x = " + column + ", y = " + line + ", to x = " + toColumn + ", to y = " + toLine + " => " + result);
        return result;
    }

    public String getSymbol(){
        return "P";
    }
}