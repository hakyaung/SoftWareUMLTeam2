import java.util.*;
/**
 * 이용자DB 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class BorrowerCollection
{
    private ArrayList<Borrower> borrowerDB;
    
    public BorrowerCollection(){
        this.borrowerDB = new ArrayList<Borrower>();
    }
    
    public void registerToBorrowerDB(Borrower borrower){
        // BorrowerCollection에 추가하기
    }
    
    public boolean findBorrower(String borrowerUniqueNumber){
        // borrowerUniqueNumber 로 Borrower 객체가 있는지 검사하기
    }
    
    public Borrower getOneBorrower(String borrowerUniqueNumber){
        // borrowerUniqueNumber를 이용해서 Borrower 객체 찾아 반환하기
    }
}