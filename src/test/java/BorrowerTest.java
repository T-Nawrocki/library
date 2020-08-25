import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower("Tomek");
        book = new Book("The Shepherd's Crown", "Terry Pratchett", "fantasy");
        library = new Library(100);
        library.addBook(book);
    }

    @Test
    public void hasName() {
        assertEquals("Tomek", borrower.getName());
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.getCollectionSize());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addToCollection(book);
        assertEquals(1, borrower.getCollectionSize());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrow(book, library);
        assertEquals(1, borrower.getCollectionSize());
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void cannotBorrowBookIfBookNotInLibrary() {
        Library emptyLibrary = new Library(100);
        borrower.borrow(book, emptyLibrary);
        assertEquals(0, borrower.getCollectionSize());
    }

}
