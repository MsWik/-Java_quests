package by.peleng.java.server;

import by.peleng.java.DOOM.DOOMRemuv;
import by.peleng.java.DOOM.DOOMUpdate;
import by.peleng.java.DOOM.DOOMaddNew;
import by.peleng.java.DOOM.DOOMparser;
import by.peleng.java.entity.StrudentCreator;
import by.peleng.java.entity.Student;

import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * проект реализует консольный многопользовательский чат.
 * вход в программу запуска сервера - в классе Server.

 */

class ServerSomthing extends Thread {
    DOOMparser dooMparser = new DOOMparser();

    private Socket socket; // сокет, через который сервер общается с клиентом,
    // кроме него - клиент и сервер никак не связаны
    private BufferedReader in; // поток чтения из сокета
    private BufferedWriter out; // поток завписи в сокет

    /**
     * для общения с клиентом необходим сокет (адресные данные)
     * @param socket
     * @throws IOException
     */

    public ServerSomthing(Socket socket) throws IOException {
        this.socket = socket;
        // если потоку ввода/вывода приведут к генерированию искдючения, оно проброситься дальше
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Server.story.printStory(out); // поток вывода передаётся для передачи истории последних 10
        // сооюбщений новому поключению
        start(); // вызываем run()
    }
    @Override
    public void run() {
        String word;
        try {
            // первое сообщение отправленное сюда - это никнейм

            try {
                word = in.readLine();
                out.write(word + "\n");


                out.flush(); // flush() нужен для выталкивания оставшихся данных
                // если такие есть, и очистки потока для дьнейших нужд
            } catch (IOException ignored) {}
            try {
                while (true) {
                    word = in.readLine();


                    if ("$A".equals(word)){
                        word+="\n"+dooMparser.domParser();
                    }


                   if ("$C".equals(word)){

                        word = in.readLine();
                        StrudentCreator strudentCreator = new StrudentCreator();
                        DOOMUpdate doomUpdate = new DOOMUpdate();
                        //     System.out.println(word);
                        doomUpdate.dOOMUpdate(strudentCreator.createStudent(word));

                    }
                    if ("$B".equals(word)){
                        word = in.readLine();
                        System.out.println(word);
                        DOOMRemuv doomRemuv = new DOOMRemuv();
                        doomRemuv.domRemuv(word);



                    }
                    if ("$D".equals(word)){

                        word = in.readLine();
                        StrudentCreator strudentCreator = new StrudentCreator();
                        DOOMaddNew dooMaddNew = new DOOMaddNew();
                        //     System.out.println(word);
                        dooMaddNew.dOOMUpdate(strudentCreator.createStudent(word));

                    }


                    if(word.equals("stop")) {
                        this.downService(); // харакири
                        break; // если пришла пустая строка - выходим из цикла прослушки
                    }
                    System.out.println("Сообщение: " + word);



                    Server.story.addStoryEl(word);
                    for (ServerSomthing vr : Server.serverList) {
                       vr.send(word); // отослать принятое сообщение с привязанного клиента всем остальным влючая его
                    }
                }
            } catch (NullPointerException ignored) {}


        } catch (IOException e) {
            this.downService();
        }
   /*     try {
            in.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    /**
     * отсылка одного сообщения клиенту по указанному потоку
     * @param msg
     */
    private void send(String msg) {
        try {
            out.write(msg + "\n");
            out.flush();
        } catch (IOException ignored) {}

    }

    /**
     * закрытие сервера
     * прерывание себя как нити и удаление из списка нитей
     */
    private void downService() {
        try {
            if(!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
                for (ServerSomthing vr : Server.serverList) {
                    if(vr.equals(this)) vr.interrupt();
                    Server.serverList.remove(this);
                }
            }
        } catch (IOException ignored) {}
    }
}

/**
 * класс хранящий в ссылочном приватном
 * списке информацию о последних 10 (или меньше) сообщениях
 */

class Story {

    private LinkedList<String> story = new LinkedList<>();

    /**
     * добавить новый элемент в список
     * @param el
     */

    public void addStoryEl(String el) {
        // если сообщений больше 10, удаляем первое и добавляем новое
        // иначе просто добавить
        if (story.size() >= 10) {
            story.removeFirst();
            story.add(el);
        } else {
            story.add(el);
        }
    }

    /**
     * отсылаем последовательно каждое сообщение из списка
     * в поток вывода данному клиенту (новому подключению)
     * @param writer
     */

    public void printStory(BufferedWriter writer) {
        if(story.size() > 0) {
            try {
                writer.write("History messages" + "\n");
                for (String vr : story) {
                    writer.write(vr + "\n");
                }
                writer.write("/...." + "\n");
                writer.flush();
            } catch (IOException ignored) {}

        }

    }
}

public class Server {

    public static final int PORT = 8080;
    public static LinkedList<ServerSomthing> serverList = new LinkedList<>(); // список всех нитей - экземпляров
    // сервера, слушающих каждый своего клиента
    public static Story story; // история переписки

    /**
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(PORT);
        story = new Story();
        System.out.println("Server Started");
        try {
            while (true) {
                // Блокируется до возникновения нового соединения:
                Socket socket = server.accept();
                try {
                    serverList.add(new ServerSomthing(socket)); // добавить новое соединенние в список
                } catch (IOException e) {
                    // Если завершится неудачей, закрывается сокет,
                    // в противном случае, нить закроет его:
                    socket.close();
                }
            }
        } finally {
            server.close();
        }
    }
}
