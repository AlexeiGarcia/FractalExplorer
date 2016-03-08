import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;

//Frame object that inherits from JPanel but is used as a seperate class/object  by FractalExplorer
private class Frame extends JPanel implements MouseListener {
  
  /*Variables same as FractalExplorer, can't inherit from FractalExplorer because it needs to inherit
   * from JPanel.  Trying to fix this problem...
   */
  
  //Sets Frame Dimensions
  public static final int FRAME_WIDTH = 600;
  public static final int FRAME_HEIGHT = 600;
  
  //For navigating through fractal (default)
  static final double ZOOM = 100.00;
  
  //Finds position within fractal image (default)
  static final double TOP_LEFT_X = -3.0;
  static final double TOP_LEFT_Y = +3.0;
  
  //Zoom and position that are open to change as user explores fractal
  double zoomIncrement = ZOOM;
  double topLeftX = TOP_LEFT_X;
  double topLeftY = TOP_LEFT_Y;
  
  //Constructor adds MouseListener for user input for exploration
  public Frame() {
    addMouseListener(this);
  }
  
  public Dimension getSize() {}
  public void paintComponent() {}
  public void mousePressed() {}
  public void addKeyStrokeMov() {}
}