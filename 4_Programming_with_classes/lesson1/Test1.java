package by.peleng.jav.lesson1;

public class Test1 {
 private int x =23;
 private int y=46;
 public void SetX(int x){
     this.x=x;
 }
    public void SetY(int y){
        this.y=y;
    }
public int getX(){
     return x;
}
public int GetY(){
     return y;
}
public int getSum(){
     return x+y;

}
public int getMax(){
   if (x>y) {
       return x;
   }  else {return y;}

}

public String toSring() {

     return "x = " + x + ", y = " + y ;
    }
}

