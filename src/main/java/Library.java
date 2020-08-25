import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean hasRemainingCapacity() {
        return getCapacity() > getNumberOfBooks();
    }
}
