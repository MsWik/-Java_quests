package by.peleng.java.lesson2;
/*2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.*/
import java.util.Scanner;

public class Decomposition2 {

        static int nod(int first,int second){

            return second == 0 ? first : nod(second,first % second);

        }

        static long nok(int first,int second, int third, int fourth){
            return nod(first,nod(second, nod(third, fourth)));
        }

        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            System.out.println("задайте А:");


            while (!in.hasNextInt()) {
                System.out.print("Ввеедите корректно А:   ");
                in.next();
            }
            int sizeA = in.nextInt();

            System.out.println("задайте  С:");


            while (!in.hasNextInt()) {
                System.out.print("Ввеедите корректно С:   ");
                in.next();
            }



            int sizeB = in.nextInt();
            System.out.println("задайте  Д:");


            while (!in.hasNextInt()) {
                System.out.print("Ввеедите корректно Д:   ");
                in.next();
            }



            int sizeC = in.nextInt();
            System.out.println("задайте  В:");


            while (!in.hasNextInt()) {
                System.out.print("Ввеедите корректно В:   ");
                in.next();
            }



            int sizeD = in.nextInt();


            System.out.println("Наименьшее общее кратное "+  nok(sizeA, sizeB, sizeC, sizeD));
        }



    }

