package lesson_6;

/**
 * GeekBrains. Java. Level 2. Lesson 6. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 014.10.2018
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        new Server();
    }

    public final static int PORT = 5223;

    public Server() {

        try {
            ServerSocket server = new ServerSocket(PORT);
            Socket socket = server.accept();
            System.out.println("Клиент подключился");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader massege = new BufferedReader(new InputStreamReader(System.in));

            //поток для получения сообщений
            Thread receiveMassages = new Thread(() -> {
                try {
                    while (true) {
                        String str = in.readUTF();
                        String[] test = str.split(" ");
                        String end = test[2];
                        boolean isEND = end.equals("END");

                        if (isEND) {
                            out.writeUTF("Завершение работы сервера");
                            break;
                        }
                        System.out.println(str);

                    }

                } catch (IOException e) {
                    e.printStackTrace();

                } finally {
                    try {
                        in.close();
                        out.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receiveMassages.start();

            //поток для отправки сообщений
            Thread sendMassegesThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String answer = massege.readLine();
                            out.writeUTF("Сервер написал" + ": " + answer.trim());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            sendMassegesThread.setDaemon(true);
            sendMassegesThread.start();

            try {
                receiveMassages.join();
            } catch (InterruptedException e) {
                System.out.println("Прерывание потока пошло не по плану");
            }


            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

