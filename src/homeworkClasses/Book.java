package homeworkClasses;

import java.util.Objects;

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
    @Override
    public String toString() {
        return "Название книги " +  this.title + ", автор книги " +  this.author1 +", год публикации книги " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author1, book.author1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author1);
    }
}
