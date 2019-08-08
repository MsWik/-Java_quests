package by.peleng.jav.lesson7;

import static by.peleng.jav.lesson7.Point.getDistance;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/
public class Triangle {
     Point pointA;
     Point pointB;
     Point pointC;


    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA=pointA;
        this.pointB=pointB;
        this.pointC=pointC;


    }


    public double getPerimeter() {
        return getDistance(pointB,pointA) +getDistance(pointC,pointB) + getDistance(pointA,pointC);

    }

    public double getSquare() {
        double p = getPerimeter() / 2;

        return Math.sqrt(p * (p - getDistance(pointB,pointA)) *
                (p -getDistance(pointC,pointB)) *
                (p - getDistance(pointA,pointC)));


    }

    public Point getMedian(){


        return new Point((pointA.getX()+pointB.getX()+pointC.getX())/3,
                (pointA.getY()+pointB.getY()+pointC.getY())/3) ;
    }
    public void getStrings(){
System.out.println(pointA.getX() + " " + pointA.getY());
        System.out.println(pointB.getX() + " " + pointB.getY());
        System.out.println(pointC.getX() + " " + pointC.getY());

    }




}
class Point{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    
    public static double getDistance(Point pointX, Point pointY){

        return Math.sqrt((pointX.getX()-pointY.getX())*(pointX.getX()-pointY.getX())+
                (pointX.getY()-pointY.getY())* (pointX.getY()-pointY.getY()));
    }





}
