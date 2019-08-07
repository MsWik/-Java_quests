package by.peleng.jav.lesson8;
/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер n  кредитной карточки находится в заданном интервале*/


import java.util.Scanner;

public class ACustomers {
    Customer[] customers;

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void toStrings() {
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].toString());
        }


    }

    public void GenereteCistomers() {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        Scanner names = new Scanner(System.in);
        Scanner srnames = new Scanner(System.in);
        Scanner srnamess = new Scanner(System.in);
        Scanner addres = new Scanner(System.in);
        System.out.println("Генерация покупателей");
        System.out.println("-----------");
        System.out.println("Введите число покупателей");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();
        customers = new Customer[size];
        String name;
        for (int i = 0; i < size; i++) {

            System.out.println("Введите id\n");

            int id = in.nextInt();
            System.out.println("Введите Имя\n");
            name = names.nextLine();


            System.out.println("Введите Фамилию\n");

            String srname = srnames.nextLine();

            System.out.println("Введите Отчеттво\n");
            String patronymic = srnamess.nextLine();
            System.out.println("Введите Адрес\n");
            String address = addres.nextLine();
            System.out.println("Введите номер карты (long)\n");
            long card = in.nextLong();
            System.out.println("Введите номер счета (long)\n");
            long bankAccount = in.nextLong();

            customers[i] = new Customer(id, srname, name, patronymic, address, card, bankAccount);
        }


        System.out.println("--------------");
        System.out.println("Ввыод закончен");
        System.out.println("--------------");
    }

    public void sortBuyers() {


        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < customers.length - i - 1; j++) {
                if (customers[j].getSrname().compareTo(customers[j + 1].getSrname()) > 0) {
                    Customer temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;


                }

            }


        }


    }

    public void getCard(long min, long max) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCard() > min && customers[i].getCard() < max) {
                System.out.println(customers[i].toString());
            }
        }


    }

}
