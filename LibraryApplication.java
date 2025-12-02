import java.util.*;
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
    SystemFileManager systemFileMg = new SystemFileManager();
    
    public String registerOneBook(String title, String author, String bookUniqueNumber){
        // 책을 등록한다
        Book book = new Book(title, author, bookUniqueNumber);
        bookDB.registerToBookDB(book);
        
        return "책 " + book + " 등록이 완료되었습니다.";
    }
    
    public String registerBorrower(String name, String borrowerUniqueNumber, String email){
        // 이용자를 등록한다
        Borrower borrower = new Borrower(name, borrowerUniqueNumber, email);
        borrowerDB.registerToBorrowerDB(borrower);
        
        return "이용자 " + borrower + " 등록이 완료되었습니다.";
    }
    
    public String displayBooksForLoan(){
        // 대출가능한 책을 Display 한다
        int index = bookDB.getBookSize();
        for(int i=0;i<index;i++){
            Book b = bookDB.getOneBook(i);
            if(loanDB.checkBookOnLoan(b) == false){
                System.out.println(b.displayBook());
            }
        }
        return "대출 가능한 책 Display 완료";
    }
    
    public String displayBooksOnLoan(){
        // 대출 중인 책을 Display 한다
        int size = loanDB.getLoanSize();
        for(int i=0;i<size;i++){
            Loan lo = loanDB.getOneLoan(i);
            Book book = lo.getBook();
            System.out.println(book.displayBook());
        }
        return "대출 중인 책 Display 완료";
    }
    
    public String loanOneBook(String bookUniqueNumber, String borrowerUniqueNumber){
        Book book = bookDB.getOneBook(bookUniqueNumber);
        Borrower borrower = borrowerDB.getOneBorrower(borrowerUniqueNumber);
        
        if (book == null) {
            return "오류: 책 고유번호 " + bookUniqueNumber + "에 해당하는 책을 찾을 수 없습니다.";
        }
        if (borrower == null) {
            return "오류: 이용자 고유번호 " + borrowerUniqueNumber + "에 해당하는 이용자를 찾을 수 없습니다.";
        }
        if (loanDB.checkBookOnLoan(book)) {
            return "오류: 책 " + book.gettitle() + "은 이미 대출 중입니다.";
        }
        if (borrower.loanCount() >= 5) { 
             return "오류: 이용자 " + borrower.getName() + "님은 대출 한도(5권)를 초과했습니다. (현재: " + borrower.loanCount() + "권)";
        }
        Loan loan = new Loan(borrower, book);
        loanDB.registerToLoan(loan);       
        borrower.increaseLoanCount();    
    
        return "SUCCESS: 책 " + book.gettitle() + "의 대출이 완료되었습니다. 대출자: " + borrower.getName();
    }
    
    public String returnOneBook(String bookUniqueNumber){
        // 책을 반납한다
        return "책 반납 완료";
    }
    

    public String getUniqueNumber(String name) {
        // 이용자 고유번호 찾기
        ArrayList<Borrower> foundBorrower = borrowerDB.getUniqueNumber(name);

        if (foundBorrower.isEmpty()) {
            return "'" + name + "' 해당 이름의 정보가 없습니다.";
        } else {
        Iterator<Borrower> it = foundBorrower.iterator();
        while (it.hasNext()) {
            Borrower borrowerInfo = it.next();
            System.out.println("---");
            System.out.println("이름: " + borrowerInfo.getName());
            System.out.println("고유 번호: " + borrowerInfo.getborrowerUniqueNumber());
            System.out.println("이메일 (주소): " + borrowerInfo.getEmail());
            System.out.println("---");
        }
        }
        return "이용자 출력 완료";
    }

    public String startupFileRead() {
        // 파일들을 불러 온 후 각 객체를 생성, DB에 저장한다
        systemFileMg.startupFileRead("DataBase\\Borrower.txt", "DataBase\\Book.txt", "DataBase\\Loan.txt");
        return "파일 읽기 완료";
    }

    public String saveFileWrite() {
        // DB에 있는 객체들을 파일에 저장한다
        return "파일 저장 완료";
    }

}