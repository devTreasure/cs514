import java.util.Arrays;
import java.util.HashMap;

import javax.xml.stream.events.ProcessingInstruction;

public class ChessBoard  {

  
   //	TODO
  private ChessPiece[][] board;
  
  //a=0
  private HashMap<String, Integer> hashmap = new HashMap<>();
  
  private HashMap<Integer, String> revesreHashmap = new HashMap<>();
  
  public HashMap<String, Integer> getHashmap() {
	return hashmap;
}

public ChessBoard()
  {
	  this.board = new ChessPiece [8][8];
	  
	  hashmap.put("a", 0);
	  hashmap.put("b", 1);
	  hashmap.put("c", 2);
	  hashmap.put("d", 3);
	  hashmap.put("e", 4);
	  hashmap.put("f", 5);
	  hashmap.put("g", 6);
	  hashmap.put("h", 7);
	  
	  
	  
	 
	  
	  revesreHashmap.put(0,"a");
	  revesreHashmap.put(1,"b");
	  revesreHashmap.put(2,"c");
	  revesreHashmap.put(3,"d");
	  revesreHashmap.put(4,"e");
	  revesreHashmap.put(5,"f");
	  revesreHashmap.put(6,"g");
	  revesreHashmap.put(7,"h");
  }
  
  public HashMap<Integer, String> getRevesreHashmap() {
	return revesreHashmap;
}

public void intialize() throws IllegalPositionExcelption {
	  //call contstructor of all pieces
	
	//BLACKs
	
    ChessPiece blackRook = new Rook(this, ChessPiece.Color.BLACK);

	 boolean validPlacementblackRook=  this.placePiece(blackRook, "a8") ;
	 
	 
	 
	ChessPiece blackKnight= new Knight(this, ChessPiece.Color.BLACK);
		 
	boolean validPlacemenblackKnight=  this.placePiece(blackKnight, "b8") ;
	
	
	
	ChessPiece blackbishop =new Bishop(this, ChessPiece.Color.BLACK);
	 
	boolean validblackbishop=  this.placePiece(blackbishop, "c8") ;
	
	
		
	
	ChessPiece blackQueen =new Queen(this, ChessPiece.Color.BLACK);
	 
	boolean validblackQueen=  this.placePiece(blackQueen, "d8") ;
	
	
	
	
	ChessPiece blackKing =new King(this, ChessPiece.Color.BLACK);
	 
	boolean validblackKing=  this.placePiece(blackKing, "e8") ;
	
	
	
	ChessPiece blackbishop2 =new Bishop(this, ChessPiece.Color.BLACK);
	 
	boolean validblackbishop2=  this.placePiece(blackbishop2, "f8") ;
	
	
	ChessPiece blackKnight2= new Knight(this, ChessPiece.Color.BLACK);
	 
	boolean validPlacemenblackKnight2=  this.placePiece(blackKnight2, "g8") ;
	
	
    ChessPiece blackRook2 = new Rook(this, ChessPiece.Color.BLACK);

	 boolean validPlacementblackRook2=  this.placePiece(blackRook, "h8") ;
	 
	 
	 
	 
	 /* Placing set  of 8 BLACK  pawns*/
	 
	 
	  ChessPiece blackPawn1 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn1=  this.placePiece(blackPawn1, "a7") ;
	  
		 
		 
	  ChessPiece blackPawn2 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn2=  this.placePiece(blackPawn2, "b7") ;
	  
	  
		 
		 
	  ChessPiece blackPawn3 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn3=  this.placePiece(blackPawn3, "c7") ;
	  
		 
		 
	  ChessPiece blackPawn4 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn4=  this.placePiece(blackPawn4, "d7") ;
	  
		 
		 
	  ChessPiece blackPawn5 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn5=  this.placePiece(blackPawn5, "e7") ;
		 
		 
	  ChessPiece blackPawn6 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn6=  this.placePiece(blackPawn6, "f7") ;
		 
		 
	  ChessPiece blackPawn7 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn7=  this.placePiece(blackPawn7, "g7") ;
		 
		 
	  ChessPiece blackPawn8 = new Pawn(this, ChessPiece.Color.BLACK);

	  boolean ValidblackPawn8=  this.placePiece(blackPawn8, "h7") ;
	 
	/* Placing set  of 8 BLACK  pawns*/
	  
	  
	  
	 /*---------------------------White *------------------------------------*/
	
	ChessPiece whiteRook = new Rook(this, ChessPiece.Color.WHITE);

	boolean validPlacementwhiteRook=  this.placePiece(whiteRook, "a1") ;
	
	
	ChessPiece WhiteKnight= new Knight(this, ChessPiece.Color.WHITE);
	 
	boolean validPlacementWhiteKnightt=  this.placePiece(WhiteKnight, "b1") ;
	
	
	ChessPiece whitebishop =new Bishop(this, ChessPiece.Color.WHITE);
	 
	boolean validwhitebishop=  this.placePiece(whitebishop, "c1") ;
	
	
	ChessPiece whitekQueen =new Queen(this, ChessPiece.Color.WHITE);
	 
	boolean valiwhitekQueen=  this.placePiece(whitekQueen, "d1") ;
	
		
	
	
	ChessPiece whiteKing =new King(this, ChessPiece.Color.WHITE);
	 
	boolean validblacementwhiteKing=  this.placePiece(whiteKing, "e1") ;
	
	
	
	ChessPiece whitebishop2 =new Bishop(this, ChessPiece.Color.WHITE);
	 
	boolean validblackwhitebishop2=  this.placePiece(whitebishop2, "f1") ;
	
	
	ChessPiece whiteKnight2= new Knight(this, ChessPiece.Color.WHITE);
	 
	boolean validPlacementwhiteKnight2=  this.placePiece(whiteKnight2, "g1") ;
	
	
    ChessPiece WhiteRook2 = new Rook(this, ChessPiece.Color.WHITE);

	 boolean validPlacementWhiteRook2=  this.placePiece(WhiteRook2, "h1") ;
	
	
	
	 /* Placing set  of 8 WHITE  pawns*/
	 
	 
	  ChessPiece whitePawn1 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn1=  this.placePiece(whitePawn1, "a2") ;
	  
		 
		 
	  ChessPiece whitePawn2 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn2=  this.placePiece(whitePawn2, "b2") ;
	  
	  
		 
		 
	  ChessPiece whitePawn3 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn3=  this.placePiece(whitePawn3, "c2") ;
	  
		 
		 
	  ChessPiece whitePawn4 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn4=  this.placePiece(whitePawn4, "d2") ;
	  
		 
		 
	  ChessPiece whitePawn5 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn5=  this.placePiece(whitePawn5, "e2") ;
		 
		 
	  ChessPiece whitePawn6 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn6=  this.placePiece(whitePawn6, "f2") ;
		 
		 
	  ChessPiece whitePawn7 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn7=  this.placePiece(whitePawn7, "g2") ;
		 
		 
	  ChessPiece whitePawn8 = new Pawn(this, ChessPiece.Color.WHITE);

	  boolean ValidwhitePawn8=  this.placePiece(whitePawn8, "h2") ; 

		 

	 //ROOK legal moves
	 
	System.out.println("--Legal moves--");
	for( String s  : whiteRook.legalMoves())
	{
		System.out.println(s);
	}
	System.out.println("--Legal moves--");  
	  
	 //no two same pieces on the SAME spot
	// boolean validPlacement1=  this.placePiece(whiteRook, "d8") ;
	 
  
   

   
}
  
  

  public ChessPiece[][] getBoard() {
	return board;
}

public ChessPiece getPiece(String position) throws IllegalPositionExcelption
  {
      String newpos = position.substring(0,1);
	  
	  int getIndex= this.hashmap.get(newpos);
	  
	  Integer newpos1 = Character.getNumericValue(position.charAt(position.length() - 1));
	  
	  return this.board[getIndex][newpos1];
	  
	  
  }

  
  
  public boolean placePiece(ChessPiece piece,String position) throws IllegalPositionExcelption 
   
  {
	  int columnIndex= -1;	  
	  int rowIndex = -1;
	  boolean validPostion=false;
	  
	  System.out.println(position.length());
	  
	  if(position!=null && position.length()==2  && this.hashmap.containsKey(position.substring(0,1)) )
	  
	  {
	  
	   	  
	  
	  String newpos = position.substring(0,1);

	 // System.out.println(this.hashmap.containsKey(position.substring(0,1)));
	
	  
	  columnIndex= this.hashmap.get(newpos);
	  
		  
	  rowIndex= Character.getNumericValue(position.charAt(position.length() - 1));
	  
	  rowIndex=rowIndex-1;
	  
	  
	  if(this.board[rowIndex][columnIndex] !=null)
	  {
		  throw new IllegalPositionExcelption("spot is alreay occupied");
	  }
	  
	  
	  
	  if(rowIndex>=0 && rowIndex<=8)
	  {
  
		  piece.column= columnIndex ;  //rowIndex;
		  piece.row= rowIndex;        //ColumnIndex;
		  this.board[rowIndex][columnIndex] = piece;
		  validPostion = true;
	  }
	  	  
	  else
	  {
		  validPostion= false;
	  }
	  
  
	}
	  
	return validPostion;
	  
  }

@Override
public String toString() {

	  String chess="";
		try
		{
	
		    String upperLeft = "\u250C";
		    String upperRight = "\u2510";
		    String horizontalLine = "\u2500";
		    String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
		    String verticalLine = "\u2502";
		    String upperT = "\u252C";
		    String bottomLeft = "\u2514";
		    String bottomRight = "\u2518";
		    String bottomT = "\u2534";
		    String plus = "\u253C";
		    String leftT = "\u251C";
		    String rightT = "\u2524";

		    String topLine = upperLeft;
		    
		    for (int i = 0; i<7; i++){
		        topLine += horizontal3 + upperT;
		    }
		    topLine += horizontal3 + upperRight;

		    String bottomLine = bottomLeft;
		    for (int i = 0; i<7; i++){
		        bottomLine += horizontal3 + bottomT;
		    }
		    bottomLine += horizontal3 + bottomRight;
		    chess+=topLine + "\n";

		    for (int row = 7; row >=0; row--){
		        String midLine = "";
		        for (int col = 0; col < 8; col++){
		            if(board[row][col]==null) {
		                midLine += verticalLine + " \u3000 ";
		                
		            } else {
		            	
		            	//System.out.println(board[row][col]);
		            	
		            	midLine += verticalLine + " "+"    "+board[row][col]+" ";
		            	
		            
		            }
		        }
		        midLine += verticalLine;
		        String midLine2 = leftT;
		        for (int i = 0; i<7; i++){
		            midLine2 += horizontal3 + plus;
		        }
		        midLine2 += horizontal3 + rightT;
		        chess+=midLine+ "\n";
		        if(row>=1)
		            chess+=midLine2+ "\n";
	  }
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		    
		    return chess;
	  }
}

  
  /*
  public void move(String fromPosition, String toPosition) throws IllegalMoceException
  {
	  
  }
  */
  
  






