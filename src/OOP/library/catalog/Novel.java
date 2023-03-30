package OOP.library.catalog;

public class Novel extends Book {
    private String type;

    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
