package publication;

public class Book extends Publication{
    private String ISBN;
    private String edition;
    private String author;

    //Getters
    public String getISBN() {
        return ISBN;
    }
    public String getEdition() {
        return edition;
    }
    public String getAuthor() {
        return author;
    }

    //Setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
