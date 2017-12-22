package lesson9.oneServer_oneClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 6666; // случайный порт (может быть любое число от 1025 до 65535)
        try {
            ServerSocket ss = new ServerSocket(port); // создаем сокет сервера и привязываем его к вышеуказанному порту
            System.out.println("Waiting for a client...");
            Socket socket = ss.accept();// заставляем сервер ждать подключений и выводим сообщение когда кто-то связался с сервером
            System.out.println("Got a client :) ... Waiting for password");
            System.out.println();

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            String password = "12345";
            String line = null;
            line = in.readUTF();
            if (line.equals(password)) {
                System.out.println("Password is correct");
                while (true) {
                    System.out.println("Waiting for the next line...");
                    line = in.readUTF(); // ожидаем пока клиент пришлет строку текста.
                    System.out.println("From Client: "+line);
                    Scanner toClient = new Scanner(System.in);
                    out.writeUTF(toClient.nextLine()); // отсылаем клиенту обратно ту самую строку текста.
                    out.flush(); // заставляем поток закончить передачу данных.
                    System.out.println();
                }
            } else {
                socket.close();
                System.out.println("Socket is closed");
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
