package OOP.library.catalog;

public class ArtAlbum extends Book {
    private String paperQuality;

    public ArtAlbum(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "ArtAlbum{" +
                "paperQuality='" + paperQuality + '\'' +
                "} " + super.toString();
    }
}
