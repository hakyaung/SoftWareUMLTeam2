
/**
 * 이용자 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower
{
    private String name;
    private String uniqueNumber;
    private int borrowerLoanStatus;
    
    public Borrower(String name, String uniqueNumber){
        this.name = name;
        this.uniqueNumber = uniqueNumber;
        this.borrowerLoanStatus = 0;
    }
}