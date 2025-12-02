
/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (20251126)
 */
public class Book
{
    private String title;
    private String author;
    private String bookuniqueNumber;
    
    
    public Book(String title, String author, String bookuniqueNumber){
        this.title = title;
        this.author = author;
        this.bookuniqueNumber = bookuniqueNumber;
    }
    
    public String gettitle(){
        // title 리턴하기
        return title;
    }
    
    public String getauthor(){
        // author 리턴하기
        return author;
    }
    
    public String getbookUniqueNumber(){
        // bookuniqueNumber 리턴하기
        return bookuniqueNumber;
    }
    
    public String displayBook(){
        return "책 이름 : " + title + " 저자 : " + author + " 책 고유번호 : " + bookuniqueNumber;
    }
}