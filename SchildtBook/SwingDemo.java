import javax.swing.*;

/**
 * @author Igor Nalivnyh
 * @version 03.10.2018
 */


public class SwingDemo {
    SwingDemo(){
        //создать пустой контейнер типа JFrame
        JFrame jfrm = new JFrame("a simple Swing Application");
        //простое Swing - приложение

        //задать исходные размеры фрейма
        jfrm.setSize(275, 100);

        //завершить работу если пользователь закроет приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создать метку с текстом сообщения
        JLabel jlab = new JLabel("Swing means powerful GUIs.");
        //Swing - это мощные ГПИ

        //ввести метку на панели содержимого
        jfrm.add(jlab);

        //отобразить фрейм
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        //создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }



}
