package by.peleng.java.lesson5.lesson5.DAO;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class FlowerDAO implements FlowerDAOint {


    @Override
    public boolean savebouquet(List<Object> obg) {
        Writer writer = null;

        try {


            String str="";
            for (int count = 0; count < obg.size(); count++) {
                str = str + obg.get(count).toString() + "\n";

            }

            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("flower1.txt", false), "utf-8"));
            writer.write(str);
            System.out.println(str);
            writer.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        }

        return true;
    }


    @Override
    public List<Object> returnbouquet() {


        return null;
    }

    @Override
    public boolean retirntext() {
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("flower1.txt"));
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
