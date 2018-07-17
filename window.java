
package javaGame;

import javax.swing.*; 
import java.awt.*; 

public class window {
    public static void start(){
      JFrame frame = new JFrame();
      frame.setSize( new Dimension (500, 400));
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}
