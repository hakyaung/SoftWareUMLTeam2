import java.util.Treeset;
/**
 * 이용자를 등록하기위한 클래스.
 *
 * @author (유준석, 정하경)
 * @version (20251103)
 */
public class libraryapplication
{
    public static void main(String[] args){
        libraryapplication app = new libraryapplication();
        app.Display대출 가능한 책();
    }
    public void Display대출 가능한 책(){
        책DB bookDB = new 책DB();
        Boolean 검사결과 = true;
        Iteration<book> it = 
        book b_obj = bookDB.책_객체_하나_가져오기();
        검사결과 = book.책_객체가_대출_가능한지_검사(b_obj);
        if(검사결과 == true){
            book.Display_책_정보(b_boj);
        }
    }
}