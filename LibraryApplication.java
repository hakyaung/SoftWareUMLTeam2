
/**
 * LibraryApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private BookCollection bookDB = new BookCollection();
    private BorrowerCollection borrowerDB = new BorrowerCollection();
    private LoanCollection loanDB = new LoanCollection();
    
    public void registerOneBook(String title, String author, String bookUniqueNumber){
        
    }
    
    public void registerBorrower(String name, String borrowerUniqueNumber, String address){
        
    }
    
    public void displayBooksForLoan(){
        
    }
    
    public void displayBooksOnLoan(){
        
    }
    
    public void loanOneBook(String bookUniqueNUmber, String borrowerUniqueNumber){
        
    }
    
    public void returnOneBook(String bookUniqueNumber){
        
    }
}