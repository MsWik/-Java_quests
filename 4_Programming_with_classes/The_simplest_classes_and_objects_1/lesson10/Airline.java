package by.peleng.jav.lesson10;

import java.util.Date;

/*10 Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/
public class Airline {
    private String destination;
    private String flightNumber;
    private String aircraftType;
    private Date departureTime;
    private String aircraftdaysWeek;

    public Airline(String destination, String flightNumber, String aircraftType, Date departureTime, String aircraftdaysWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.aircraftdaysWeek = aircraftdaysWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", aircraftdaysWeek='" + aircraftdaysWeek + '\'' +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getAircraftdaysWeek() {
        return aircraftdaysWeek;
    }

    public void setAircraftdaysWeek(String aircraftdaysWeek) {
        this.aircraftdaysWeek = aircraftdaysWeek;
    }
}
