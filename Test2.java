
/**
 * Test2 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Test2
{
    private String name;
    private String author;
    
    public Test2(String name, String author){
        this.name = name;
        this.author = author;
    }
    
    public String displayTest(){
        return "이름 : " + name + " 작가 : " + author;
    }
}