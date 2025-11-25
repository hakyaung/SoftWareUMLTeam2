
/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Loan
{
    private Borrower borrower;
    private Book book;
    
    public Loan(Borrower borrower, Book book){
        this.borrower = borrower;
        this.book = book;
    }
    
    public String toString(){
        return borrower + "이/가 " + book + "을/를 대출 중";
    }
}