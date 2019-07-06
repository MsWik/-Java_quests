package by.peleng.jav.lesson1;

public class Main {
    public static void main(String[] args) {
      Test1 test1 = new Test1();
      test1.SetX(258);
      test1.SetY(147);
      int xx = test1.getX();
      int yy= test1.GetY();
      int sum= test1.getSum();
      int max =test1.getMax();
      System.out.println(test1.toSring());
        System.out.println(sum);

        System.out.println(max);


    }
}
