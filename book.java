
/**
 * book 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class book
{
    public book(){
        
    }
    
    public boolean 책_객체가_대출_가능한지_검사(book b){
        Boolean 검사결과 = true;
        if(b가 대출 가능한지 검사하기){
            검사결과 = false;
        }else{
            검사결과 = true;
        }
        return 검사결과;
    }
    
    public void Display_책_정보(book b){
        System.out.println(b);
    }
}