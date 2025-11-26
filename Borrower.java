
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
    private int borrowerLoanStatus;
    private String adress;
    
    public Borrower(String name, String borrowerUniqueNumber, String adress, int borrowerLoanStatus){
        this.name = name;
        this.borrowerUniqueNumber = borrowerUniqueNumber;
        this.borrowerLoanStatus = borrowerLoanStatus;
        this.adress = adress;
    }
    
    public String getName(){
        // name 리턴하기
    }
    
    public String getborrowerUniqueNumber(){
        // borrowerUniqueNumber 리턴하기
    }
    
    public String getAdress(){
        // adress 리턴하기
    }
    
    public void changeBorrowerLoanStatus(int count){
        // 파라미터로 받은 값으로 borrowerLoanStatus 값 변경하기
    }
    
    public boolean checkBookLoanAvility(Borrower borrower){
        // borrowerLoanStatus 값으로 해당 이용자 객체가 대출 가능한지 검사하기
    }
    
    public int getBorrowerLoanStatus(){
        // borrowerLoanStatus 값 반환하기
    }
    
    public String toString(){
        
    }
}