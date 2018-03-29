package teamlewischess;

public class Pawn extends Piece {
    private boolean promoted;
    private boolean promotedToKnight;
    private boolean promotedToBishop;
    private boolean promotedToRook;
    private boolean promotedToQueen;
    
    static public boolean isValidMove(int[][] fPieceTypeLocationsOnBoard, Team fTeam)
    {
        //Just to satisfy program and to be updated with algorithm:
        return true;
    }
    
    static private boolean withinRangeOfPieceMobility(int[][] fPieceTypeLocationsOnBoard)
    {
        //Just to satisfy program and to be updated with algorithm:
        return false;
    }
    
    static private boolean noPieceBlocksPathToSquare(int[][] fPieceTypeLocationsOnBoard)
    {
        //Just to satisfy program and to be updated with algorithm:
        return false;
    }
    
    static private boolean moveDoesNotPlaceKingInCheck(int[][] fPieceTypeLocationsOnBoard)
    {
        //Just to satisfy program and to be updated with algorithm:
        return false;
    }
    
    public boolean promoted()
    {
        return promoted;
    }
    
    public boolean promotedToKnight()
    {
        return promotedToKnight;
    }
        
    public boolean promotedToBishop()
    {
        return promotedToBishop;
    }
    
    public boolean promotedToRook()
    {
        return promotedToRook;
    }
    
    public boolean promotedToQueen()
    {
        return promotedToQueen;
    }
    
    public Pawn(int fLocation, int fTeam) {
        super(fLocation, fTeam);
        
        promoted = false;
        promotedToKnight = false;
        promotedToBishop = false;
        promotedToRook = false;
        promotedToQueen = false;
    }
}
