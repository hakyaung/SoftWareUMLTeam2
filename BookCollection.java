import java.util.*;
/**
 * 책DB 클래스의 설명을 작성하세요.
 *
 * @author (정하경)
 * @version (20251103)
 */
public class BookCollection
{
    private TreeSet<String> uniqueNumberSet;
    private HashMap<String, Book> bookDB;
    
    public BookCollection(){
        this.uniqueNumberSet = new TreeSet<String>();
        this.bookDB = new HashMap<String, Book>();
    }
    
    public Book getOneBook(){
        
    }
}