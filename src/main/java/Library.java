import java.util.ArrayList;

public class Library {
     ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books=new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (checkLibraryHasCapacity()) {
            this.books.add(book);
        }
    }

    public boolean checkLibraryHasCapacity(){
        if (this.bookCount()<this.capacity){
            return true;
        } else {
            return false;
        }
    }

    public Book removeBookFromLibrary(Book book){
        this.books.remove(book);
        return book;
    }

}
