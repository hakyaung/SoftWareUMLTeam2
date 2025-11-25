
/**
 * book 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Book
{
    private String title;
    private String author;
    private String uniqueNumber;
    private boolean bookLoanStatus;
    
    public Book(String title, String author, String nuiqueNumber){
        this.title = title;
        this.author = author;
        this.uniqueNumber = uniqueNumber;
        this.bookLoanStatus = false;
    }
    
    public boolean checkBookLoanAvility(Book book){
        
    }
    
    public String toString(){
        return "책 이름 : " + title + " 저자 : " + author + " uniqueNumber : " + uniqueNumber + " 대출 상태 : " + bookLoanStatus;
    }
}