import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        book = new Book("We Are Anonymous", "P. Olsen", "Non-fiction");
        borrower= new Borrower("Sonny");
        library = new Library(3);
        library.addBook(book);
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.booksBorrowedCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBookToCollection(book);
        assertEquals(1,borrower.booksBorrowedCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBook(library);
    }
}
