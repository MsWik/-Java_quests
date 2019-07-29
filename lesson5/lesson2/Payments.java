package by.peleng.java.lesson5.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Payments {
    int number;
    public int getNumber() {
        return number;
    }



    public void setNumber(int number) {
        this.number = number;
    }

    public Payments() {
        this.number = number;
    }


    public Payments(int number) {
        this.number = number;
    }


    public long getPriceAll (Payment payment){
        long price=0;
        for (int i=0;i<payment.list.size();i++){
            price+=payment.getList().get(i).getPrice();
        }

        return price;
    }

    public static class Payment

{
    List<Product> list = new ArrayList<Product>();

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Payment(List<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        String str="";
        for (int i=0;i<list.size();i++){
            str +=list.get(i).toString();
        }
        return str;
    }

    public Payment() {

    }


    public void generate(int number) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<number;i++){
            System.out.println("------------");
            System.out.println("Введите название товара № " + (i+1));
            String name =reader.readLine();
            System.out.println("------------");
            System.out.println("Введите цену товара № " + (i+1));
            long price = Long.parseLong(reader.readLine());
            System.out.println("------------");
            System.out.println("Введите описание товара № " + (i+1));
            String description = reader.readLine();

            list.add(i,new Product(name,description,price));

        }



    }





}

}
