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
        borrowerDB.add(borrower);
    }
    
    public boolean findBorrower(String borrowerUniqueNumber){
        // borrowerUniqueNumber 로 Borrower 객체가 있는지 검사하기
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            String uniNum = it.next().getborrowerUniqueNumber();
            if(borrowerUniqueNumber.equals(uniNum)){
                return true;
            }
        }
        return false;
    }
    
    public Borrower getOneBorrower(String borrowerUniqueNumber){
        // borrowerUniqueNumber를 이용해서 Borrower 객체 찾아 반환하기
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            Borrower br = it.next();
            if(borrowerUniqueNumber.equals(br.getborrowerUniqueNumber())){
                return br;
            }
        }
        return null;
    }
    
    public boolean findBorrowerByName(String name) {
        for (Borrower borrower : borrowerDB) {
            if (borrower.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public String getUniqueNumber(String name) {
        // 이름이 일치하는 사용자를 모두 저장할 리스트
        List<Borrower> foundBorrowers = new ArrayList<Borrower>(); 
        for (Borrower borrower : borrowerDB) {
            if (borrower.getName().equals(name)) {
                foundBorrowers.add(borrower);
            }
        }
    }
}