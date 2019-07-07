package by.peleng.jav.lesson2_04;

/*4 Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/
public class Customer {
    private Invoice[] invoices;
    private String name;
    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toStrings(){
            System.out.println(name);

        for (int i=0;i<invoices.length;i++){
            System.out.println("------------");
            System.out.println(invoices[i].toString());


        }
        System.out.println("------------");
        System.out.println("Все счета клиента");

    }

    public Customer(Invoice[] invoices, String name) {
        this.invoices = invoices;
        this.name = name;
    }
    public Customer() {
        this.invoices = invoices;
        this.name = name;
    }
    public void howMuchMoney() {
        float negative = 0;
        float positive = 0;
        float result = 0;
        for (int i = 0; i < invoices.length; i++) {
            if (!invoices[i].isLock()) {
                if (invoices[i].getMoney() < 0) {
                    negative += invoices[i].getMoney();
                } else {
                    positive += invoices[i].getMoney();
                }
                result += invoices[i].getMoney();

            }
        }
        System.out.println("\nУ клиента суммарный отрицательный баланс:  \n ");
        System.out.format("%.2f", negative);
        System.out.println("\nУ клиента суммарный положительный баланс:  \n ");
        System.out.format("%.2f", positive);
        System.out.println("\nУ клиента суммарный баланс:  \n ");
        System.out.format("%.2f", result);
    }

    public void howMuch() {

        float result = 0;
        for (int i = 0; i < invoices.length; i++) {

            result += invoices[i].getMoney();

        }
        System.out.println("У клиента суммарный баланс:  \n ");
        System.out.format("%.2f", result);
    }

    public void block(long number) {
        boolean result = false;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].getNnumber() == number) {
                invoices[i].setLock(true);
                System.out.println(" Счет номер : " + number + "Успешно заблокирован");
                result = true;
            }

        }
        if (result == false) {
  //         System.out.println("Счет № " + number + " не звблокирован, так как отсутствует ");
        }
    }
    public void unBlock(long number) {
        boolean result = false;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].getNnumber() == number) {
                invoices[i].setLock(false);
                System.out.println(" Счет номер : " + number + "Успешно разблокирован");
                result = true;
            }

        }
        if (result == false) {
     //       System.out.println("Счет № " + number + " не разблокирован, так как отсутствует ");
        }
    }

    public void sortForMoney() {
        for (int i = 0; i < invoices.length; i++) {
            for (int j = 0; j < invoices.length - i - 1; j++) {
                Invoice invoice = new Invoice();
                if (invoices[j].getMoney() < invoices[j].getMoney()) {
                    invoice = invoices[j];
                    invoices[j] = invoices[j + 1];
                    invoices[j + 1] = invoice;


                }

            }


        }

    }
    public void sortForLock() {
        for (int i = 0; i < invoices.length; i++) {
            for (int j = 0; j < invoices.length - i - 1; j++) {
                Invoice invoice = new Invoice();
                if (invoices[j].isLock() && !invoices[j+1].isLock()) {
                    invoice = invoices[j];
                    invoices[j] = invoices[j + 1];
                    invoices[j + 1] = invoice;


                }

            }


        }

    }

}
