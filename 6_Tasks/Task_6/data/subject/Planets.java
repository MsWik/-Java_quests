package by.peleng.DAO.data.subject;

public class Planets extends Entity{
    private String name;
    private int coreTemperathure;
    private boolean athmosphere;
    private boolean life;
    private int radius;
    private int satellites;
    private int galaxies_id;

    public Planets(int id, String name, int coreTemperathure, boolean athmosphere, boolean life, int radius, int satellites, int galaxies_id) {
        super(id);
        this.name = name;
        this.coreTemperathure = coreTemperathure;
        this.athmosphere = athmosphere;
        this.life = life;
        this.radius = radius;
        this.satellites = satellites;
        this.galaxies_id = galaxies_id;
    }

    public Planets() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoreTemperathure() {
        return coreTemperathure;
    }

    public void setCoreTemperathure(int coreTemperathure) {
        this.coreTemperathure = coreTemperathure;
    }

    public boolean isAthmosphere() {
        return athmosphere;
    }

    public void setAthmosphere(boolean athmosphere) {
        this.athmosphere = athmosphere;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public int getGalaxies_id() {
        return galaxies_id;
    }

    public void setGalaxies_id(int galaxies_id) {
        this.galaxies_id = galaxies_id;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", coreTemperathure=" + coreTemperathure +
                ", athmosphere=" + athmosphere +
                ", life=" + life +
                ", radius=" + radius +
                ", satellites=" + satellites +
                ", galaxies_id=" + galaxies_id +
                ", id=" + id +
                '}';
    }
}
