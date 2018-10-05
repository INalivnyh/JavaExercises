package lesson_4;

/**
 * GeekBrains. Java. Level 2. Lesson 4. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 05.10.2018
 */


/*
 * 1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
 * Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
 * Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
 * При «отсылке» сообщение перекидывается из нижнего поля в центральное.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class HW4Lesson {
    JTextArea incoming;
    JTextField outgoing;

    public static void main(String[] args) {
        HW4Lesson chat = new HW4Lesson();
        chat.go();
    }

    public void go() {
        JFrame frame = new JFrame("Chat Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(25, 40);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(33);
        outgoing.addActionListener(new SendButtonListener());
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setBounds(200, 200, 475, 484);
        frame.setVisible(true);
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            if (!outgoing.getText().trim().isEmpty()) {
                incoming.append(outgoing.getText() + "\n");
                try {
                    PrintWriter pw = new PrintWriter(new FileWriter("chat.txt", true));
                    pw.write(outgoing.getText() + "\n");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            outgoing.setText("");
        }
    }
}

