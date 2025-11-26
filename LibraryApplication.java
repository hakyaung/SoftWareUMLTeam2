
/**
 * LibraryApplication 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class LibraryApplication
{
    private BookCollection bookDB = new BookCollection();
    private BorrowerCollection borrowerDB = new BorrowerCollection();
    private LoanCollection loanDB = new LoanCollection();
    
    public void registerOneBook(String title, String author, String bookUniqueNumber){
        // 책을 등록한다
    }
    
    public void registerBorrower(String name, String borrowerUniqueNumber, String address){
        // 이용자를 등록한다
    }
    
    public void displayBooksForLoan(){
        // 대출가능한 책을 Display 한다
    }
    
    public void displayBooksOnLoan(){
        // 대출 중인 책을 Display 한다
    }
    
    public void loanOneBook(String bookUniqueNUmber, String borrowerUniqueNumber){
        // 책을 대출한다
    }
    
    public void returnOneBook(String bookUniqueNumber){
        // 책을 반납한다
    }
}