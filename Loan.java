
/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class Loan
{
    private Borrower borrower;
    private Book book;
    
    public Loan(Borrower borrower, Book book){
        this.borrower = borrower;
        this.book = book;
    }
    
    public Borrower findBorrower(Loan loan){
        // 대출 객체를 이용해 Borrower 객체 찾아 반환하기
        return borrower;
    }
}