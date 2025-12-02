
/**
 * 이용자 클래스의 설명을 작성하세요.
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
    
    public String getborrowerUniqueNumber(){
        return borrowerUniqueNumber;
    }
    
    public String getEmail(){
        return email;
    }
    public int loanCount(){
        return loanCount;
    }
    public String displayBorrower(){
        return "이용자 이름 : " + name + " 이용자 고유번호 : " + borrowerUniqueNumber + " 집주소 : " + email;
    }
}