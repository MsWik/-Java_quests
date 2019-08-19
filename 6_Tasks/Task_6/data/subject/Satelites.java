package by.peleng.DAO.data.subject;

public class Satelites  extends Entity {
    private String name;
    private int radius;
    private int distance;
    private int planets_idPlanets;
    private int planets_galaxies_idgalaxies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public Satelites(String name, int radius, int distance, int planets_idPlanets, int planets_galaxies_idgalaxies) {
        this.name = name;
        this.radius = radius;
        this.distance = distance;
        this.planets_idPlanets = planets_idPlanets;
        this.planets_galaxies_idgalaxies = planets_galaxies_idgalaxies;
    }

    public Satelites(int id, String name, int radius, int distance, int planets_idPlanets, int planets_galaxies_idgalaxies) {
        super(id);
        this.name = name;
        this.radius = radius;
        this.distance = distance;
        this.planets_idPlanets = planets_idPlanets;
        this.planets_galaxies_idgalaxies = planets_galaxies_idgalaxies;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPlanets_idPlanets() {
        return planets_idPlanets;
    }

    public void setPlanets_idPlanets(int planets_idPlanets) {
        this.planets_idPlanets = planets_idPlanets;
    }

    public int getPlanets_galaxies_idgalaxies() {
        return planets_galaxies_idgalaxies;
    }

    public Satelites() {
    }

    @Override
    public String toString() {
        return "Satelites{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", distance=" + distance +
                ", planets_idPlanets=" + planets_idPlanets +
                ", planets_galaxies_idgalaxies=" + planets_galaxies_idgalaxies +
                ", id=" + id +
                '}';
    }

    public void setPlanets_galaxies_idgalaxies(int planets_galaxies_idgalaxies) {
        this.planets_galaxies_idgalaxies = planets_galaxies_idgalaxies;
    }
}
