package by.peleng.jav.lesson7;
/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/
public class Main {
    public static void main(String[] args) {
        Triangle triangle =  new Triangle(new Point(1.0,1.0),new Point(2,4),
                new Point(4,2) );
        Point point;
        point = triangle.getMedian();
        System.out.println("-----------");
        System.out.println("Периметр:");
        System.out.format("%.2f",triangle.getPerimeter());
        System.out.println("\nПлощадь:");
        System.out.format("%.2f",triangle.getSquare());
        System.out.println("\nТочка пересечения мидиан:");
        System.out.format("%.2f",point.getX());
        System.out.print("   :   ");

        System.out.format("%.2f",point.getY());
        System.out.print("   \n: \n");
        
        triangle.getStrings();

    }
}
