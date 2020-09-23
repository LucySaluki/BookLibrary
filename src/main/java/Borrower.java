import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name=name;
        this.collection = new ArrayList<>();
    }

    public int booksBorrowedCount() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library){
        Book bookBorrowed = library.books.get(0);
        library.removeBookFromLibrary(bookBorrowed);
        this.addBookToCollection(bookBorrowed);
    }
}
