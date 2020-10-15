package PatronBook;

public class Book {
private String title;
private String author;

 public Book(String t, String a) {
        author = a;
        title = t;
    }
    public String getTitle() {
        
        return title;
    }

   

    public String toString() {

        return title + " by " + author;
    }

}
