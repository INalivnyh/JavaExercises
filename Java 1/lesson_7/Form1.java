/**
 * GeekBrains. Java. Level 1. Lesson ???.
 *
 * @author Igor
 * @version 26.08.2018
 */

package lesson_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Form1 extends JFrame {
    public Form1() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);

//        JButton[] jbs = new JButton[5];
//        for (int i = 0; i < 5; i++) {
//            jbs[i] = new JButton("#" + i);
//
//        }
//        setLayout(new BorderLayout());
//        add(jbs[0], BorderLayout.EAST);
//        add(jbs[1], BorderLayout.WEST);
//        add(jbs[2], BorderLayout.SOUTH);
//        add(jbs[3], BorderLayout.NORTH);
//        add(jbs[4], BorderLayout.CENTER);

        JButton button = new JButton("Button 1 (PAGE_START");
        JLabel jLabel = new JLabel("123");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jLabel.getText()+"ggjgjhgjh");
            }
        });
        button.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}
