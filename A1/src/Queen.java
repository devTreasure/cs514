import java.util.ArrayList;

public class Queen extends ChessPiece {

	public Queen(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

			  if(this.getColor().toString().equals("WHITE"))
				  return  " \u2655" ;
			  else
				  return  " \u265B" ;
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}