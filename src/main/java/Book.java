import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.ToStringPlugin;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){return this.title;}

    @Override
    public boolean equals(Object object){
        return ((Book)object).getTitle().equalsIgnoreCase(this.getTitle());
    }

    }



