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

    public boolean hasRemainingCapacity() {
        return getCapacity() > getNumberOfBooks();
    }

    public void addBook(Book book) {
        if (hasRemainingCapacity()) books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}
