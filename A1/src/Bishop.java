import java.util.ArrayList;

public class Bishop  extends  ChessPiece{

	public Bishop(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		  if(this.getColor().toString().equals("WHITE"))
			  return  " \u2657"; // white rook
		
		  else
			return   " \u265D" ;//  black rook  
			
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
