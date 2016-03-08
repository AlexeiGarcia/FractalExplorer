import javax.swing.JFrame;
import java.awt.FlowLayout;

public class GuiViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new FakeGui();
      frame.setLayout(new FlowLayout());
      frame.setTitle("Fractal Explorer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
