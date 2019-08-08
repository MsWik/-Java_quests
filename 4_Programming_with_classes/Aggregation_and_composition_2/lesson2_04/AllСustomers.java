package by.peleng.jav.lesson2_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*4 Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/
public class AllСustomers {
    Customer[] customers;

    public Customer[] getCustomers() {
        return customers;
    }

    public AllСustomers(Customer[] customers) {
        this.customers = customers;
    }
    public AllСustomers() {
        this.customers = customers;
    }
    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void genereteCustomers() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------");
        System.out.println("Число клиентов");
        int key=Integer.parseInt(reader.readLine());
        System.out.println("------------");
        customers = new Customer[key];
        for (int i=0;i<key;i++){
            customers[i]=new Customer();
            System.out.println("Введите имя клиента");
            String name=reader.readLine();
            customers[i].setName(name);
            System.out.println("------------");
            System.out.println("Введите число счетов клиента");
            int accounts=Integer.parseInt(reader.readLine());
            Invoice[] invoices = new Invoice[accounts];
            for (int j=0;j<accounts;j++){
                System.out.println("------------");
                System.out.println("Введите № счетов клиента " + (j+1));
                System.out.println("------------");
                long account=Long.parseLong(reader.readLine());
                System.out.println("------------");
                System.out.println("Введите сумму на счете клиента" + (j+1) + "   " + account);
                System.out.println("------------");
                float money=Float.parseFloat(reader.readLine());
                invoices[j]=new Invoice(money,false,account);

            }
            customers[i].setInvoices(invoices);



        }


    }




}
