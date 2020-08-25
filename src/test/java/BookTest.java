import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("The Shepherd's Crown", "Terry Pratchett", "fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Shepherd's Crown", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Terry Pratchett", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("fantasy", book.getGenre());
    }

}
