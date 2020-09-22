import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before(){
        book1 = new Book("Becoming a Better Programmer", "P. Goodlife", "Non-fiction");
        library= new Library(3);
        book2 = new Book("We Are Anonymous", "P. Olsen", "Non-fiction");
        book3 = new Book("The Secret Commonwealth", "P. Pullman", "Sci-fi");
    }
    @Test
    public void libraryStartsOffWithNoBooks(){
        assertEquals(0,library.bookCount());
    }

    @Test
    public void countBooksInLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2,library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(true,library.checkLibraryHasCapacity());
    }

    @Test
    public void cantAddBookToLibraryAsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(false, library.checkLibraryHasCapacity());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBookFromLibrary(book1);
        assertEquals(1,library.bookCount());
    }
}
