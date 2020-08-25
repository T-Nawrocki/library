import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

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

    public boolean isBookInLibrary(Book book) {
        return books.contains(book);
    }

    public HashMap<String, Integer> getGenreList() {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (Book book : books) {
            String genre = book.getGenre();
            result.putIfAbsent(genre, 0);
            result.put(genre, result.get(genre) + 1);
        }
        return result;
    }
}
