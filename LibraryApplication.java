 


import java.util.*;
/**
 * 모든 Use Case들에 대응하는 메소드들을 가지고 있는 클래스입니다.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (2025.12.08)
 */
public class LibraryApplication
{
    private BookCollection bookDB = new BookCollection();
    private BorrowerCollection borrowerDB = new BorrowerCollection();
    private LoanCollection loanDB = new LoanCollection();
    SystemFileManager systemFileMg = new SystemFileManager(borrowerDB, bookDB, loanDB);
    
    public String registerOneBook(String title, String author, String bookUniqueNumber){
        if (bookDB.findBook(bookUniqueNumber)) {
            return "해당 책 고유번호 [" + bookUniqueNumber + "]는 이미 등록되어 있습니다.";
        }
        // 책을 등록한다
        Book book = new Book(title, author, bookUniqueNumber);
        bookDB.registerToBookDB(book);
        
        return "책 " + book.displayBook() + " 등록이 완료되었습니다.";
    }
    
    public String registerBorrower(String name, String borrowerUniqueNumber, String email){
        // 이용자객체를 찾는다.
        if(borrowerDB.findBorrower(borrowerUniqueNumber)){ 
            return "오류: 이용자 고유번호 [" + borrowerUniqueNumber + "]는 이미 등록되어 있습니다.";
        }
        // 이용자를 등록한다
        Borrower borrower = new Borrower(name, borrowerUniqueNumber, email);
        borrowerDB.registerToBorrowerDB(borrower);
        return "이용자 " + borrower.displayBorrower() + " 등록이 완료되었습니다.";
    }
    
    public String displayBooksForLoan(){
        // 대출가능한 책을 Display 한다
        int index = bookDB.getBookSize();
        String strSave = "";
        for(int i=0;i<index;i++){
            Book b = bookDB.getOneBook(i);
            if(loanDB.checkBookOnLoan(b) == false){
                strSave += b.displayBook() + "\n";
            }
        }
        return "--- 대출 가능한 책 Display ---\n" + strSave + "----------------------------------------\n";
    }
    
    public String displayBooksOnLoan(){
        // 대출 중인 책을 Display 한다
        int size = loanDB.getLoanSize();
        String strSave = "";
        for(int i=0;i<size;i++){
            Loan lo = loanDB.getOneLoan(i);
            Book book = lo.getBook();
            strSave += book.displayBook() + "\n";
        }
        return "--- 대출 중인 책 Display ---\n" + strSave + "----------------------------------------\n";
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
        if (borrower.getLoanCount() > 10) { 
             return "오류: 이용자 " + borrower.getName() + "님은 대출 한도(10권)를 초과했습니다. (현재: " + borrower.getLoanCount() + "권)";
        }
        Loan loan = new Loan(borrower, book);
        loanDB.registerToLoan(loan);       
        borrower.increaseLoanCount();    
        return "SUCCESS: 책 " + book.gettitle() + "의 대출이 완료되었습니다. 대출자: " + borrower.getName();
    }
    
    public String returnOneBook(String bookUniqueNumber){
        Book book = bookDB.getOneBook(bookUniqueNumber);
        
        if(book == null){
            return "오류 : 책 고유번호 [" + bookUniqueNumber + "]에 해당하는 책을 찾을 수 없습니다";
        }
        
        Loan loan = loanDB.findLoan(book);
        
        if(loan == null){
            return "오류: [" + book.gettitle() + "]은 현재 대출 중이 아닙니다";
        }
        
        Borrower borrower = loan.getBorrower();
        loanDB.removeLoan(loan);
        borrower.decreaseLoanCount();
        
        return "SUCCESS: 책 [" + book.gettitle() + "]의 반납이 완료되었습니다. 이용자: " + borrower.getName();
    }
    
    public String getUniqueNumber(String name) {
        // 이용자 고유번호 찾기
        ArrayList<Borrower> findBorrowerByName = borrowerDB.getUniqueNumber(name);
        String strSave = "";

        if (findBorrowerByName.isEmpty()) {
            return "'" + name + "' 해당 이름의 정보가 없습니다.";
        } else {
            Iterator<Borrower> it = findBorrowerByName.iterator();
            while (it.hasNext()) {
                Borrower borrowerInfo = it.next();
                
                strSave += "---\n" + "이름 : " + borrowerInfo.getName() 
                + "\n고유번호 : " + borrowerInfo.getBorrowerUniqueNumber() 
                + "\n이메일(주소): " + borrowerInfo.getEmail()+"\n \n";
            }
        }
        return strSave;
    }
    
    public String startupFileRead(){
        // 파일들을 불러 온 후 각 객체를 생성, DB에 저장한다

        String str = systemFileMg.startupFileRead("DataBase\\Borrower.txt", "DataBase\\Book.txt", "DataBase\\Loan.txt");

        return str;
    }

    public String saveFileWrite() {
        // DB에 있는 객체들을 파일에 저장한다
        String str = systemFileMg.saveFileWrite("DataBase\\Borrower.txt", "DataBase\\Book.txt", "DataBase\\Loan.txt");
        
        return str;
    }

}
