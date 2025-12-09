 


import java.util.*;
/**
 * Loan 객체들을 LinkedList<Loan>으로 링크를 연결하거나 링크를 끊는 역할을 주로 하고
 * LoanCollection 안에 Borrower, Book, Loan 객체를 찾는 역할을 하는 등 여러 역할도 하게 됩니다.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (2025.12.08)
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
        loanDB.remove(loan);
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
