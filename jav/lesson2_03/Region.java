package by.peleng.jav.lesson2_03;
/*3 Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.*/
public class Region {
District[] districts;
City cityСapital;

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public void setCityСapital(City cityСapital) {
        this.cityСapital = cityСapital;
    }

    public Region(){
        this.districts = districts;
        this.cityСapital = cityСapital;

    }

    public Region(District[] districts, City cityСapital) {
        this.districts = districts;
        this.cityСapital = cityСapital;
    }

    public City getCityСapital() {
        return cityСapital;
    }


    public long squares(){
        long squares=0;
        for (int i=0;i<districts.length;i++)

        {squares+=districts[i].getSquare();}
        return squares;
    }
}
