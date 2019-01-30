import java.util.ArrayList;

public class Knight  extends ChessPiece{

	public Knight(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		   System.out.println("#########################");
			  if(this.getColor().toString().equals("WHITE"))
				  return "\u2658" ;
			  else
				  return   "\u265E" ;
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
