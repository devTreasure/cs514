import java.util.ArrayList;

public class Rook   extends  ChessPiece{
	
	

	public Rook(ChessBoard board, Color color) {
		super(board, color);

		this.board = board;
	
			// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	  if(this.getColor().toString().equals("WHITE"))
		  return  " \u2656"; // white rook
	  else
		return  "  \u265C" ;//  black rook  
		
	}
	
	
	

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		ArrayList<String> moves = new ArrayList<String>();
		
		 System.out.println("---Intial ROOK POS---");
		 System.out.println("Columns: "+ this.column);
		 System.out.println("row: "+ this.row);
		 
		 ChessPiece[][] boardcopy = null;
		 boardcopy = this.board.getBoard();
		 
		 
		 //verticle moves
		 for (int row=this.row ; row >=0;row=row-1 )
		 {
			 
		//	System.out.println(boardcopy[row][this.column] );
			//if no piece the narray has null value for that spot so we can move the ROOK
			//Want to check the color  for taking down the opponent 
			
			if (boardcopy[row][this.column] == null  )
			{
				
				//remove hard coding -d
				moves.add(this.board.getRevesreHashmap().get(this.column)  + String.valueOf(row+1) );
			}
		 }
		 
		 //horizontal moves
		 
	    int i=this.row;
		 
		for( String s : this.board.getHashmap().keySet())
		{
			
		// remove the one entry BY CHECKING COLUMN VALUE where it currently stands
			
		if(	this.column != this.board.getHashmap().get(s))
			
			moves.add(s+ String.valueOf(i+1));
		}
		 
		
		 System.out.println("--Intial ROOK POS--");
		 
		
		
		return moves;
	}

/*
	@Override
	public String toString() {
		return "Rook [board=" + board + ", row=" + row + "\u2656"+ ", column=" + column + ", color=" + color + "]";
	}


*/
	
	


}
