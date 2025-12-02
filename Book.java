
/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class Book
{
    private String title;
    private String author;
    private String bookuniqueNumber;
    private boolean bookLoanStatus;
    
    public Book(String title, String author, String bookuniqueNumber, boolean bookLoanStatus){
        this.title = title;
        this.author = author;
        this.bookuniqueNumber = bookuniqueNumber;
        this.bookLoanStatus = bookLoanStatus;
    }
    
    public String gettitle(){
        
    }
    
    public String getauthor(){
        // author 리턴하기
    }
    
    public String getbookUniqueNumber(){
        // bookuniqueNumber 리턴하기
    }
    
    public void changeBookLoanStatus(boolean sw){
        // bookLoanStatus 값 변경하기
    }
    
    public boolean checkBookLoanAvility(Book book){
        // bookLoanStatus 값을 확인해서 해당 책 객체가 대출 가능한지 확인하기
    }
    
    public String toString(){
        
    }
    
}