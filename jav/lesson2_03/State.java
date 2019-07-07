package by.peleng.jav.lesson2_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3 Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.*/
public class State {
    Region[] regions;
    City citySyperCapital;


    public City getCitySyperCapital() {
        return citySyperCapital;
    }
    public void getCitySyperToString() {
       citySyperCapital.toStrings();
    }

    public void setCitySyperCapital(City citySyperCapital) {
        this.citySyperCapital = citySyperCapital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public State(Region[] regions, City citySyperCapital) {
        this.regions = regions;
        this.citySyperCapital = citySyperCapital;
    }
    public State() {
        this.regions = regions;
        this.citySyperCapital = citySyperCapital;
    }
    public void generaState() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----------");
        System.out.println("--- Введите сталицу---");
        this.citySyperCapital=new City(reader.readLine());

        System.out.println("-----------");
        System.out.println("--- Введите число областей---");


        int region=Integer.parseInt(reader.readLine());
        regions = new Region[region];
        for (int i=0;i<region;i++){
            System.out.println("-----------");
            System.out.println("--- Введите сталицу региона № ---" + (i+1));
            String cityVapital=reader.readLine();
            regions[i]=new Region();
            regions[i].setCityСapital(new City(cityVapital));
            System.out.println("-----------");
            System.out.println("--- Введите число областей региона № ---" + (i+1));
            int district=Integer.parseInt(reader.readLine());
            District[] districts=new District[district];

            for (int j=0;j<district;j++){
                districts[j]=new District();
                System.out.println("-----------");
                System.out.println("--- Введите площадь области № ---" + (j+1) + " региона № " +(i+1));
                districts[j].setSquare(Long.parseLong(reader.readLine()));
                System.out.println("-----------");
                System.out.println("--- Введите число городов области № ---" + (j+1) + " региона № " +(i+1));
                System.out.println("-----------");
                int city=Integer.parseInt(reader.readLine());
                City[] citys = new City[city];
                for (int k=0;k<city;k++){
                    System.out.println("-----------");
                    System.out.println("--- Введите город № " +(k+1) + " области № ---" + (j+1)
                            + " региона № " +(i+1));
                    citys[k]=new City(reader.readLine());
                    System.out.println("-----------");

                }
                districts[j].setCity(citys);
            }
            this.regions[i].setDistricts(districts);

        }



    }

    protected void getRegion() {
        System.out.println("--- число областей---");
        System.out.println("-----------");
        System.out.println((regions.length));
        System.out.println("-------------");
    }

    protected void square() {
        System.out.println("--- площадь государтсва---");
        System.out.println("-----------");

        long square=0;
        for (int i=0; i<regions.length;i++)
        {
            square+=regions[i].squares();

        }
        System.out.println(square);
        System.out.println("-------------");
    }
    protected void citiRegion() {
        System.out.println("--- областные центры---");
        System.out.println("-----------");

       // String citiRegion = "";
        for (int i=0; i<regions.length;i++)
        {
            regions[i].getCityСapital().toStrings();

        }
     //   System.out.println(citiRegion);
        System.out.println("-------------");
    }


}