import java.util.*;
/**
 * 이용자 DB 역할을 하게 되는 클래스로써 Borrower 객체를 추가, 삭제 또는 검색을 하는 역할을 합니다.
 * Borrower 객체는 정렬 필요성이 별로 없다고 판단되어 ArrayList<Borrower>를 이용하였습니다.
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
    
    public int getBorrowerSize(){
        return borrowerDB.size();
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
    
    public Borrower getOneBorrwer(int index){
        return borrowerDB.get(index);
    }
    
    public boolean findBorrowerByName(String name) {
        for (Borrower borrower : borrowerDB) {
            if (borrower.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Borrower> getUniqueNumber(String name) {
        ArrayList<Borrower> foundBorrowers = new ArrayList<>();
        for (Borrower borrower : borrowerDB) {
            if (borrower.getName().equals(name)) {
                foundBorrowers.add(borrower);
            }
        }
        return foundBorrowers;
    }
}
