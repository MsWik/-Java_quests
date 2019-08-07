package by.peleng.jav.lesson5;

import java.util.Random;

/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
*/
public class Сounters {
    private int counter;
    private int MAX_VALUE;
    private int MIN_VALYE;


     Сounters()
        {
        counter=0;
        MAX_VALUE=10;
        MIN_VALYE=0;

    }
    Сounters(int counter, int MAX, int MIN){
        this.counter=counter;
         this.MIN_VALYE=MIN;
        this.MAX_VALUE = MAX;
    }

    public int getCounter() {
        return counter;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    public int getMIN_VALYE() {
        return MIN_VALYE;
    }

    public void maxCounter() {
        if (counter<MAX_VALUE){
            this.counter++;
        } else {this.counter=MIN_VALYE;
       System.out.println("Счетчик достиг максимального нзачения. ");}

    }
    public void minCounter() {
         if (counter>MIN_VALYE){
             this.counter--;} else {this.counter=MIN_VALYE;
             System.out.println("Счетчик достиг минимального значения нзачения. ");}

    }
   final public void setMAX_VALUE(int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }

   final public void setMIN_VALYE(int MIN_VALYE) {
        this.MIN_VALYE = MIN_VALYE;
    }

    public void randomCounter(){
         Random random = new Random();
         this.counter = random.nextInt(10);

    }



}
