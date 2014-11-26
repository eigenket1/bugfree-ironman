package lab;

//*********************************************************************
//ReboundPanel.java Author: Lewis/Loftus
//
//Represents the primary panel for the Rebound program.
//*********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
public class ReboundPanel extends JPanel
{
    /**
     * 
     */
    private static final long serialVersionUID = -5086143177106246838L;
    private final int WIDTH = 300, HEIGHT = 100;
    private final int DELAY = 20, IMAGE_SIZE = 35;
    private ImageIcon image, image2;
    private Timer timer;
    private int x, y, moveX, moveY, move1X, move1Y, x1, y1;
    //------------------------------------------------------------------
    //Sets up the panel, including the timer for the animation.
    //------------------------------------------------------------------
    public ReboundPanel()
    {
        timer = new Timer(DELAY, new ReboundListener());
        image = new ImageIcon ("src/face.gif");
        image2 = new ImageIcon ("src/face.gif");
        x = 0;
        y = 40;
        x1 = 0;
        y1 = 40;        
        moveX = moveY = 3;
        move1X = 5;
        move1Y = 8;       
        setPreferredSize (new Dimension(WIDTH, HEIGHT));
        setBackground (Color.black);
        timer.start();
    }
    //-----------------------------------------------------------------
    //Draws the image in the current location.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        image.paintIcon (this, page, x, y);
        image2.paintIcon (this, page, x1, y1);
    }
    //******************************************************************
    //Represents the action listener for the timer.
    //******************************************************************
    private class ReboundListener implements ActionListener
    {
        //--------------------------------------------------------------
        //Updates the position of the image and possibly the direction
        //of movement whenever the timer fires an action event.
        //--------------------------------------------------------------
        public void actionPerformed (ActionEvent event)
        {
            x += moveX;
            y += moveY;
            if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
                moveX = moveX * -1;
            if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
                moveY = moveY * -1;
            x1 += move1X;
            y1 += move1Y;
            if (x1 <= 0 || x1 >= WIDTH-IMAGE_SIZE)
                move1X = move1X * -1;
            if (y1 <= 0 || y1 >= HEIGHT-IMAGE_SIZE)
                move1Y = move1Y * -1;            
            repaint();
        }
    }
}