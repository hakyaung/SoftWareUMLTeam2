
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
    
    public String registerOneBook(String title, String author, String bookUniqueNumber){
        // 책을 등록한다
        Book book = new Book(title, author, bookUniqueNumber);
        bookDB.registerToBookDB(book);
        
        return "책 등록이 완료되었습니다.";
    }
    
    public String registerBorrower(String name, String borrowerUniqueNumber, String email){
        // 이용자를 등록한다
        Borrower borrower = new Borrower(name, borrowerUniqueNumber, email);
        borrowerDB.registerToBorrowerDB(borrower);
        
        return "이용자 등록이 완료되었습니다.";
    }
    
    public String displayBooksForLoan(){
        // 대출가능한 책을 Display 한다
    }
    
    public String displayBooksOnLoan(){
        // 대출 중인 책을 Display 한다
    }
    
    public String loanOneBook(String bookUniqueNUmber, String borrowerUniqueNumber){
        // 책을 대출한다
    }
    
    public String returnOneBook(String bookUniqueNumber){
        // 책을 반납한다
    }
}