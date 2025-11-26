import java.util.*;
/**
 * LoanCollection 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LoanCollection
{
    private LinkedList<Loan> loanDB;
    
    public LoanCollection(){
        this.loanDB = new LinkedList<Loan>();
    }
    
    public Loan getOneLoan(){
        // loanDB에 있는 Loan 객체 반환하기 
    }
    
    public void registerToLoan(Loan loan){
        // loanDB에 요소 추가하기
    }
    
    public Loan findLoan(Book book){
        // Book 객체를 가지고 Loan객체를 찾아 반환하기
    }
    
    public void removeLoan(Loan loan){
        // loanDB에 있는 요소 삭제하기
    }
}