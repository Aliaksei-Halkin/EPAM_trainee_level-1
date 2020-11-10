package module.fourth.task9;

public class Book {
    private int id;
    private String title;
    private  String author;
    private String publishing;
    private int year;
    private int numberOfPages;
    private double cost;
    private String binding;

    public Book(int id, String title, String author, String publishing, int year, int numberOfPages, double cost, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages +
                ", cost=" + cost +
                ", binding='" + binding + '\'' +
                '}';
    }
}
