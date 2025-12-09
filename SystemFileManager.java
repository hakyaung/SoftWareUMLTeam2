import java.util.*;
import java.io.*;
/**
 * DataBase 폴더안에 Borrower, Book, Loan 텍스트(txt) 파일의 데이터 들을 불러오며,
 * 작업을 하며 생성된 BorrowerCollection, BookCollecion, LoanCollecion 들의 객체들을
 * 파일에 저장하는 역할을 합니다.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class SystemFileManager
{
    private BorrowerCollection borrowerdb;
    private BookCollection bookdb;
    private LoanCollection loandb;
    
    public SystemFileManager(BorrowerCollection borrowerdb, BookCollection bookdb, LoanCollection loandb){
        this.borrowerdb = borrowerdb;
        this.bookdb = bookdb;
        this.loandb = loandb;
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
                loandb.registerToLoan(loan);
                System.out.println(loan.displayLoan());
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
    
    public String saveFileWrite(String borrowerFileSrc, String bookFileSrc, String loanFileSrc){
        try{
            FileWriter borrowerWriter = new FileWriter(borrowerFileSrc);
            FileWriter bookWriter = new FileWriter(bookFileSrc);
            FileWriter loanWriter = new FileWriter(loanFileSrc);
            
            int borrowerSize = borrowerdb.getBorrowerSize();
            for(int i=0;i<borrowerSize;i++){
                Borrower b = borrowerdb.getOneBorrwer(i);
                borrowerWriter.write(b.getName()+"/"+b.getborrowerUniqueNumber()+"/"+b.getEmail()+"/"+b.getloanCount()+"\n");
            }
            
            int bookSize = bookdb.getBookSize();
            for(int i=0;i<bookSize;i++){
                Book book = bookdb.getOneBook(i);
                bookWriter.write(book.gettitle()+"/"+book.getauthor()+"/"+book.getbookUniqueNumber()+"\n");
            }
            
            int loanSize = loandb.getLoanSize();
            for(int i=0;i<loanSize;i++){
                Loan loan = loandb.getOneLoan(i);
                Borrower loanBor = loan.getBorrower();
                Book loanBok = loan.getBook();
                loanWriter.write(loanBor.getborrowerUniqueNumber()+"/"+loanBok.getbookUniqueNumber()+"\n");
            }
            
            borrowerWriter.close();
            bookWriter.close();
            loanWriter.close();
        }catch (IOException e){
            return "파일 경로가 올바르지 않습니다.";
        }
        return "파일 저장 성공";
    }
}