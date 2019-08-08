package by.peleng.jav.lesson9;
/*9 Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearPublishing;
    private int pages;
    private float proce;
    private String binding;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", pages=" + pages +
                ", proce=" + proce +
                ", binding='" + binding + '\'' +
                '}';
    }

    public Book(int id, String title, String author, String publisher, int yearPublishing, int pages, float proce, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublishing = yearPublishing;
        this.pages = pages;
        this.proce = proce;
        this.binding = binding;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getPages() {
        return pages;
    }

    public float getProce() {
        return proce;
    }

    public String getBinding() {
        return binding;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setProce(float proce) {
        this.proce = proce;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }
}
