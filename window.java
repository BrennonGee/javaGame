
package javaGame;

import javax.swing.*; 
import java.awt.*; 

public class window {
    public static void start(){
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        frame.getContentPane().add(panel);
        frame.setSize( new Dimension (500, 400));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
