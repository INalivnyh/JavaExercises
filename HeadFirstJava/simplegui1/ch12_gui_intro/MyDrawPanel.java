package simplegui1.ch12_gui_intro;

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
    frame.setSize(400,400);
    frame.setVisible(true);
}

//    public void paintComponent(Graphics g) {
//        g.setColor(Color.orange);
//        g.fillRect(100,50,100,100);
//    }

//    public void paintComponent(Graphics g){
//        Image image = new ImageIcon("java_logo.png").getImage();
//        g.drawImage(image,3,4,this);
//    }

    public void paintComponent(Graphics g){
        Image image = new ImageIcon("java_logo.png").getImage();
        g.drawImage(image,3,4,this);
    }

}
