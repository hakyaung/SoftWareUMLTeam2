 


import java.util.*;

/**
 * 책 DB 역할을 하게 되는 클래스로써 Book 객체를 추가, 삭제 또는 검색을 하는 역할을 합니다.
 * TreeSet<String> 으로 책의 고유번호를 정렬하고 HashMap<String, Book> 으로 Key 값에는 책의 고유번호, Value 값에는
 * Book 객체를 넣어 책의 고유번호로 Book 객체를 찾을 수 있도록 합니다
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (2025.12.08)
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
        uniqueNumberSet.add(book.getbookUniqueNumber());
        bookDB.put(book.getbookUniqueNumber(), book);
    }
    
    public int getBookSize(){
        return uniqueNumberSet.size();
    }
    
    public Book getOneBook(int index) {
        if(index < 0 || index >= uniqueNumberSet.size()){
            return null;
        }
        int i = 0;
        for(String key : uniqueNumberSet) {
            if(i == index){
                return bookDB.get(key);
            }
            i++;
        }
        return null;
    }
    
    public Book getOneBook(String bookUniqueNumber){
        return bookDB.get(bookUniqueNumber);
    }
    
    public boolean findBook(String bookUniqueNumber){
        return bookDB.containsKey(bookUniqueNumber);
    }
    
}
