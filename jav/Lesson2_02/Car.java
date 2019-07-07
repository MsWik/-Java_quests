package by.peleng.jav.Lesson2_02;

/*2 Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/
public class Car {
    private Engine engine;
    private Wheel[] wheel;
    private String title;

    public Car(String title) {
        this.engine = new Engine();
        wheel=new Wheel[4];
        for (int i=0;i<4;i++){
        wheel[i] = new Wheel();}
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void carGo() {
        engine.start();
        for (int i = 0; i < wheel.length; i++) {
            wheel[i].move(i);


        }


    }
    public void carStop(){
        engine.stop();
        for (int i = 0; i < wheel.length; i++) {
            wheel[i].stop(i);


        }

    }

    public void change(int i){
        carStop();
        wheel[i].change(i);
        carGo();

    }
   public void refueling(){
        carStop();
        System.out.println("Машина запралена");
        carGo();
   }
}




