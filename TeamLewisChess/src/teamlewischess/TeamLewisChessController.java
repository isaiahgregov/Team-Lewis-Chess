package teamlewischess;

// TeamLewisChessController.java
// Controller that handles Rectangle and ImageView events, as well as the File menu events.

/**
 * @author
 * 
 * FXML Controller Document 
 * 
 *
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

/**
 * 
 * @author 
 */
public class TeamLewisChessController  {

    @FXML private ResourceBundle resources;
    @FXML private URL location;

    @FXML private Rectangle A8_Rectangle;
    @FXML private Rectangle A7_Rectangle;
    @FXML private Rectangle A6_Rectangle;
    @FXML private Rectangle A5_Rectangle;
    @FXML private Rectangle A4_Rectangle;
    @FXML private Rectangle A3_Rectangle;
    @FXML private Rectangle A2_Rectangle;
    @FXML private Rectangle A1_Rectangle;
    @FXML private Rectangle B8_Rectangle;
    @FXML private Rectangle B7_Rectangle;
    @FXML private Rectangle B6_Rectangle;
    @FXML private Rectangle B5_Rectangle;
    @FXML private Rectangle B4_Rectangle;
    @FXML private Rectangle B3_Rectangle;
    @FXML private Rectangle B2_Rectangle;
    @FXML private Rectangle B1_Rectangle;
    @FXML private Rectangle C8_Rectangle;
    @FXML private Rectangle C7_Rectangle;
    @FXML private Rectangle C6_Rectangle;
    @FXML private Rectangle C5_Rectangle;
    @FXML private Rectangle C4_Rectangle;
    @FXML private Rectangle C3_Rectangle;
    @FXML private Rectangle C2_Rectangle;
    @FXML private Rectangle C1_Rectangle;
    @FXML private Rectangle D8_Rectangle;
    @FXML private Rectangle D7_Rectangle;
    @FXML private Rectangle D6_Rectangle;
    @FXML private Rectangle D5_Rectangle;
    @FXML private Rectangle D4_Rectangle;
    @FXML private Rectangle D3_Rectangle;
    @FXML private Rectangle D2_Rectangle;
    @FXML private Rectangle D1_Rectangle;
    @FXML private Rectangle E8_Rectangle;
    @FXML private Rectangle E7_Rectangle;
    @FXML private Rectangle E6_Rectangle;
    @FXML private Rectangle E5_Rectangle;
    @FXML private Rectangle E4_Rectangle;
    @FXML private Rectangle E3_Rectangle;
    @FXML private Rectangle E2_Rectangle;
    @FXML private Rectangle E1_Rectangle;
    @FXML private Rectangle F8_Rectangle;
    @FXML private Rectangle F7_Rectangle;
    @FXML private Rectangle F6_Rectangle;
    @FXML private Rectangle F5_Rectangle;
    @FXML private Rectangle F4_Rectangle;
    @FXML private Rectangle F3_Rectangle;
    @FXML private Rectangle F2_Rectangle;
    @FXML private Rectangle F1_Rectangle;
    @FXML private Rectangle G8_Rectangle;
    @FXML private Rectangle G7_Rectangle;
    @FXML private Rectangle G6_Rectangle;
    @FXML private Rectangle G5_Rectangle;
    @FXML private Rectangle G4_Rectangle;
    @FXML private Rectangle G3_Rectangle;
    @FXML private Rectangle G2_Rectangle;
    @FXML private Rectangle G1_Rectangle;
    @FXML private Rectangle H8_Rectangle;
    @FXML private Rectangle H7_Rectangle;
    @FXML private Rectangle H6_Rectangle;
    @FXML private Rectangle H5_Rectangle;
    @FXML private Rectangle H4_Rectangle;
    @FXML private Rectangle H3_Rectangle;
    @FXML private Rectangle H2_Rectangle;
    @FXML private Rectangle H1_Rectangle;

    @FXML private ImageView A8_ImageView;
    @FXML private ImageView A7_ImageView;
    @FXML private ImageView A6_ImageView;
    @FXML private ImageView A5_ImageView;
    @FXML private ImageView A4_ImageView;
    @FXML private ImageView A3_ImageView;
    @FXML private ImageView A2_ImageView;
    @FXML private ImageView A1_ImageView;
    @FXML private ImageView B8_ImageView;
    @FXML private ImageView B7_ImageView;
    @FXML private ImageView B6_ImageView;
    @FXML private ImageView B5_ImageView;
    @FXML private ImageView B4_ImageView;
    @FXML private ImageView B3_ImageView;
    @FXML private ImageView B2_ImageView;
    @FXML private ImageView B1_ImageView;
    @FXML private ImageView C8_ImageView;
    @FXML private ImageView C7_ImageView;
    @FXML private ImageView C6_ImageView;
    @FXML private ImageView C5_ImageView;
    @FXML private ImageView C4_ImageView;
    @FXML private ImageView C3_ImageView;
    @FXML private ImageView C2_ImageView;
    @FXML private ImageView C1_ImageView;
    @FXML private ImageView D8_ImageView;
    @FXML private ImageView D7_ImageView;
    @FXML private ImageView D6_ImageView;
    @FXML private ImageView D5_ImageView;
    @FXML private ImageView D4_ImageView;
    @FXML private ImageView D3_ImageView;
    @FXML private ImageView D2_ImageView;
    @FXML private ImageView D1_ImageView;
    @FXML private ImageView E8_ImageView;
    @FXML private ImageView E7_ImageView;
    @FXML private ImageView E6_ImageView;
    @FXML private ImageView E5_ImageView;
    @FXML private ImageView E4_ImageView;
    @FXML private ImageView E3_ImageView;
    @FXML private ImageView E2_ImageView;
    @FXML private ImageView E1_ImageView;
    @FXML private ImageView F8_ImageView;
    @FXML private ImageView F7_ImageView;
    @FXML private ImageView F6_ImageView;
    @FXML private ImageView F5_ImageView;
    @FXML private ImageView F4_ImageView;
    @FXML private ImageView F3_ImageView;
    @FXML private ImageView F2_ImageView;
    @FXML private ImageView F1_ImageView;
    @FXML private ImageView G8_ImageView;
    @FXML private ImageView G7_ImageView;
    @FXML private ImageView G6_ImageView;
    @FXML private ImageView G5_ImageView;
    @FXML private ImageView G4_ImageView;
    @FXML private ImageView G3_ImageView;
    @FXML private ImageView G2_ImageView;
    @FXML private ImageView G1_ImageView;
    @FXML private ImageView H8_ImageView;
    @FXML private ImageView H7_ImageView;
    @FXML private ImageView H6_ImageView;
    @FXML private ImageView H5_ImageView;
    @FXML private ImageView H4_ImageView;
    @FXML private ImageView H3_ImageView;
    @FXML private ImageView H2_ImageView;
    @FXML private ImageView H1_ImageView;
    
    Game oneGame = new Game();
    static private int squareClicked;
    static private int squareToWipe;
    static private int squareMovedTo;
    static private int imageToUpdateSquareMovedTo;
    static private int specialSquareToWipe;
    static private int specialSquareMovedTo;
    static private int imageToUpdateSpecialSquareMovedTo;
    static private boolean highlightSquareClicked;
    
    /**
     * @param Mouse event for ImageView
     * calls gamelogic, updates square images and highlight
     */
    
    @FXML void A1_ImageViewClicked(MouseEvent event) {
        squareClicked = 56;
        
        if (Game.getGameStatus() == 0) {
        
            try {
            oneGame.determineAndExeLogicAction();
            } catch (IOException ioex) {
                System.out.println("IOException " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * @param Mouse event for ImageView
     * calls gamelogic, updates square images and highlight
     */
    @FXML void A2_ImageViewClicked(MouseEvent event) {
        squareClicked = 48;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void A3_ImageViewClicked(MouseEvent event) {
        squareClicked = 40;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void A4_ImageViewClicked(MouseEvent event) {
        squareClicked = 32;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void A5_ImageViewClicked(MouseEvent event) {
        squareClicked = 24;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void A6_ImageViewClicked(MouseEvent event) {
        squareClicked = 16;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void A7_ImageViewClicked(MouseEvent event) {
        squareClicked = 8;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void A8_ImageViewClicked(MouseEvent event) {
        squareClicked = 0;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void B1_ImageViewClicked(MouseEvent event) {
        squareClicked = 57;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void B2_ImageViewClicked(MouseEvent event) {
        squareClicked = 49;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void B3_ImageViewClicked(MouseEvent event) {
        squareClicked = 41;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void B4_ImageViewClicked(MouseEvent event) {
        squareClicked = 33;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void B5_ImageViewClicked(MouseEvent event) {
        squareClicked = 25;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void B6_ImageViewClicked(MouseEvent event) {
        squareClicked = 17;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }
 
    /**
     * 
     * @param event 
     */
    @FXML void B7_ImageViewClicked(MouseEvent event) {
        squareClicked = 9;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }
 
    /**
     * 
     * @param event 
     */
    @FXML void B8_ImageViewClicked(MouseEvent event) {
        squareClicked = 1;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void C1_ImageViewClicked(MouseEvent event) {
        squareClicked = 58;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void C2_ImageViewClicked(MouseEvent event) {
        squareClicked = 50;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */  
    @FXML void C3_ImageViewClicked(MouseEvent event) {
        squareClicked = 42;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void C4_ImageViewClicked(MouseEvent event) {
        squareClicked = 34;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void C5_ImageViewClicked(MouseEvent event) {
        squareClicked = 26;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void C6_ImageViewClicked(MouseEvent event) {
        squareClicked = 18;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void C7_ImageViewClicked(MouseEvent event) {
        squareClicked = 10;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }
    /**
     * 
     * @param event 
     */
    @FXML void C8_ImageViewClicked(MouseEvent event) {
        squareClicked = 2;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D1_ImageViewClicked(MouseEvent event) {
        squareClicked = 59;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D2_ImageViewClicked(MouseEvent event) {
        squareClicked = 51;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D3_ImageViewClicked(MouseEvent event) {
        squareClicked = 43;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D4_ImageViewClicked(MouseEvent event) {
        squareClicked = 35;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D5_ImageViewClicked(MouseEvent event) {
        squareClicked = 27;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D6_ImageViewClicked(MouseEvent event) {
        squareClicked = 19;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D7_ImageViewClicked(MouseEvent event) {
        squareClicked = 11;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void D8_ImageViewClicked(MouseEvent event) {
        squareClicked = 3;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E1_ImageViewClicked(MouseEvent event) {
        squareClicked = 60;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E2_ImageViewClicked(MouseEvent event) {
        squareClicked = 52;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E3_ImageViewClicked(MouseEvent event) {
        squareClicked = 44;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E4_ImageViewClicked(MouseEvent event) {
        squareClicked = 36;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E5_ImageViewClicked(MouseEvent event) {
        squareClicked = 28;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E6_ImageViewClicked(MouseEvent event) {
        squareClicked = 20;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E7_ImageViewClicked(MouseEvent event) {
        squareClicked = 12;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void E8_ImageViewClicked(MouseEvent event) {
        squareClicked = 4;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F1_ImageViewClicked(MouseEvent event) {
        squareClicked = 61;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F2_ImageViewClicked(MouseEvent event) {
        squareClicked = 53;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F3_ImageViewClicked(MouseEvent event) {
        squareClicked = 45;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F4_ImageViewClicked(MouseEvent event) {
        squareClicked = 37;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F5_ImageViewClicked(MouseEvent event) {
        squareClicked = 29;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F6_ImageViewClicked(MouseEvent event) {
        squareClicked = 21;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F7_ImageViewClicked(MouseEvent event) {
        squareClicked = 13;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void F8_ImageViewClicked(MouseEvent event) {
        squareClicked = 5;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G1_ImageViewClicked(MouseEvent event) {
        squareClicked = 62;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G2_ImageViewClicked(MouseEvent event) {
        squareClicked = 54;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G3_ImageViewClicked(MouseEvent event) {
        squareClicked = 46;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G4_ImageViewClicked(MouseEvent event) {
        squareClicked = 38;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G5_ImageViewClicked(MouseEvent event) {
        squareClicked = 30;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G6_ImageViewClicked(MouseEvent event) {
        squareClicked = 22;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G7_ImageViewClicked(MouseEvent event) {
        squareClicked = 14;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void G8_ImageViewClicked(MouseEvent event) {
        squareClicked = 6;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H1_ImageViewClicked(MouseEvent event) {
        squareClicked = 63;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H2_ImageViewClicked(MouseEvent event) {
        squareClicked = 55;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H3_ImageViewClicked(MouseEvent event) {
        squareClicked = 47;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H4_ImageViewClicked(MouseEvent event) {
        squareClicked = 39;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H5_ImageViewClicked(MouseEvent event) {
        squareClicked = 31;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H6_ImageViewClicked(MouseEvent event) {
        squareClicked = 23;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H7_ImageViewClicked(MouseEvent event) {
        squareClicked = 15;
        
        if (Game.getGameStatus() == 0)
        {
            try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void H8_ImageViewClicked(MouseEvent event) {
        squareClicked = 7;
        
        if (Game.getGameStatus() == 0)
        {
           try {
            oneGame.determineAndExeLogicAction();
            updateSquareImages();
            }catch (IOException ioex) {
                System.out.println("IOexception ioex " + ioex.getMessage());
            }
            updateSquareImages();
            updateHighlightValue();
        }
    }

    /**
     * 
     * @param event 
     */
    @FXML void NewGameMenuItemClicked(ActionEvent event) {
        oneGame.newGame();
        
        A8_Rectangle.setVisible(false);
        B8_Rectangle.setVisible(false);
        C8_Rectangle.setVisible(false);
        D8_Rectangle.setVisible(false);
        E8_Rectangle.setVisible(false);
        F8_Rectangle.setVisible(false);
        G8_Rectangle.setVisible(false);
        H8_Rectangle.setVisible(false);
        A7_Rectangle.setVisible(false);
        B7_Rectangle.setVisible(false);
        C7_Rectangle.setVisible(false);
        D7_Rectangle.setVisible(false);
        E7_Rectangle.setVisible(false);
        F7_Rectangle.setVisible(false);
        G7_Rectangle.setVisible(false);
        H7_Rectangle.setVisible(false);
        A6_Rectangle.setVisible(false);
        B6_Rectangle.setVisible(false);
        C6_Rectangle.setVisible(false);
        D6_Rectangle.setVisible(false);
        E6_Rectangle.setVisible(false);
        F6_Rectangle.setVisible(false);
        G6_Rectangle.setVisible(false);
        H6_Rectangle.setVisible(false);
        A5_Rectangle.setVisible(false);
        B5_Rectangle.setVisible(false);
        C5_Rectangle.setVisible(false);
        D5_Rectangle.setVisible(false);
        E5_Rectangle.setVisible(false);
        F5_Rectangle.setVisible(false);
        G5_Rectangle.setVisible(false);
        H5_Rectangle.setVisible(false);
        A4_Rectangle.setVisible(false);
        B4_Rectangle.setVisible(false);
        C4_Rectangle.setVisible(false);
        D4_Rectangle.setVisible(false);
        E4_Rectangle.setVisible(false);
        F4_Rectangle.setVisible(false);
        G4_Rectangle.setVisible(false);
        H4_Rectangle.setVisible(false);
        A3_Rectangle.setVisible(false);
        B3_Rectangle.setVisible(false);
        C3_Rectangle.setVisible(false);
        D3_Rectangle.setVisible(false);
        E3_Rectangle.setVisible(false);
        F3_Rectangle.setVisible(false);
        G3_Rectangle.setVisible(false);
        H3_Rectangle.setVisible(false);
        A2_Rectangle.setVisible(false);
        B2_Rectangle.setVisible(false);
        C2_Rectangle.setVisible(false);
        D2_Rectangle.setVisible(false);
        E2_Rectangle.setVisible(false);
        F2_Rectangle.setVisible(false);
        G2_Rectangle.setVisible(false);
        H2_Rectangle.setVisible(false);
        A1_Rectangle.setVisible(false);
        B1_Rectangle.setVisible(false);
        C1_Rectangle.setVisible(false);
        D1_Rectangle.setVisible(false);
        E1_Rectangle.setVisible(false);
        F1_Rectangle.setVisible(false);
        G1_Rectangle.setVisible(false);
        H1_Rectangle.setVisible(false);
        
        A3_ImageView.setImage(null);
        A4_ImageView.setImage(null);
        A5_ImageView.setImage(null);
        A6_ImageView.setImage(null);
        B3_ImageView.setImage(null);
        B4_ImageView.setImage(null);
        B5_ImageView.setImage(null);
        B6_ImageView.setImage(null);
        C3_ImageView.setImage(null);
        C4_ImageView.setImage(null);
        C5_ImageView.setImage(null);
        C6_ImageView.setImage(null);
        D3_ImageView.setImage(null);
        D4_ImageView.setImage(null);
        D5_ImageView.setImage(null);
        D6_ImageView.setImage(null);
        E3_ImageView.setImage(null);
        E4_ImageView.setImage(null);
        E5_ImageView.setImage(null);
        E6_ImageView.setImage(null);
        F3_ImageView.setImage(null);
        F4_ImageView.setImage(null);
        F5_ImageView.setImage(null);
        F6_ImageView.setImage(null);
        G3_ImageView.setImage(null);
        G4_ImageView.setImage(null);
        G5_ImageView.setImage(null);
        G6_ImageView.setImage(null);
        H3_ImageView.setImage(null);
        H4_ImageView.setImage(null);
        H5_ImageView.setImage(null);
        H6_ImageView.setImage(null);
        
        Image imageOne;
        imageOne = new Image("/teamlewischess/images/whitepawn.png");
        A2_ImageView.setImage(imageOne);
        B2_ImageView.setImage(imageOne);
        C2_ImageView.setImage(imageOne);
        D2_ImageView.setImage(imageOne);
        E2_ImageView.setImage(imageOne);
        F2_ImageView.setImage(imageOne);
        G2_ImageView.setImage(imageOne);
        H2_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/whiterook.png");
        A1_ImageView.setImage(imageOne);
        H1_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/whiteknight.png");
        B1_ImageView.setImage(imageOne);
        G1_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/whitebishop.png");
        C1_ImageView.setImage(imageOne);
        F1_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/whitequeen.png");
        D1_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/whiteking.png");
        E1_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/blackpawn.png");
        A7_ImageView.setImage(imageOne);
        B7_ImageView.setImage(imageOne);
        C7_ImageView.setImage(imageOne);
        D7_ImageView.setImage(imageOne);
        E7_ImageView.setImage(imageOne);
        F7_ImageView.setImage(imageOne);
        G7_ImageView.setImage(imageOne);
        H7_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/blackrook.png");
        A8_ImageView.setImage(imageOne);
        H8_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/blackknight.png");
        B8_ImageView.setImage(imageOne);
        G8_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/blackbishop.png");
        C8_ImageView.setImage(imageOne);
        F8_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/blackqueen.png");
        D8_ImageView.setImage(imageOne);
        imageOne = new Image("/teamlewischess/images/blackking.png");
        E8_ImageView.setImage(imageOne);
    }
    
    @FXML void CloseMenuItemClicked(ActionEvent event) {
        System.exit(0);
    }
    
    private void updateSquareImages()
    {
        if (squareMovedTo != -1)
        {
            switch (squareToWipe) {
                case 0:
                    A8_ImageView.setImage(null);
                    break;
                case 1:
                    B8_ImageView.setImage(null);
                    break;
                case 2:
                    C8_ImageView.setImage(null);
                    break;
                case 3:
                    D8_ImageView.setImage(null);
                    break;
                case 4:
                    E8_ImageView.setImage(null);
                    break;
                case 5:
                    F8_ImageView.setImage(null);
                    break;
                case 6:
                    G8_ImageView.setImage(null);
                    break;
                case 7:
                    H8_ImageView.setImage(null);
                    break;
                case 8:
                    A7_ImageView.setImage(null);
                    break;
                case 9:
                    B7_ImageView.setImage(null);
                    break;
                case 10:
                    C7_ImageView.setImage(null);
                    break;
                case 11:
                    D7_ImageView.setImage(null);
                    break;
                case 12:
                    E7_ImageView.setImage(null);
                    break;
                case 13:
                    F7_ImageView.setImage(null);
                    break;
                case 14:
                    G7_ImageView.setImage(null);
                    break;
                case 15:
                    H7_ImageView.setImage(null);
                    break;
                case 16:
                    A6_ImageView.setImage(null);
                    break;
                case 17:
                    B6_ImageView.setImage(null);
                    break;
                case 18:
                    C6_ImageView.setImage(null);
                    break;
                case 19:
                    D6_ImageView.setImage(null);
                    break;
                case 20:
                    E6_ImageView.setImage(null);
                    break;
                case 21:
                    F6_ImageView.setImage(null);
                    break;
                case 22:
                    G6_ImageView.setImage(null);
                    break;
                case 23:
                    H6_ImageView.setImage(null);
                    break;
                case 24:
                    A5_ImageView.setImage(null);
                    break;
                case 25:
                    B5_ImageView.setImage(null);
                    break;
                case 26:
                    C5_ImageView.setImage(null);
                    break;
                case 27:
                    D5_ImageView.setImage(null);
                    break;
                case 28:
                    E5_ImageView.setImage(null);
                    break;
                case 29:
                    F5_ImageView.setImage(null);
                    break;
                case 30:
                    G5_ImageView.setImage(null);
                    break;
                case 31:
                    H5_ImageView.setImage(null);
                    break;
                case 32:
                    A4_ImageView.setImage(null);
                    break;
                case 33:
                    B4_ImageView.setImage(null);
                    break;
                case 34:
                    C4_ImageView.setImage(null);
                    break;
                case 35:
                    D4_ImageView.setImage(null);
                    break;
                case 36:
                    E4_ImageView.setImage(null);
                    break;
                case 37:
                    F4_ImageView.setImage(null);
                    break;
                case 38:
                    G4_ImageView.setImage(null);
                    break;
                case 39:
                    H4_ImageView.setImage(null);
                    break;
                case 40:
                    A3_ImageView.setImage(null);
                    break;
                case 41:
                    B3_ImageView.setImage(null);
                    break;
                case 42:
                    C3_ImageView.setImage(null);
                    break;
                case 43:
                    D3_ImageView.setImage(null);
                    break;
                case 44:
                    E3_ImageView.setImage(null);
                    break;
                case 45:
                    F3_ImageView.setImage(null);
                    break;
                case 46:
                    G3_ImageView.setImage(null);
                    break;
                case 47:
                    H3_ImageView.setImage(null);
                    break;
                case 48:
                    A2_ImageView.setImage(null);
                    break;
                case 49:
                    B2_ImageView.setImage(null);
                    break;
                case 50:
                    C2_ImageView.setImage(null);
                    break;
                case 51:
                    D2_ImageView.setImage(null);
                    break;
                case 52:
                    E2_ImageView.setImage(null);
                    break;
                case 53:
                    F2_ImageView.setImage(null);
                    break;
                case 54:
                    G2_ImageView.setImage(null);
                    break;
                case 55:
                    H2_ImageView.setImage(null);
                    break;
                case 56:
                    A1_ImageView.setImage(null);
                    break;
                case 57:
                    B1_ImageView.setImage(null);
                    break;
                case 58:
                    C1_ImageView.setImage(null);
                    break;
                case 59:
                    D1_ImageView.setImage(null);
                    break;
                case 60:
                    E1_ImageView.setImage(null);
                    break;
                case 61:
                    F1_ImageView.setImage(null);
                    break;
                case 62:
                    G1_ImageView.setImage(null);
                    break;
                case 63:
                    H1_ImageView.setImage(null);
                    break;
                default:
                    break;
            }
            
            //Initializing just because the IDE doesn't know that one of the switch
            //conditions will be true and execute its case block.
            Image imageOne = new Image("/teamlewischess/images/whitepawn.png");
            
            switch (imageToUpdateSquareMovedTo) {
                case 1:
                    imageOne = new Image("/teamlewischess/images/whitepawn.png");
                    break;
                case 2:
                    imageOne = new Image("/teamlewischess/images/whiterook.png");
                    break;
                case 3:
                    imageOne = new Image("/teamlewischess/images/whiteknight.png");
                    break;
                case 4:
                    imageOne = new Image("/teamlewischess/images/whitebishop.png");
                    break;
                case 5:
                    imageOne = new Image("/teamlewischess/images/whitequeen.png");
                    break;
                case 6:
                    imageOne = new Image("/teamlewischess/images/whiteking.png");
                    break;
                case 7:
                    imageOne = new Image("/teamlewischess/images/blackpawn.png");
                    break;
                case 8:
                    imageOne = new Image("/teamlewischess/images/blackrook.png");
                    break;
                case 9:
                    imageOne = new Image("/teamlewischess/images/blackknight.png");
                    break;
                case 10:
                    imageOne = new Image("/teamlewischess/images/blackbishop.png");
                    break;
                case 11:
                    imageOne = new Image("/teamlewischess/images/blackqueen.png");
                    break;
                case 12:
                    imageOne = new Image("/teamlewischess/images/blackking.png");
                    break;
                default:
                    break;
            }
            
            switch (squareMovedTo) {
                case 0:
                    A8_ImageView.setImage(imageOne);
                    break;
                case 1:
                    B8_ImageView.setImage(imageOne);
                    break;
                case 2:
                    C8_ImageView.setImage(imageOne);
                    break;
                case 3:
                    D8_ImageView.setImage(imageOne);
                    break;
                case 4:
                    E8_ImageView.setImage(imageOne);
                    break;
                case 5:
                    F8_ImageView.setImage(imageOne);
                    break;
                case 6:
                    G8_ImageView.setImage(imageOne);
                    break;
                case 7:
                    H8_ImageView.setImage(imageOne);
                    break;
                case 8:
                    A7_ImageView.setImage(imageOne);
                    break;
                case 9:
                    B7_ImageView.setImage(imageOne);
                    break;
                case 10:
                    C7_ImageView.setImage(imageOne);
                    break;
                case 11:
                    D7_ImageView.setImage(imageOne);
                    break;
                case 12:
                    E7_ImageView.setImage(imageOne);
                    break;
                case 13:
                    F7_ImageView.setImage(imageOne);
                    break;
                case 14:
                    G7_ImageView.setImage(imageOne);
                    break;
                case 15:
                    H7_ImageView.setImage(imageOne);
                    break;
                case 16:
                    A6_ImageView.setImage(imageOne);
                    break;
                case 17:
                    B6_ImageView.setImage(imageOne);
                    break;
                case 18:
                    C6_ImageView.setImage(imageOne);
                    break;
                case 19:
                    D6_ImageView.setImage(imageOne);
                    break;
                case 20:
                    E6_ImageView.setImage(imageOne);
                    break;
                case 21:
                    F6_ImageView.setImage(imageOne);
                    break;
                case 22:
                    G6_ImageView.setImage(imageOne);
                    break;
                case 23:
                    H6_ImageView.setImage(imageOne);
                    break;
                case 24:
                    A5_ImageView.setImage(imageOne);
                    break;
                case 25:
                    B5_ImageView.setImage(imageOne);
                    break;
                case 26:
                    C5_ImageView.setImage(imageOne);
                    break;
                case 27:
                    D5_ImageView.setImage(imageOne);
                    break;
                case 28:
                    E5_ImageView.setImage(imageOne);
                    break;
                case 29:
                    F5_ImageView.setImage(imageOne);
                    break;
                case 30:
                    G5_ImageView.setImage(imageOne);
                    break;
                case 31:
                    H5_ImageView.setImage(imageOne);
                    break;
                case 32:
                    A4_ImageView.setImage(imageOne);
                    break;
                case 33:
                    B4_ImageView.setImage(imageOne);
                    break;
                case 34:
                    C4_ImageView.setImage(imageOne);
                    break;
                case 35:
                    D4_ImageView.setImage(imageOne);
                    break;
                case 36:
                    E4_ImageView.setImage(imageOne);
                    break;
                case 37:
                    F4_ImageView.setImage(imageOne);
                    break;
                case 38:
                    G4_ImageView.setImage(imageOne);
                    break;
                case 39:
                    H4_ImageView.setImage(imageOne);
                    break;
                case 40:
                    A3_ImageView.setImage(imageOne);
                    break;
                case 41:
                    B3_ImageView.setImage(imageOne);
                    break;
                case 42:
                    C3_ImageView.setImage(imageOne);
                    break;
                case 43:
                    D3_ImageView.setImage(imageOne);
                    break;
                case 44:
                    E3_ImageView.setImage(imageOne);
                    break;
                case 45:
                    F3_ImageView.setImage(imageOne);
                    break;
                case 46:
                    G3_ImageView.setImage(imageOne);
                    break;
                case 47:
                    H3_ImageView.setImage(imageOne);
                    break;
                case 48:
                    A2_ImageView.setImage(imageOne);
                    break;
                case 49:
                    B2_ImageView.setImage(imageOne);
                    break;
                case 50:
                    C2_ImageView.setImage(imageOne);
                    break;
                case 51:
                    D2_ImageView.setImage(imageOne);
                    break;
                case 52:
                    E2_ImageView.setImage(imageOne);
                    break;
                case 53:
                    F2_ImageView.setImage(imageOne);
                    break;
                case 54:
                    G2_ImageView.setImage(imageOne);
                    break;
                case 55:
                    H2_ImageView.setImage(imageOne);
                    break;
                case 56:
                    A1_ImageView.setImage(imageOne);
                    break;
                case 57:
                    B1_ImageView.setImage(imageOne);
                    break;
                case 58:
                    C1_ImageView.setImage(imageOne);
                    break;
                case 59:
                    D1_ImageView.setImage(imageOne);
                    break;
                case 60:
                    E1_ImageView.setImage(imageOne);
                    break;
                case 61:
                    F1_ImageView.setImage(imageOne);
                    break;
                case 62:
                    G1_ImageView.setImage(imageOne);
                    break;
                case 63:
                    H1_ImageView.setImage(imageOne);
                    break;
                default:
                    break;
            }
            
            if (specialSquareToWipe != -1)
            {
                switch (specialSquareToWipe) {
                    case 0:
                        A8_ImageView.setImage(null);
                        break;
                    case 1:
                        B8_ImageView.setImage(null);
                        break;
                    case 2:
                        C8_ImageView.setImage(null);
                        break;
                    case 3:
                        D8_ImageView.setImage(null);
                        break;
                    case 4:
                        E8_ImageView.setImage(null);
                        break;
                    case 5:
                        F8_ImageView.setImage(null);
                        break;
                    case 6:
                        G8_ImageView.setImage(null);
                        break;
                    case 7:
                        H8_ImageView.setImage(null);
                        break;
                    case 8:
                        A7_ImageView.setImage(null);
                        break;
                    case 9:
                        B7_ImageView.setImage(null);
                        break;
                    case 10:
                        C7_ImageView.setImage(null);
                        break;
                    case 11:
                        D7_ImageView.setImage(null);
                        break;
                    case 12:
                        E7_ImageView.setImage(null);
                        break;
                    case 13:
                        F7_ImageView.setImage(null);
                        break;
                    case 14:
                        G7_ImageView.setImage(null);
                        break;
                    case 15:
                        H7_ImageView.setImage(null);
                        break;
                    case 16:
                        A6_ImageView.setImage(null);
                        break;
                    case 17:
                        B6_ImageView.setImage(null);
                        break;
                    case 18:
                        C6_ImageView.setImage(null);
                        break;
                    case 19:
                        D6_ImageView.setImage(null);
                        break;
                    case 20:
                        E6_ImageView.setImage(null);
                        break;
                    case 21:
                        F6_ImageView.setImage(null);
                        break;
                    case 22:
                        G6_ImageView.setImage(null);
                        break;
                    case 23:
                        H6_ImageView.setImage(null);
                        break;
                    case 24:
                        A5_ImageView.setImage(null);
                        break;
                    case 25:
                        B5_ImageView.setImage(null);
                        break;
                    case 26:
                        C5_ImageView.setImage(null);
                        break;
                    case 27:
                        D5_ImageView.setImage(null);
                        break;
                    case 28:
                        E5_ImageView.setImage(null);
                        break;
                    case 29:
                        F5_ImageView.setImage(null);
                        break;
                    case 30:
                        G5_ImageView.setImage(null);
                        break;
                    case 31:
                        H5_ImageView.setImage(null);
                        break;
                    case 32:
                        A4_ImageView.setImage(null);
                        break;
                    case 33:
                        B4_ImageView.setImage(null);
                        break;
                    case 34:
                        C4_ImageView.setImage(null);
                        break;
                    case 35:
                        D4_ImageView.setImage(null);
                        break;
                    case 36:
                        E4_ImageView.setImage(null);
                        break;
                    case 37:
                        F4_ImageView.setImage(null);
                        break;
                    case 38:
                        G4_ImageView.setImage(null);
                        break;
                    case 39:
                        H4_ImageView.setImage(null);
                        break;
                    case 40:
                        A3_ImageView.setImage(null);
                        break;
                    case 41:
                        B3_ImageView.setImage(null);
                        break;
                    case 42:
                        C3_ImageView.setImage(null);
                        break;
                    case 43:
                        D3_ImageView.setImage(null);
                        break;
                    case 44:
                        E3_ImageView.setImage(null);
                        break;
                    case 45:
                        F3_ImageView.setImage(null);
                        break;
                    case 46:
                        G3_ImageView.setImage(null);
                        break;
                    case 47:
                        H3_ImageView.setImage(null);
                        break;
                    case 48:
                        A2_ImageView.setImage(null);
                        break;
                    case 49:
                        B2_ImageView.setImage(null);
                        break;
                    case 50:
                        C2_ImageView.setImage(null);
                        break;
                    case 51:
                        D2_ImageView.setImage(null);
                        break;
                    case 52:
                        E2_ImageView.setImage(null);
                        break;
                    case 53:
                        F2_ImageView.setImage(null);
                        break;
                    case 54:
                        G2_ImageView.setImage(null);
                        break;
                    case 55:
                        H2_ImageView.setImage(null);
                        break;
                    case 56:
                        A1_ImageView.setImage(null);
                        break;
                    case 57:
                        B1_ImageView.setImage(null);
                        break;
                    case 58:
                        C1_ImageView.setImage(null);
                        break;
                    case 59:
                        D1_ImageView.setImage(null);
                        break;
                    case 60:
                        E1_ImageView.setImage(null);
                        break;
                    case 61:
                        F1_ImageView.setImage(null);
                        break;
                    case 62:
                        G1_ImageView.setImage(null);
                        break;
                    case 63:
                        H1_ImageView.setImage(null);
                        break;
                    default:
                        break;
                }
                
                if (specialSquareMovedTo != -1)
                {
                    switch (imageToUpdateSpecialSquareMovedTo) {
                        case 1:
                            imageOne = new Image("/teamlewischess/images/whitepawn.png");
                            break;
                        case 2:
                            imageOne = new Image("/teamlewischess/images/whiterook.png");
                            break;
                        case 3:
                            imageOne = new Image("/teamlewischess/images/whiteknight.png");
                            break;
                        case 4:
                            imageOne = new Image("/teamlewischess/images/whitebishop.png");
                            break;
                        case 5:
                            imageOne = new Image("/teamlewischess/images/whitequeen.png");
                            break;
                        case 6:
                            imageOne = new Image("/teamlewischess/images/whiteking.png");
                            break;
                        case 7:
                            imageOne = new Image("/teamlewischess/images/blackpawn.png");
                            break;
                        case 8:
                            imageOne = new Image("/teamlewischess/images/blackrook.png");
                            break;
                        case 9:
                            imageOne = new Image("/teamlewischess/images/blackknight.png");
                            break;
                        case 10:
                            imageOne = new Image("/teamlewischess/images/blackbishop.png");
                            break;
                        case 11:
                            imageOne = new Image("/teamlewischess/images/blackqueen.png");
                            break;
                        case 12:
                            imageOne = new Image("/teamlewischess/images/blackking.png");
                            break;
                        default:
                            break;
                    }
                
                    switch (specialSquareMovedTo) {
                        case 0:
                            A8_ImageView.setImage(imageOne);
                            break;
                        case 1:
                            B8_ImageView.setImage(imageOne);
                            break;
                        case 2:
                            C8_ImageView.setImage(imageOne);
                            break;
                        case 3:
                            D8_ImageView.setImage(imageOne);
                            break;
                        case 4:
                            E8_ImageView.setImage(imageOne);
                            break;
                        case 5:
                            F8_ImageView.setImage(imageOne);
                            break;
                        case 6:
                            G8_ImageView.setImage(imageOne);
                            break;
                        case 7:
                            H8_ImageView.setImage(imageOne);
                            break;
                        case 8:
                            A7_ImageView.setImage(imageOne);
                            break;
                        case 9:
                            B7_ImageView.setImage(imageOne);
                            break;
                        case 10:
                            C7_ImageView.setImage(imageOne);
                            break;
                        case 11:
                            D7_ImageView.setImage(imageOne);
                            break;
                        case 12:
                            E7_ImageView.setImage(imageOne);
                            break;
                        case 13:
                            F7_ImageView.setImage(imageOne);
                            break;
                        case 14:
                            G7_ImageView.setImage(imageOne);
                            break;
                        case 15:
                            H7_ImageView.setImage(imageOne);
                            break;
                        case 16:
                            A6_ImageView.setImage(imageOne);
                            break;
                        case 17:
                            B6_ImageView.setImage(imageOne);
                            break;
                        case 18:
                            C6_ImageView.setImage(imageOne);
                            break;
                        case 19:
                            D6_ImageView.setImage(imageOne);
                            break;
                        case 20:
                            E6_ImageView.setImage(imageOne);
                            break;
                        case 21:
                            F6_ImageView.setImage(imageOne);
                            break;
                        case 22:
                            G6_ImageView.setImage(imageOne);
                            break;
                        case 23:
                            H6_ImageView.setImage(imageOne);
                            break;
                        case 24:
                            A5_ImageView.setImage(imageOne);
                            break;
                        case 25:
                            B5_ImageView.setImage(imageOne);
                            break;
                        case 26:
                            C5_ImageView.setImage(imageOne);
                            break;
                        case 27:
                            D5_ImageView.setImage(imageOne);
                            break;
                        case 28:
                            E5_ImageView.setImage(imageOne);
                            break;
                        case 29:
                            F5_ImageView.setImage(imageOne);
                            break;
                        case 30:
                            G5_ImageView.setImage(imageOne);
                            break;
                        case 31:
                            H5_ImageView.setImage(imageOne);
                            break;
                        case 32:
                            A4_ImageView.setImage(imageOne);
                            break;
                        case 33:
                            B4_ImageView.setImage(imageOne);
                            break;
                        case 34:
                            C4_ImageView.setImage(imageOne);
                            break;
                        case 35:
                            D4_ImageView.setImage(imageOne);
                            break;
                        case 36:
                            E4_ImageView.setImage(imageOne);
                            break;
                        case 37:
                            F4_ImageView.setImage(imageOne);
                            break;
                        case 38:
                            G4_ImageView.setImage(imageOne);
                            break;
                        case 39:
                            H4_ImageView.setImage(imageOne);
                            break;
                        case 40:
                            A3_ImageView.setImage(imageOne);
                            break;
                        case 41:
                            B3_ImageView.setImage(imageOne);
                            break;
                        case 42:
                            C3_ImageView.setImage(imageOne);
                            break;
                        case 43:
                            D3_ImageView.setImage(imageOne);
                            break;
                        case 44:
                            E3_ImageView.setImage(imageOne);
                            break;
                        case 45:
                            F3_ImageView.setImage(imageOne);
                            break;
                        case 46:
                            G3_ImageView.setImage(imageOne);
                            break;
                        case 47:
                            H3_ImageView.setImage(imageOne);
                            break;
                        case 48:
                            A2_ImageView.setImage(imageOne);
                            break;
                        case 49:
                            B2_ImageView.setImage(imageOne);
                            break;
                        case 50:
                            C2_ImageView.setImage(imageOne);
                            break;
                        case 51:
                            D2_ImageView.setImage(imageOne);
                            break;
                        case 52:
                            E2_ImageView.setImage(imageOne);
                            break;
                        case 53:
                            F2_ImageView.setImage(imageOne);
                            break;
                        case 54:
                            G2_ImageView.setImage(imageOne);
                            break;
                        case 55:
                            H2_ImageView.setImage(imageOne);
                            break;
                        case 56:
                            A1_ImageView.setImage(imageOne);
                            break;
                        case 57:
                            B1_ImageView.setImage(imageOne);
                            break;
                        case 58:
                            C1_ImageView.setImage(imageOne);
                            break;
                        case 59:
                            D1_ImageView.setImage(imageOne);
                            break;
                        case 60:
                            E1_ImageView.setImage(imageOne);
                            break;
                        case 61:
                            F1_ImageView.setImage(imageOne);
                            break;
                        case 62:
                            G1_ImageView.setImage(imageOne);
                            break;
                        case 63:
                            H1_ImageView.setImage(imageOne);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
    
    /**
     *  updates highlight value on board for (targeted) square
     */
    private void updateHighlightValue()
    {
        if (highlightSquareClicked == true)
        {
            switch (Game.getTargetedSquare()) {
                case 0:
                    A8_Rectangle.setVisible(true);
                    break;
                case 1:
                    B8_Rectangle.setVisible(true);
                    break;
                case 2:
                    C8_Rectangle.setVisible(true);
                    break;
                case 3:
                    D8_Rectangle.setVisible(true);
                    break;
                case 4:
                    E8_Rectangle.setVisible(true);
                    break;
                case 5:
                    F8_Rectangle.setVisible(true);
                    break;
                case 6:
                    G8_Rectangle.setVisible(true);
                    break;
                case 7:
                    H8_Rectangle.setVisible(true);
                    break;
                case 8:
                    A7_Rectangle.setVisible(true);
                    break;
                case 9:
                    B7_Rectangle.setVisible(true);
                    break;
                case 10:
                    C7_Rectangle.setVisible(true);
                    break;
                case 11:
                    D7_Rectangle.setVisible(true);
                    break;
                case 12:
                    E7_Rectangle.setVisible(true);
                    break;
                case 13:
                    F7_Rectangle.setVisible(true);
                    break;
                case 14:
                    G7_Rectangle.setVisible(true);
                    break;
                case 15:
                    H7_Rectangle.setVisible(true);
                    break;
                case 16:
                    A6_Rectangle.setVisible(true);
                    break;
                case 17:
                    B6_Rectangle.setVisible(true);
                    break;
                case 18:
                    C6_Rectangle.setVisible(true);
                    break;
                case 19:
                    D6_Rectangle.setVisible(true);
                    break;
                case 20:
                    E6_Rectangle.setVisible(true);
                    break;
                case 21:
                    F6_Rectangle.setVisible(true);
                    break;
                case 22:
                    G6_Rectangle.setVisible(true);
                    break;
                case 23:
                    H6_Rectangle.setVisible(true);
                    break;
                case 24:
                    A5_Rectangle.setVisible(true);
                    break;
                case 25:
                    B5_Rectangle.setVisible(true);
                    break;
                case 26:
                    C5_Rectangle.setVisible(true);
                    break;
                case 27:
                    D5_Rectangle.setVisible(true);
                    break;
                case 28:
                    E5_Rectangle.setVisible(true);
                    break;
                case 29:
                    F5_Rectangle.setVisible(true);
                    break;
                case 30:
                    G5_Rectangle.setVisible(true);
                    break;
                case 31:
                    H5_Rectangle.setVisible(true);
                    break;
                case 32:
                    A4_Rectangle.setVisible(true);
                    break;
                case 33:
                    B4_Rectangle.setVisible(true);
                    break;
                case 34:
                    C4_Rectangle.setVisible(true);
                    break;
                case 35:
                    D4_Rectangle.setVisible(true);
                    break;
                case 36:
                    E4_Rectangle.setVisible(true);
                    break;
                case 37:
                    F4_Rectangle.setVisible(true);
                    break;
                case 38:
                    G4_Rectangle.setVisible(true);
                    break;
                case 39:
                    H4_Rectangle.setVisible(true);
                    break;
                case 40:
                    A3_Rectangle.setVisible(true);
                    break;
                case 41:
                    B3_Rectangle.setVisible(true);
                    break;
                case 42:
                    C3_Rectangle.setVisible(true);
                    break;
                case 43:
                    D3_Rectangle.setVisible(true);
                    break;
                case 44:
                    E3_Rectangle.setVisible(true);
                    break;
                case 45:
                    F3_Rectangle.setVisible(true);
                    break;
                case 46:
                    G3_Rectangle.setVisible(true);
                    break;
                case 47:
                    H3_Rectangle.setVisible(true);
                    break;
                case 48:
                    A2_Rectangle.setVisible(true);
                    break;
                case 49:
                    B2_Rectangle.setVisible(true);
                    break;
                case 50:
                    C2_Rectangle.setVisible(true);
                    break;
                case 51:
                    D2_Rectangle.setVisible(true);
                    break;
                case 52:
                    E2_Rectangle.setVisible(true);
                    break;
                case 53:
                    F2_Rectangle.setVisible(true);
                    break;
                case 54:
                    G2_Rectangle.setVisible(true);
                    break;
                case 55:
                    H2_Rectangle.setVisible(true);
                    break;
                case 56:
                    A1_Rectangle.setVisible(true);
                    break;
                case 57:
                    B1_Rectangle.setVisible(true);
                    break;
                case 58:
                    C1_Rectangle.setVisible(true);
                    break;
                case 59:
                    D1_Rectangle.setVisible(true);
                    break;
                case 60:
                    E1_Rectangle.setVisible(true);
                    break;
                case 61:
                    F1_Rectangle.setVisible(true);
                    break;
                case 62:
                    G1_Rectangle.setVisible(true);
                    break;
                case 63:
                    H1_Rectangle.setVisible(true);
                    break;
                default:
                    break;
            }
        } else {
            switch (squareToWipe) {
                case 0:
                    A8_Rectangle.setVisible(false);
                    break;
                case 1:
                    B8_Rectangle.setVisible(false);
                    break;
                case 2:
                    C8_Rectangle.setVisible(false);
                    break;
                case 3:
                    D8_Rectangle.setVisible(false);
                    break;
                case 4:
                    E8_Rectangle.setVisible(false);
                    break;
                case 5:
                    F8_Rectangle.setVisible(false);
                    break;
                case 6:
                    G8_Rectangle.setVisible(false);
                    break;
                case 7:
                    H8_Rectangle.setVisible(false);
                    break;
                case 8:
                    A7_Rectangle.setVisible(false);
                    break;
                case 9:
                    B7_Rectangle.setVisible(false);
                    break;
                case 10:
                    C7_Rectangle.setVisible(false);
                    break;
                case 11:
                    D7_Rectangle.setVisible(false);
                    break;
                case 12:
                    E7_Rectangle.setVisible(false);
                    break;
                case 13:
                    F7_Rectangle.setVisible(false);
                    break;
                case 14:
                    G7_Rectangle.setVisible(false);
                    break;
                case 15:
                    H7_Rectangle.setVisible(false);
                    break;
                case 16:
                    A6_Rectangle.setVisible(false);
                    break;
                case 17:
                    B6_Rectangle.setVisible(false);
                    break;
                case 18:
                    C6_Rectangle.setVisible(false);
                    break;
                case 19:
                    D6_Rectangle.setVisible(false);
                    break;
                case 20:
                    E6_Rectangle.setVisible(false);
                    break;
                case 21:
                    F6_Rectangle.setVisible(false);
                    break;
                case 22:
                    G6_Rectangle.setVisible(false);
                    break;
                case 23:
                    H6_Rectangle.setVisible(false);
                    break;
                case 24:
                    A5_Rectangle.setVisible(false);
                    break;
                case 25:
                    B5_Rectangle.setVisible(false);
                    break;
                case 26:
                    C5_Rectangle.setVisible(false);
                    break;
                case 27:
                    D5_Rectangle.setVisible(false);
                    break;
                case 28:
                    E5_Rectangle.setVisible(false);
                    break;
                case 29:
                    F5_Rectangle.setVisible(false);
                    break;
                case 30:
                    G5_Rectangle.setVisible(false);
                    break;
                case 31:
                    H5_Rectangle.setVisible(false);
                    break;
                case 32:
                    A4_Rectangle.setVisible(false);
                    break;
                case 33:
                    B4_Rectangle.setVisible(false);
                    break;
                case 34:
                    C4_Rectangle.setVisible(false);
                    break;
                case 35:
                    D4_Rectangle.setVisible(false);
                    break;
                case 36:
                    E4_Rectangle.setVisible(false);
                    break;
                case 37:
                    F4_Rectangle.setVisible(false);
                    break;
                case 38:
                    G4_Rectangle.setVisible(false);
                    break;
                case 39:
                    H4_Rectangle.setVisible(false);
                    break;
                case 40:
                    A3_Rectangle.setVisible(false);
                    break;
                case 41:
                    B3_Rectangle.setVisible(false);
                    break;
                case 42:
                    C3_Rectangle.setVisible(false);
                    break;
                case 43:
                    D3_Rectangle.setVisible(false);
                    break;
                case 44:
                    E3_Rectangle.setVisible(false);
                    break;
                case 45:
                    F3_Rectangle.setVisible(false);
                    break;
                case 46:
                    G3_Rectangle.setVisible(false);
                    break;
                case 47:
                    H3_Rectangle.setVisible(false);
                    break;
                case 48:
                    A2_Rectangle.setVisible(false);
                    break;
                case 49:
                    B2_Rectangle.setVisible(false);
                    break;
                case 50:
                    C2_Rectangle.setVisible(false);
                    break;
                case 51:
                    D2_Rectangle.setVisible(false);
                    break;
                case 52:
                    E2_Rectangle.setVisible(false);
                    break;
                case 53:
                    F2_Rectangle.setVisible(false);
                    break;
                case 54:
                    G2_Rectangle.setVisible(false);
                    break;
                case 55:
                    H2_Rectangle.setVisible(false);
                    break;
                case 56:
                    A1_Rectangle.setVisible(false);
                    break;
                case 57:
                    B1_Rectangle.setVisible(false);
                    break;
                case 58:
                    C1_Rectangle.setVisible(false);
                    break;
                case 59:
                    D1_Rectangle.setVisible(false);
                    break;
                case 60:
                    E1_Rectangle.setVisible(false);
                    break;
                case 61:
                    F1_Rectangle.setVisible(false);
                    break;
                case 62:
                    G1_Rectangle.setVisible(false);
                    break;
                case 63:
                    H1_Rectangle.setVisible(false);
                    break;
                default:
                    break;
            }
        }
    }
    /**
     * resets square ane image
     */
    static public void resetSquareAndImageVar()
    {
        squareMovedTo = -1;
        imageToUpdateSquareMovedTo = -1;
        specialSquareToWipe = -1;
        specialSquareMovedTo = -1;
        imageToUpdateSpecialSquareMovedTo = -1;
    }
    
    /**
     * 
     * @return squareClicked
     */
    static public int getSquareClicked()
    {
        return squareClicked;
    }
    
    //This method is only used in class Board's updateGameStatus method.
    static public void setSquareClicked(int fSquareClicked)
    {
        squareClicked = fSquareClicked;
    }
    
    /**
     * 
     * @param fSquare sets square to wipe
     */
    static public void setSquareToWipe(int fSquare)
    {
        squareToWipe = fSquare;
    }
    
    /**
     * 
     * @param fSquare  sets square to move to
     */
    static public void setSquareMovedTo(int fSquare)
    {
        squareMovedTo = fSquare;
    }
     
    /**
     * 
     * @param fImage  sets image to update square moved to
     */
    static public void setImageToUpdateSquareMovedTo(int fImage)
    {
        imageToUpdateSquareMovedTo = fImage;
    }
    
    /**
     * 
     * @param fSquare sets special square to wipe
     */
    static public void setSpecialSquareToWipe(int fSquare)
    {
        specialSquareToWipe = fSquare;
    }

    /**
     * 
     * @param fSquare sets special square to move to
     */
    static public void setSpecialSquareMovedTo(int fSquare)
    {
        specialSquareMovedTo = fSquare;
    }
    
    /**
     * 
     * @param fImage sets Image to update special square moved to
     */
    static public void setImageToUpdateSpecialSquareMovedTo(int fImage)
    {
        imageToUpdateSpecialSquareMovedTo = fImage;
    }
    
    /**
     * 
     * @param fHighlight boolean sets highlight of square clicked on or off 
     */    
    static public void setHighlightSquareClicked(boolean fHighlight)
    {
        highlightSquareClicked = fHighlight;
    }
    
//    /**
//     *  initialize implemented in FXML Control Document
//     */
//    @FXML void initialize() {
//        
//        
//    }
}
