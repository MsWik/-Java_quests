<<<<<<< HEAD
package by.peleng.DAO.data.subject;

public class Galahies extends Entity {
    private String name;
    private String planets;
    public Galahies() {
    }

    public Galahies(int id, String name, String planets) {
        super(id);
        this.name = name;
        this.planets = planets;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {


        this.name = name;
    }

    public String getPlanets() {
        return planets;
    }

    public void setPlanets(String planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "Galahies [" +
                "name='" + name + '\'' +
                ", planets='" + planets + '\'' +
                ", id=" + id +
                ']';
    }
=======
package by.peleng.DAO.data.subject;

public class Galahies extends Entity {
    private String name;
    private String planets;
    public Galahies() {
    }

    public Galahies(int id, String name, String planets) {
        super(id);
        this.name = name;
        this.planets = planets;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {


        this.name = name;
    }

    public String getPlanets() {
        return planets;
    }

    public void setPlanets(String planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "Galahies [" +
                "name='" + name + '\'' +
                ", planets='" + planets + '\'' +
                ", id=" + id +
                ']';
    }
>>>>>>> добавлена задача 6-6 на jdbc
}