import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    private Book b;

    @Test
    public void testGetAuthor() {
        b = new Book();
        assertEquals("steve", b.getAuthor());
    }
}
