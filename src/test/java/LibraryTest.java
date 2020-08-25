import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Library tinyLibrary;
    private Book book;

    @Before
    public void before() {
        library = new Library(100);
        tinyLibrary = new Library(0);
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
        assertTrue(library.hasRemainingCapacity());
    }

    @Test
    public void canTellIfLibraryDoesNotHaveRemainingCapacity() {
        assertFalse(tinyLibrary.hasRemainingCapacity());
    }

    @Test
    public void willAddBookIfThereIsCapacity() {
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void willNotAddBookIfThereIsNoRemainingCapacity() {
        tinyLibrary.addBook(book);
        assertEquals(0, tinyLibrary.getNumberOfBooks());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canTellIfBookIsInLibrary() {
        library.addBook(book);
        assertTrue(library.isBookInLibrary(book));
    }

    @Test
    public void canTellIfBookIsNotInLibrary() {
        assertFalse(library.isBookInLibrary(book));
    }

}
