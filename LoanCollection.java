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
    
    public Loan getOneLoan(int index){
        // loanDB에 있는 Loan 객체 반환하기 
        return loanDB.get(index);
    }
    
    public String registerToLoan(Loan loan){
        // loanDB에 요소 추가하기
        loanDB.add(loan);
        return loan + " 대출이 완료되었습니다.";
    }
    
    public Loan findLoan(Book book){
        // Book 객체를 가지고 Loan객체를 찾아 반환하기
        Iterator<Loan> it = loanDB.iterator();
        while(it.hasNext()){
            Loan lo = it.next();
            if(lo.getBook().equals(book)){
                return lo;
            }
        }
        return null;
    }
    
    public void removeLoan(Loan loan){
        // loanDB에 있는 요소 삭제하기
    }
    
    public boolean checkBookOnLoan(Book book){
        // book 객체가 대출 중인지 검사 후 결과값 반환하기
        Iterator<Loan> it = loanDB.iterator();
        while(it.hasNext()){
            Loan lo = it.next();
            if(lo.getBook().equals(book)){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkBorrowerOnLoan(Borrower borrower){
        // borrower 객체가 대출 중인지 검사 후 결과값 반환하기
        Iterator<Loan> it = loanDB.iterator();
        while(it.hasNext()){
            Loan lo = it.next();
            if(lo.getBorrower().equals(borrower)){
                return true;
            }
        }
        return false;
    }
    
    public int getLoanSize(){
        return loanDB.size();
    }
}