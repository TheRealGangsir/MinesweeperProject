package pack1;

import javax.swing.*;
import java.awt.*;

/**
 * @author othscs120
 *         Created on: 11/4/2014 , Time is :  1:28 PM
 *         Part of Project: MineSweeper
 */

public class MS_Frame extends JFrame {

    public MS_Frame(int rows, int cols, int mines) {
<<<<<<< HEAD

        super("MineSweeper");


        // Sets the close button to exit the program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // makes the window not able to be resized
        setResizable(false);
        // creates the window
        pack();
        // creates the panel
        MS_Panel p = new MS_Panel(rows, cols, mines);
        // gets the frames insets
        Insets frameInsets = getInsets();
        // calculates panel size
        int frameWidth = p.getWidth()
                + (frameInsets.left + frameInsets.right);
        int frameHeight = p.getHeight()
                + (frameInsets.top + frameInsets.bottom);
        // sets the frame's size
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        // turns off the layout options
        setLayout(null);
        // adds the panel to the frame
        add(p);
        // adjusts the window to meet its new preferred size
        pack();
        // shows the frame
        setVisible(true);
=======
        //todo adjust size
        super("MineSweeper");
        new MS_Panel(rows, cols, mines);

        pack();
        setPreferredSize(new Dimension(cols * 16, (rows * 16) + 150)); //sets a size appropriate to the board size
        Logger.logOtherMessage("Window", "Window size is: " + cols * 16 + "," + rows * 16);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setFocusable(true);
        pack();
        setVisible(true);
        Logger.logOtherMessage("Window", "Window Created.");

>>>>>>> b2d33d5fc9757c4cf108a8d01fdf70114f58d8de

    }


}
