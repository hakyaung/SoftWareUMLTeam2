<<<<<<< HEAD
=======
import java.util.*;
/**
 * 책DB 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class BookCollection
{
    private TreeSet<String> uniqueNumberSet;
    private HashMap<String, Book> bookDB;
    public BookCollection(){
        uniqueNumberSet = new TreeSet<String>();
        bookDB = new HashMap<String, Book>();
    }
    
    public void registerToBookDB(Book book){
        bookDB.put(book.getbookUniqueNumber(), book);
        uniqueNumberSet.add(book.getbookUniqueNumber());
    }
    
    public int getBookSize(){
        return uniqueNumberSet.size();
    }
    
    public Book getOneBook(int index) {
        if(index < 0 || index >= uniqueNumberSet.size())
        return null;
        int i = 0;
        for(String key : uniqueNumberSet) {
            if(i == index) 
            return bookDB.get(key);
            i++;
        }
        return null;
    }
    
    public Book getOneBook(String bookUniqueNumber){
        return bookDB.get(bookUniqueNumber);
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
    }
    
    public boolean findBook(String bookUniqueNumber){
        return bookDB.containsKey(bookUniqueNumber);
>>>>>>> 9190b458199ecd942ed1b0bc6e4eb883f9ed61ee
    }
    
    public boolean findBook(String bookUniqueNumber){
        return bookDB.containsKey(bookUniqueNumber);
>>>>>>> 9190b458199ecd942ed1b0bc6e4eb883f9ed61ee
    }
    
    public boolean findBook(String bookUniqueNumber){
        return bookDB.containsKey(bookUniqueNumber);
    }
}
>>>>>>> 9190b458199ecd942ed1b0bc6e4eb883f9ed61ee
