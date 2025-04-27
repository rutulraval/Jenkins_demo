import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library    {
    private final List<Book> books= new ArrayList<>();
    public List<Book> search(String searchString){
        //return null; we wrote this line at the beginning of writing skeleton code,
        // but as we progress
        //we changed it to the below line which actually returns a list of Book objects,
        //although it returns a new book which is not exactly the same book object,
        // but we are
        // trying to develop slowly and eventually we will implement equals() method,
        // which will make sure we return exact same object meaningfully.
        //return Arrays.asList(new Book(searchString, "author rings")); // until this line was step 2

        //now step 3: we iterate through entire list of book to make our search function
        //more generic
        for(Book b:books){
            if(b.getTitle().equals(searchString)){
                return Arrays.asList(b);
            }
        }
        return null;
    }

    public void add(Book book){
        books.add(book);
    }

    public List<Book> borrow(String id){
        return null;
    }

    //

}
