package homeworkClasses;

public class Book {
    private String title;
    private final Author author1;
    private int publicationYear;
    public Book(String title, Author author1, int publicationYear) {
        this.title = title;
        this.author1 = author1;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor1() {
        return this.author1;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setAge(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
