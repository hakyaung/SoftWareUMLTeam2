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
            FileReader src = new FileReader(borrowerFileSrc);
            Scanner sc = new Scanner(src);
            while(sc.hasNext()){
                str = sc.nextLine();
                StringTokenizer stz = new StringTokenizer(str, "/");
                String name = stz.nextToken();
                String borrowerUniqueNumber = stz.nexToken();
                String email = stz.nextToken();
                int loanCount = Integer.valueOf(stz.nextToken());
                Borrower b = new Borrower(
            }
        }
    }
}

private String name;
    private String borrowerUniqueNumber;
    private String email;
    private int loanCount;