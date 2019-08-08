package by.peleng.java.entity;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String location;
    private String grupnumber;

    @Override
    public String toString() {
        return  "id=" + id +'|'+
                ", name=" + name + '|' +
                ", surname=" + surname + '|' +
                ", age=" + age + '|' +
                ", location=" + location + '|' +
                ", grupnumber=" + grupnumber + '|'
                ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrupnumber() {
        return grupnumber;
    }

    public void setGrupnumber(String grupnumber) {
        this.grupnumber = grupnumber;
    }
}
