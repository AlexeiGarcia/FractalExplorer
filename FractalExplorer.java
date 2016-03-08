import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;

/*This Class is the main class that generates the Frame and fractal when it is called by the user.
 * The application itself is a Fractal Explorer, where the user is prompted to enter two double numbers
 * which the application uses to create a colorful fractal image. The user can then navigate through the 
 * application and save images or screenshots of the fractal.
 */
public class FractalExplorer extends JFrame{
  
  //Sets Frame Dimensions
  public static final int FRAME_WIDTH = 600;
  public static final int FRAME_HEIGHT = 600;
  
  //For Calculations
  public static final int ITERATIONS = 200;
  
  //For navigating through fractal
  static final double ZOOM = 100.00;
  
  //Finds position within fractal image
  static final double TOP_LEFT_X = -3.0;
  static final double TOP_LEFT_Y = +3.0;
  
  double zoomIncrement = ZOOM;
  double topLeftX = TOP_LEFT_X;
  double topLeftY = TOP_LEFT_Y;
  
  /*Constructor adds the properties of the viewing frame, adds the frame from the frame subclass, 
   * listens for frame adjustments based on user input, and updates the image
   */
  public FractalExplorer() {
    setFrameProperties();
    addFrame();
    frame.addKeyStrokeMov();
    update();
  }
  
  //Adds the frame and sets some GUI foundation
  private void addFrame() {
    Frame frame = new Frame();
    fractalImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    frame.setVisible(true);
    this.add(frame, BorderLayout.CENTER);
  }
  
  //Sets frame properties such as title, dimensions, resizability, closing, and 
  private void setFrameProperties() {
    this.setTitle("FractalExplorer");
    this.setSize(WIDTH, HEIGHT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Doesn't allow user to resize frame, this makes it easier for the computer to handle calculations
    this.setResizable(false);
    //The window is placed in the center of the screen
    this.setLocationRelativeTo(null);
  }
  
  //Get X position
  private double getXPos(double x) {
    return x/zoomIncrement + topLeftX;
  }
  
  //Get Y postition
  private double getYPos(double y) {
    return y/zoomIncrement + topLeftY;
  }
  
  //Updates frame and image 
  public void update() {}
  
  //Generates colors that correspond to areas of Fractal
  private int generateColor(int iterationCount) {}
  
  //Calculations for generating fractal (complicated)
  private int computeValues(double c, double n) {}
  
  //Moves frame up by approximately 1/6 of current height
  private void moveUp() {
    double currentHeight = HEIGHT / zoomIncrement;
    topLeftY += currentHeight / 6;
    update();
  }
  //Moves frame down by approximately 1/6 of current height
  private void moveDown() {
    double currentHeight = HEIGHT / zoomIncrement;
    topLeftY -= currentHeight / 6;
    update();
  }
  //Moves frame left by approximately 1/6 of current width
  private void moveLeft() {
    double currentWidth = WIDTH / zoomIncrement;
    topLeftX -= currentWidth / 6;
    update();
  }
  //Moves frame right by approximately 1/6 of current width
  private void moveRight() {
    double currentWidth = WIDTH / zoomIncrement;
    topLeftY += currentWidth / 6;
    update();
  }
  
  //Resets and updates zoomIncrement or zoomFactor after zooming and moving through application
  private void adjustZoom(double tempX, double tempY, double tempZoomIncrement) {}
}
