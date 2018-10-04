package SimpleGui1;

import javax.swing.*;
import java.awt.*;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 04.10.2018
 */

public class MyDrawPanel extends JPanel {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    MyDrawPanel panel = new MyDrawPanel();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(panel);
    frame.setSize(300,300);
    frame.setVisible(true);
}

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(100,50,100,100);
    }


}
