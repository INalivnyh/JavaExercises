package simplegui1.ch12_gui_intro;

import javax.swing.*;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 04.10.2018
 */

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //создали фрейм

        JButton button = new JButton("click me"); //создали кнопку

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button); //добавляем кнопку на панель фрейма

        frame.setSize(300,300); //присваиваем фрейму размер в пикселях
        frame.setVisible(true); //делаем фрейм видимыме
    }
}
