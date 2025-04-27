import org.apache.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class LibraryTest {
    //using CAPITAL for static variables is a good practice in Java
    private static final Book LORD_OF_THE_FLIES=new Book("Lord of the flies", "author flies");
    private static final Book LORD_OF_THE_RINGS=new Book("Lord of the rings", "author rings");
    private static final Book WAR_AND_PEACE=new Book("War and Peace", "author warandpeace");
    private static final Book HARRY_POTTER=new Book("Harry Potter", "author harry potter");

    //This object is called Class Under Test or Application Under Test, so in this test case we are testing this class and its methods.
    private final Library library = new Library();

    private Logger log = Logger.getLogger(Log.class.getName());

    @Before
    public void initialise(){
        PropertyConfigurator.configure("log4j.properties");
        library.add(LORD_OF_THE_FLIES);
        library.add(LORD_OF_THE_RINGS);
        library.add(WAR_AND_PEACE);
        library.add(HARRY_POTTER);

    }

    @Test
    public void searchReturnsTheSingleBookThatMatchesTheEntireTitle(){
        //step 1 basic test of making sure right number of books are returned
        //First let's test we can get right number of books by our search result,
        //then we will work on title matching
        List<Book> results = library.search("Lord of the flies");
        log.info("Size of the results List is : "+results.size());
        assertEquals("matching books",1, results.size());

        //afte 38:00
        //step 2 now we test if comparison is done properly or not
        //if Book class doesn't override equals() then this comparison will fail
        //
        Book book = results.get(0);
        log.info("Title of the searched book is: "+book.getTitle());
        assertEquals(LORD_OF_THE_FLIES,book);
        log.info("Number of books returned desired books and titles have matched !!");

        //after 55:00 step 3 make search function iterate through the list of the books
        // to find any given title as a search query
        assertEquals("Lord of the flies",book.getTitle());

    }
}
