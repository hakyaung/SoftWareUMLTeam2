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
        this.uniqueNumberSet = new TreeSet<String>();
        this.bookDB = new HashMap<String, Book>();
    }
    
    public Book getOneBook(){
        
    }
    
    public Book getOneBook(String bookUniqueNumber){
        
    }
    
    public boolean findBook(String bookUniqueNumber){
        
    }
    
    public void registerToBookDB(Book book){
        
    }
    
    public boolean checkBookLoanAvility(Borrower borrower){
        
    }
}