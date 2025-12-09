
/**
 * Book 객체를 생성 및 관리하는 클래스입니다.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class Borrower
{
    private String name;
    private String borrowerUniqueNumber;
    private String email;
    private int loanCount;
    
    public Borrower(String name, String borrowerUniqueNumber, String email){
        this.name = name;
        this.borrowerUniqueNumber = borrowerUniqueNumber;
        this.email = email;
        this.loanCount = 0;
    }
    
    public Borrower(String name, String borrowerUniqueNumber, String email, int loanCount){
        this.name = name;
        this.borrowerUniqueNumber = borrowerUniqueNumber;
        this.email = email;
        this.loanCount = loanCount;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBorrowerUniqueNumber(){
        return borrowerUniqueNumber;
    }
    
    public String getEmail(){
        return email;
    }
    public int getloanCount(){
        return loanCount;
    }
    public void increaseLoanCount(){
        this.loanCount++;
    }
    public void decreaseLoanCount(){
        if(this.loanCount > 0){
            this.loanCount--;
        }
    }
    public String displayBorrower(){
        return "이용자 이름 : " + name + " 이용자 고유번호 : " + borrowerUniqueNumber + " 이메일 주소 : " + email;
    }
}