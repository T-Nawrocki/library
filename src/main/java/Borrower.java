import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getCollectionSize() {
        return collection.size();
    }

    public void borrow(Book book, Library library) {

    }
}
