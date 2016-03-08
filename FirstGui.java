import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstGui extends JFrame {
  private JButton button;
  private JLabel label;
  
  private static final int FRAME_WIDHT = 600;
  private static final int FRAME_HEIGHT = 100;
  
  public FirstGui() {
    createComponents();
    setSize(FRAME_WIDHT, FRAME_HEIGHT);
  }
  
  private void createComponents() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    
    
    panel.add(component, BorderLayout.NORTH);
    panel.setLayout(new GridLayout());
    button = new JButton("Start");
//    label = new JLabel("Enter
  }
  
}