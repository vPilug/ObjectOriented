package OOP.library.catalog;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberOfPages=").append(numberOfPages);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}
