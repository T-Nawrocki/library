import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("The Shepherd's Crown", "Terry Pratchett", "fantasy");
    }

    @Test
    public void hasBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

}
