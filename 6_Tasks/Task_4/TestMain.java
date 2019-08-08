//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Sorry that the "Paste" feature no longer works! GitHub broke it.
//*******************************************************************
//Попробуйте решить данную задачу хотя бы на 50%.
//Задание 4. Многопоточность. Порт . Корабли заходят в порт для
//разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
//в порту и на корабле, должно быть неотрицательным и превышающим заданную
//грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
//У одного причала может стоять один корабль. Корабль может загружаться у причала
//или разгружаться.*//
package by.peleng.java.task4


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Ship {
    Random random = new Random();
    int capacity;
    boolean bool = false;
    int pirs;


    public int getPirs() {
        return pirs;
    }

    public void setPirs(int pirs) {
        this.pirs = pirs;
    }

    public Ship() {
        this.bool = random.nextBoolean();
        capacity = random.nextInt(10);

    }
}


class Port {
    static int capacityPort = 100;
    static int docks = 5;

    List<Integer> pirsis = new ArrayList<Integer>();
    List<Integer> list = new ArrayList<Integer>();

    {
        list.add(Integer.valueOf(0));
        pirsis.add(Integer.valueOf(0));
    }

}

class MyThread implements Runnable {
    Thread thrd;
    static int current = 0;

    Port port = new Port();
    static int docksIs = 1;


    // Construct a new thread.
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread.
    synchronized public void run() {


        System.out.println(thrd.getName() + " плывет к порту.");
        try {
            for (int count = 0; count < 100; count++) {
                Ship ship = new Ship();
                while ((this.docksIs >= this.port.docks || current >= this.port.capacityPort)) {
                    System.out.println(thrd.getName() +
                            " вошел в порт и  жидает очередь  ");
                    if (ship.bool){System.out.print("Трюм полон"+"\n");} else {System.out.print("Трюм пуст" + "\n");}
                    Thread.sleep(40 + (int) (Math.random() * ((40 - 20) + 1)));
                }
                Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                if (this.docksIs < (this.port.docks) && current < this.port.capacityPort && ship.bool) {
                    System.out.println(thrd.getName() +
                            " вошел в порт и стал на разгрузку у причала " + " # " + (this.docksIs));

                    int doks = this.docksIs;
                    this.docksIs++;
                    current += ship.capacity;
                    //              this.port.current+=ship.capacity;
                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                    System.out.println(thrd.getName() +
                            " ,закончил разгрузку" + " у причала № " + (doks) +

                            " В порту " + current + " контейнеров ");
                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                    System.out.println(thrd.getName() + " вышел из порта");
                  //  ship.bool = false;
                 //   ship.capacity = 0;
                    this.docksIs--;
                }
                while ((this.docksIs >= this.port.docks || current >= this.port.capacityPort)) {
                    System.out.println(thrd.getName() +
                            " вошел в порт и  жидает очередь ");
                    if (ship.bool){System.out.print("Трюм полон"+"\n");} else {System.out.print("Трюм пуст"+"\n");}
                    Thread.sleep(40 + (int) (Math.random() * ((40 - 20) + 1)));
                }
                if (this.docksIs < port.docks && current > 10 && !ship.bool) {
                    System.out.println(thrd.getName() +
                            " вошел в порт и стал на пагрузку у причала " + " #" + (this.docksIs));

                    int dooks = this.docksIs;
                    this.docksIs++;
                    current -= ship.capacity;
                    //           this.port.current-=10;
                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                    System.out.println(thrd.getName() +
                            ",закончил пазгрузку" + "# " + (dooks)+
                    "  В порту " + current + " контейнеров ");
                    Thread.sleep(20 + (int) (Math.random() * ((40 - 20) + 1)));
                    System.out.println(thrd.getName() + " вышел из порта");
                   // ship.bool = true;
                    //ship.capacity = 10;
                   this.docksIs--;
                }

                // System.out.println("In " + thrd.getName() +
                //                  ", count is " + count+ "  ");
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " ошибка запуска.");
        }
        //System.out.println(thrd.getName() + " окончание работы.");
    }
}

public class TestMain {
    public static void main(String args[]) {
        System.out.println("Старт");
        MyThread mt1 = MyThread.createAndStart("Корабль 1");
        MyThread mt2 = MyThread.createAndStart("Корабль 2");
        MyThread mt3 = MyThread.createAndStart("Корабль 3");


        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        //       System.out.println("Main thread ending.");
    }
}
