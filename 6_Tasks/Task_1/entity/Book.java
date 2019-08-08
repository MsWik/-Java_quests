package by.peleng.java.entity;

public class Book {
    private int id;
    private String name;
    private String author;
    private int yearOfPublishing;
    private String description;
    private boolean paper;


    public Book(int id, String name, String author, int yearOfPublishing, String description, Boolean paper) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.description = description;
        this.paper=paper;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "name=" + name + "|" +
                ", author=" + author + "|" +
                ", yearOfPublishing=" + yearOfPublishing + "|" +
                ", description=" + description + "|" +
                ", paper=" + paper + "|" + "\n"+
                ", id=" + id + "|" + "\n"
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPaper() {
        return paper;
    }

    public void setPaper(boolean paper) {
        this.paper = paper;
    }
}
