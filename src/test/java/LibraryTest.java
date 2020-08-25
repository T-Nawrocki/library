import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("The Shepherd's Crown", "Terry Pratchett", "fantasy");
    }

    @Test
    public void hasBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void canTellIfLibraryHasRemainingCapacity() {
        assertEquals(true, library.hasRemainingCapacity());
    }

    @Test
    public void canTellIfLibraryDoesNotHaveRemainingCapacity() {
        Library tinyLibrary = new Library(0);
        assertEquals(false, tinyLibrary.hasRemainingCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

}
