package teamlewischess;

/**
 * @see Piece
 */
public class Queen extends Piece {
    static public boolean isValidMove(int[][] fPieceTypeLocationsOnBoard, Team fTeam)
    {
//        System.out.println("Queen withinRange of PieceMobility: " + 
//                 Queen.withinRangeOfPieceMobility(fPieceTypeLocationsOnBoard));
//         System.out.println("noPieceBlocksPathToSquare: " + 
//                 Queen.noPieceBlocksPathToSquare(fPieceTypeLocationsOnBoard));
//         System.out.println("moveDoesNotPlaceKingInCheck:  " + 
//                 Queen.moveDoesNotPlaceKingInCheck(fPieceTypeLocationsOnBoard));
         
        if(Queen.withinRangeOfPieceMobility(fPieceTypeLocationsOnBoard)){
            if(Queen.noPieceBlocksPathToSquare(fPieceTypeLocationsOnBoard)){
                if(Queen.moveDoesNotPlaceKingInCheck(fPieceTypeLocationsOnBoard)){ 
                    return true;
                }
            }
        }
        return false;
    }
    
    static private boolean withinRangeOfPieceMobility(int[][] fPieceTypeLocationsOnBoard)
    {
        int rowTargeted = Board.getRowFromLocation(Game.getTargetedSquare());
        int columnTargeted = Board.getColumnFromLocation(Game.getTargetedSquare());
        
        int rowClicked = Board.getRowFromLocation(TeamLewisChessController.getSquareClicked());
        int columnClicked = Board.getColumnFromLocation(TeamLewisChessController.getSquareClicked());
        
        // rook's cross
        if(rowTargeted == rowClicked)
            return true;
        else if(columnTargeted == columnClicked)
            return true;
   
        // bishop's diagonal
        int[] bishopRowMove = new int[4];
        int[] bishopColumnMove = new int[4];

        bishopRowMove[0] = 1  ; bishopColumnMove[0] = -1;
        bishopRowMove[1] = 1  ; bishopColumnMove[1] = 1;
        bishopRowMove[2] = -1 ; bishopColumnMove[2] = -1;
        bishopRowMove[3] = -1 ; bishopColumnMove[3] = 1;

        int nextRow = 0;
        int nextColumn = 0;

        for (int i = 0; i < 4; i++){
            nextRow = rowTargeted + bishopRowMove[i];
            nextColumn = columnTargeted + bishopColumnMove[i];

            while (nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7) {
                if (nextRow == rowClicked && nextColumn == columnClicked)
                     return true; // withinRangeofPieceMobility
                else {
                    nextRow += bishopRowMove[i];
                    nextColumn += bishopColumnMove[i];
                }
            }
        }
        
        return false;
    }
    
    static private boolean noPieceBlocksPathToSquare(int[][] fPieceTypeLocationsOnBoard)
    {
        int rowTargeted = Board.getRowFromLocation(Game.getTargetedSquare());
        int columnTargeted = Board.getColumnFromLocation(Game.getTargetedSquare());
        
        int rowClicked = Board.getRowFromLocation(TeamLewisChessController.getSquareClicked());
        int columnClicked = Board.getColumnFromLocation(TeamLewisChessController.getSquareClicked());

        if(Game.getCurrentTeamsTurn() == 0 && fPieceTypeLocationsOnBoard[rowClicked][columnClicked] >= 1
        && fPieceTypeLocationsOnBoard[rowClicked][columnClicked] <= 6) {
            return false;
        } else if(Game.getCurrentTeamsTurn() == 1 && fPieceTypeLocationsOnBoard[rowClicked][columnClicked] >= 7
        && fPieceTypeLocationsOnBoard[rowClicked][columnClicked] <= 12) {
            return false;
        }
        
        int nextRow;
        int nextColumn;
        int previousRow;
        int previousColumn;
        
        if (rowTargeted == rowClicked || columnTargeted == columnClicked) {
            
            int[] rookRowMove = new int[4];
            int[] rookColumnMove = new int[4];

            rookRowMove[0] = 1  ; rookColumnMove[0] = 0;
            rookRowMove[1] = -1 ; rookColumnMove[1] = 0;
            rookRowMove[2] = 0  ; rookColumnMove[2] = -1;
            rookRowMove[3] = 0  ; rookColumnMove[3] = 1;

            for (int i = 0; i < 4; i++) {

                nextRow = rowTargeted + rookRowMove[i];
                nextColumn = columnTargeted + rookColumnMove[i];

                while (nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7) {
                    if (nextRow == rowClicked && nextColumn == columnClicked) {

                        previousRow = nextRow - rookRowMove[i];
                        previousColumn = nextColumn - rookColumnMove[i];

                        while (previousRow != rowTargeted || previousColumn != columnTargeted) {

                            if (fPieceTypeLocationsOnBoard[previousRow][previousColumn] != 0)
                                return false; // noPieceBlocksPathToSquare
                            else {
                                previousRow -= rookRowMove[i];
                                previousColumn -= rookColumnMove[i];
                            }
                        }
                        return true; // noPieceBlocksPathToSquare
                    }
                    else{
                        nextRow += rookRowMove[i];
                        nextColumn += rookColumnMove[i];
                    }
                }
            }
        } else {
            // bishop pattern
            int[] bishopRowMove = new int[4];
            int[] bishopColumnMove = new int[4];

            bishopRowMove[0] = 1  ; bishopColumnMove[0] = -1;
            bishopRowMove[1] = 1  ; bishopColumnMove[1] = 1;
            bishopRowMove[2] = -1 ; bishopColumnMove[2] = -1;
            bishopRowMove[3] = -1 ; bishopColumnMove[3] = 1;

            for (int i = 0; i < 4; i++){
                nextRow = rowTargeted + bishopRowMove[i];
                nextColumn = columnTargeted + bishopColumnMove[i];

                while(nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                    if(nextRow == rowClicked && nextColumn == columnClicked){

                        previousRow = nextRow - bishopRowMove[i];
                        previousColumn = nextColumn - bishopColumnMove[i];

                        while(previousRow != rowTargeted && previousColumn != columnTargeted){

                            if(fPieceTypeLocationsOnBoard[previousRow][previousColumn] != 0)
                                return false; // noPieceBlocksPathToSquare
                            else{
                                previousRow -= bishopRowMove[i];
                                previousColumn -= bishopColumnMove[i];
                            }
                        }
                        return true; // noPieceBlocksPathToSquare
                    } else {
                        nextRow += bishopRowMove[i];
                        nextColumn += bishopColumnMove[i];
                    }
                }
            }
        }
        
        // noPieceBlocksQueenPathToSquare
        return false;  
    }
    
    static private boolean moveDoesNotPlaceKingInCheck(int[][] fPieceTypeLocationsOnBoard)
    {
        int rowClicked = 0;
        int columnClicked = 0;
        int rowTargeted = 0;
        int columnTargeted = 0;
        int rowKing = 0;
        int columnKing = 0;
        
        int[][] tempArray = new int[8][8];
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                tempArray[i][j] = fPieceTypeLocationsOnBoard[i][j];
            }
        }
        System.out.println("temp array created");
        rowTargeted = Board.getRowFromLocation(Game.getTargetedSquare());
        columnTargeted = Board.getColumnFromLocation(Game.getTargetedSquare());
        
        rowClicked = Board.getRowFromLocation(TeamLewisChessController.getSquareClicked());
        columnClicked = Board.getColumnFromLocation(TeamLewisChessController.getSquareClicked());
        
        // update temporary board with hypothetical move
        tempArray[rowClicked][columnClicked] = tempArray[rowTargeted][columnTargeted];
        tempArray[rowTargeted][columnTargeted] = 0;
        System.out.println("move made");
        if (Game.getCurrentTeamsTurn() == 0){
            
            // find the white king 
            
            int whiteKing = 6;
            
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if (tempArray[i][j] == whiteKing){
                        rowKing = i;
                        columnKing = j;
                    }                    
                }
            }
            System.out.println("white king found");
            ///// check area for black Bishop and Queen                 
            
           int blackBishop = 10;
           int blackQueen = 11;
           
           int[] bishopRowMove = new int[4];
           int[] bishopColumnMove = new int[4];
           
           bishopRowMove[0] = 1  ; bishopColumnMove[0] = -1;
           bishopRowMove[1] = 1  ; bishopColumnMove[1] = 1;
           bishopRowMove[2] = -1 ; bishopColumnMove[2] = -1;
           bishopRowMove[3] = -1 ; bishopColumnMove[3] = 1;
           
           int nextRow = 0;
           int nextColumn = 0;
           boolean pieceInTheWay = false;
          
           for (int i = 0; i < 4; i++)
           {
               pieceInTheWay = false;
               nextRow = rowKing + bishopRowMove[i];
               nextColumn = columnKing + bishopColumnMove[i];
               
               while(pieceInTheWay == false && nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                   if (tempArray[nextRow][nextColumn] != 0){
                       if(tempArray[nextRow][nextColumn] == blackQueen || tempArray[nextRow][nextColumn] == blackBishop)
                            return false; // moveDoesNotPlaceKingInCheck
                        else
                            pieceInTheWay = true;
                   }
                   else{
                       nextRow += bishopRowMove[i];
                       nextColumn += bishopColumnMove[i];
                   }
               }
           }
           System.out.println("black bishop and black queen not found");
           ///// check area for black Rook and Queen                 
            
           int blackRook = 8;
           
           int[] rookRowMove = new int[4];
           int[] rookColumnMove = new int[4];
           
           rookRowMove[0] = 1  ; rookColumnMove[0] = 0;
           rookRowMove[1] = -1 ; rookColumnMove[1] = 0;
           rookRowMove[2] = 0  ; rookColumnMove[2] = 1;
           rookRowMove[3] = 0  ; rookColumnMove[3] = -1;
           
           for (int i = 0; i < 4; i++)
           {
               pieceInTheWay = false;
               nextRow = rowKing + rookRowMove[i];
               nextColumn = columnKing + rookColumnMove[i];
               
               while(pieceInTheWay == false && nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                   if (tempArray[nextRow][nextColumn] != 0){
                       if(tempArray[nextRow][nextColumn] == blackQueen || tempArray[nextRow][nextColumn] == blackRook)
                            return false; // moveDoesNotPlaceKingInCheck
                        else
                            pieceInTheWay = true;
                   }
                   else{
                       nextRow += rookRowMove[i];
                       nextColumn += rookColumnMove[i];
                   }
               }
           }
           System.out.println("black rook and black queen not found");
           
            ///// check area for blackknight
            
            int blackKnight = 9;
            
            int[] rowKnight = new int[8];
            int[] columnKnight= new int[8];
            
            rowKnight[0]= -1  ; columnKnight[0]=2;
            rowKnight[1]= -2  ; columnKnight[1]=1;      
            rowKnight[2]= -2  ; columnKnight[2]=-1;
            rowKnight[3]= -1  ; columnKnight[3]=-2;
            rowKnight[4]= 1   ; columnKnight[4]=-2;
            rowKnight[5]= 2   ; columnKnight[5]=-1;
            rowKnight[6]= 2   ; columnKnight[6]=1;
            rowKnight[7]= 1   ; columnKnight[7]=2;
            
           for(int i = 0; i <= 7 ;i++){
               
               nextRow = rowKing + rowKnight[i];
               nextColumn = columnKing + columnKnight[i];
                
               if(nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                   if(tempArray [nextRow][nextColumn] == blackKnight)
                       return false; // moveDoesNotPlaceKingInCheck
               }          
           }               
           System.out.println("black knight not found");
           // check area for black pawn
           
           int blackPawn = 7;
           
           int[] rowPawn = new int[2];
           int[] columnPawn= new int[2];
            
           rowPawn[0]= -1 ; columnPawn[0] = 1;
           rowPawn[1]= -1 ; columnPawn[1] = -1;      
            
           for(int i = 0; i < 2 ;i++){
               
              nextRow = rowKing + rowPawn[i];
              nextColumn = columnKing + columnPawn[i];
              
               if(nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                    if(tempArray[nextRow][nextColumn] == blackPawn)
                    return false; // moveDoesNotPlaceKingInCheck
               }
           }
           System.out.println("black pawn not found");
        }
        
        else { // black's turn
     
            //find the black king
            
            int blackKing = 12;
            
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if (tempArray[i][j] == blackKing){
                        rowKing = i;
                        columnKing = j;
                    }                    
                }
            }
            System.out.println("black king found");
            ///// check area for white Bishop and Queen                 
            
           int whiteBishop = 4;
           int whiteQueen = 5;
           
           int[] bishopRowMove = new int[4];
           int[] bishopColumnMove = new int[4];
           
           bishopRowMove[0] = 1  ; bishopColumnMove[0] = -1;
           bishopRowMove[1] = 1  ; bishopColumnMove[1] = 1;
           bishopRowMove[2] = -1 ; bishopColumnMove[2] = -1;
           bishopRowMove[3] = -1 ; bishopColumnMove[3] = 1;
           
           int nextRow = 0;
           int nextColumn = 0;
           boolean pieceInTheWay = false;
          
           for (int i = 0; i < 4; i++)
           {
               pieceInTheWay = false;
               nextRow = rowKing + bishopRowMove[i];
               nextColumn = columnKing + bishopColumnMove[i];
               
               while(pieceInTheWay == false && nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                   if (tempArray[nextRow][nextColumn] != 0){
                       if(tempArray[nextRow][nextColumn] == whiteQueen || tempArray[nextRow][nextColumn] == whiteBishop)
                            return false; // moveDoesNotPlaceKingInCheck
                        else
                            pieceInTheWay = true;
                   }
                   else{
                       nextRow += bishopRowMove[i];
                       nextColumn += bishopColumnMove[i];
                   }
               }
           }
           System.out.println("white bishop and queen not found");
           ///// check area for Rook and Queen (white)                
            
           int whiteRook = 2;
           
           int[] rookRowMove = new int[4];
           int[] rookColumnMove = new int[4];
           
           rookRowMove[0] = 1  ; rookColumnMove[0] = 0;
           rookRowMove[1] = 0  ; rookColumnMove[1] = 1;
           rookRowMove[2] = -1 ; rookColumnMove[2] = 0;
           rookRowMove[3] = 0  ; rookColumnMove[3] = -1;
           
           for (int i = 0; i < 4; i++)
           {
               pieceInTheWay = false;
               nextRow = rowKing + rookRowMove[i];
               nextColumn = columnKing + rookColumnMove[i];
               
               while(pieceInTheWay == false && nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                   if (tempArray[nextRow][nextColumn] != 0){
                       if(tempArray[nextRow][nextColumn] == whiteQueen || tempArray[nextRow][nextColumn] == whiteRook)
                            return false; // moveDoesNotPlaceKingInCheck
                        else
                            pieceInTheWay = true;
                   }
                   else{
                       nextRow += rookRowMove[i];
                       nextColumn += rookColumnMove[i];
                   }
               }
           }
           System.out.println("white rook and queen not found");
           ///// check area for whiteknight
            
           int whiteKnight = 3;
            
           int[] rowKnight = new int[8];
           int[] columnKnight= new int[8];
            
           rowKnight[0] = -1 ; columnKnight[0] = 2;
           rowKnight[1] = -2 ; columnKnight[1] = 1;      
           rowKnight[2] = -2 ; columnKnight[2] = -1;
           rowKnight[3] = -1 ; columnKnight[3] = -2;
           rowKnight[4] = 1  ; columnKnight[4] = -2;
           rowKnight[5] = 2  ; columnKnight[5] = -1;
           rowKnight[6] = 2  ; columnKnight[6] = 1;
           rowKnight[7] = 1  ; columnKnight[7] = 2;
           
           for(int i = 0; i <= 7; i++){
              
              nextRow = rowKing + rowKnight[i];
              nextColumn = columnKing + columnKnight[i];
              
              if(nextRow >= 0 && nextRow <= 7){
                    if(nextColumn >= 0 && nextColumn <= 7){ 
                        if(tempArray[nextRow][nextColumn] == whiteKnight)
                             return false; // moveDoesNotPlaceKingInCheck
                    }
                }          
           }
           System.out.println("white knight not found");
            // check area for white pawn
            
            int whitePawn = 1;
            
            int[] rowPawn = new int[2];
            int[] columnPawn= new int[2];
            
            rowPawn[0]= 1; columnPawn[0]= 1;
            rowPawn[1]= 1; columnPawn[1]= -1;      
            
            for(int i = 0; i < 2 ;i++){
                
              nextRow = rowKing + rowPawn[i];
              nextColumn = columnKing + columnPawn[i];
              
              if(nextRow >= 0 && nextRow <= 7 && nextColumn >= 0 && nextColumn <= 7){
                    if(tempArray[nextRow][nextColumn] == whitePawn)
                  return false; // moveDoesNotPlaceKingInCheck
              }
           }
            System.out.println("white pawn not found");
        }
        // moveDoesNotPlaceKingInCheck
        return true;
    }
    
    public Queen(int fLocation, int fTeam) {
        super(fLocation, fTeam);
    }
}
