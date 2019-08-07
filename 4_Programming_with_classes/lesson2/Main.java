package by.peleng.jav.lesson2;

public class Main {
    public static void main(String[] args) {
        Test2 test2 = new Test2(12,25);
        int x = test2.getX();
        int j=test2.getJ();
        System.out.println(x + "    "+ j);
        test2.setX(12);
        test2.setJ(85);
        test2=null;
        Test2 test3 = new Test2();
        x= test3.getX();
        j=test3.getJ();
        System.out.println(x + "    "+ j);


    }
}
