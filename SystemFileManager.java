import java.util.*;
import java.io.*;
/**
 * SystemFileManager 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class SystemFileManager
{
    private BorrowerCollection borrowerdb;
    private BookCollection bookdb;
    private LoanCollection loandb;
    
    public SystemFileManager(){
        this.borrowerdb = new BorrowerCollection();
        this.bookdb = new BookCollection();
        this.loandb = new LoanCollection();
    }
    
    public String startupFileRead(String borrowerFileSrc, String bookFileSrc, String loanFileSrc){
        String str = "";
        
        try{
            FileReader borrowerSrc = new FileReader(borrowerFileSrc);
            FileReader bookSrc = new FileReader(bookFileSrc);
            FileReader loanSrc = new FileReader(loanFileSrc);
            Scanner borrowerScanner = new Scanner(borrowerSrc);
            Scanner bookScanner = new Scanner(bookSrc);
            Scanner loanScanner = new Scanner(loanSrc);
            
            while(borrowerScanner.hasNext()){
                str = borrowerScanner.nextLine();
                StringTokenizer stz = new StringTokenizer(str, "/");
                String name = stz.nextToken();
                String borrowerUniqueNumber = stz.nextToken();
                String email = stz.nextToken();
                int loanCount = Integer.valueOf(stz.nextToken());
                Borrower borrower = new Borrower(name, borrowerUniqueNumber, email, loanCount);
                borrowerdb.registerToBorrowerDB(borrower);
                System.out.println(borrower.displayBorrower());
            }
            
            while(bookScanner.hasNext()){
                str = bookScanner.nextLine();
                StringTokenizer stz = new StringTokenizer(str, "/");
                String title = stz.nextToken();
                String author = stz.nextToken();
                String bookUniqueNumber = stz.nextToken();
                Book book = new Book(title, author, bookUniqueNumber);
                bookdb.registerToBookDB(book);
                System.out.println(book.displayBook());
            }
            
            while(loanScanner.hasNext()){
                str = loanScanner.nextLine();
                StringTokenizer stz = new StringTokenizer(str, "/");
                String borrowerUniqueNumber = stz.nextToken();
                String bookUniqueNumber = stz.nextToken();
                Borrower borrower = borrowerdb.getOneBorrower(borrowerUniqueNumber);
                Book book = bookdb.getOneBook(bookUniqueNumber);
                Loan loan = new Loan(borrower, book);
                System.out.println(loandb.registerToLoan(loan));
            }
            
            borrowerSrc.close();
            bookSrc.close();
            loanSrc.close();
            borrowerScanner.close();
            bookScanner.close();
            loanScanner.close();
        }catch(IOException e){
            return "파일 경로가 올바르지 않습니다.";
        }
        return "파일 읽기 성공";
    }
}