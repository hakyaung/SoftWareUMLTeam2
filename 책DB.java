
/**
 * 책DB 클래스의 설명을 작성하세요.
 *
 * @author (정하경)
 * @version (20251103)
 */
public class 책DB
{
    private 대출일자;
    private 반납일자;
    private TreeSet<book> books = new TreeSet<book>();
    
    public 책DB(대출일자, 반납일자){
        
    }
    
    public book 책_객체_하나_가져오기(){
        
    }
    
    public int 가지고_있는_책_객체_개수_반환하기(){
        return books.size();
    }
}