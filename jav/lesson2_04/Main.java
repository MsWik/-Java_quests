package by.peleng.jav.lesson2_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*4 Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/
public class Main {


    public static void main(String[] args) throws IOException {
        AllСustomers allСustomers = new AllСustomers();
        String str="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("1)Создать счета");
            System.out.println("2)Вывести на консоль все счета клиентов");
            System.out.println("3)Заблокировать счет №");
            System.out.println("4)Разблокировать счет №");
            System.out.println("5)Вывести общую сумму по счетам клиента");
            System.out.println("6)Отсортировать счета клиента по сумме");
            System.out.println("7)Отсортировать счита клиента по блокировке");

            System.out.println("-------------");


            int keys = Integer.parseInt(reader.readLine());


            switch (keys) {
                case (1):

                    allСustomers.genereteCustomers();







                    break;
                case (2):
                    System.out.println("--------------");
                    for (int i=0;i<allСustomers.getCustomers().length ;i++){
                        allСustomers.getCustomers()[i].toStrings();


                    }
                    System.out.println("--------------");

                    break;

                case (3):


                    System.out.println("--------------");
                    System.out.println("Введите номер счета");
                    long account =Long.parseLong(reader.readLine());
                            System.out.println("--------------");
                    for (int i=0;i<allСustomers.getCustomers().length ;i++){
                    allСustomers.getCustomers()[i].block(account);
                    System.out.println("--------------");
                    }

                    break;
                case (4):
                    System.out.println("--------------");
                    System.out.println("Введите номер счета");
                    long accounts =Long.parseLong(reader.readLine());
                    System.out.println("--------------");
                    for (int i=0;i<allСustomers.getCustomers().length ;i++){
                        allСustomers.getCustomers()[i].unBlock(accounts);
                        System.out.println("--------------");
                    }



                    break;

                case (5):
                    System.out.println("--------------");

                    System.out.println("--------------");
                    for (int i=0;i<allСustomers.getCustomers().length ;i++){
                        System.out.println("Общая сумма для клиента" + allСustomers.getCustomers()[i].getName() );
                        allСustomers.getCustomers()[i].howMuchMoney();
                        System.out.println("--------------");
                        allСustomers.getCustomers()[i].howMuchMoney();
                    }

                    break;
                case (6):
                    System.out.println("--------------");

                    System.out.println("--------------");
                    for (int i=0;i<allСustomers.getCustomers().length ;i++){

                        allСustomers.getCustomers()[i].sortForMoney();
                        allСustomers.getCustomers()[i].toStrings();
                    }

                    break;
                case (7):
                    System.out.println("--------------");

                    System.out.println("--------------");
                    for (int i=0;i<allСustomers.getCustomers().length ;i++){

                        allСustomers.getCustomers()[i].sortForLock();
                        allСustomers.getCustomers()[i].toStrings();
                    }

                    break;

                default:
                    System.out.println("Не верный выбор. ");

                    break;

            }

            System.out.print("Закончить  Y/N: ");
            str = reader.readLine();
        } while (!str.equals("Y"));

    }
}
