import java.util.*;
/**
 * 나중에 제출 전에 지울 예정
 */
public class TestMain
{
    LibraryApplication la = new LibraryApplication();
    
    public static void main(String[] args){
        TestMain tm = new TestMain();
        
        tm.run();
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            printQuest();
            int selectNum = sc.nextInt();
            System.out.println("==========================================================");
            switch(selectNum){
                case 0:
                    System.out.println("종료합니다");
                    return;
                case 1:
                    System.out.println("책 등록하기 선택 ");
                    String title = sc.next();
                    String author = sc.next();
                    String bookUniqueNumber = sc.next();
                    la.registerOneBook(title, author, bookUniqueNumber);
                    break;
                case 2:
                    System.out.println("이용자 등록하기 선택");
                    String name = sc.next();
                    String borrowerUniqueNumber = sc.next();
                    String email = sc.next();
                    la.registerBorrower(name, borrowerUniqueNumber, email);
                    break;
                case 3:
                    System.out.println("대출 가능한 책을 Display 선택");
                    la.displayBooksForLoan();
                    break;
                case 4:
                    System.out.println("대출 중인 책을 Display 한다");
                    la.displayBooksOnLoan();
                    break;
                case 5:
                    System.out.println("책을 대출한다 선택");
                    String bookUni = sc.next();
                    String borrowerUni = sc.next();
                    la.loanOneBook(bookUni, borrowerUni);
                    break;
                case 6:
                    System.out.println("책을 반납한다 선택");
                    String bkUni = sc.next();
                    la.returnOneBook(bkUni);
                    break;
                case 7:
                    System.out.println("이용자 고유번호 찾기");
                    System.out.print("찾을 이용자 이름 : ");
                    String findName = sc.next();
                    la.getUniqueNumber(findName);
                    break;
                case 8:
                    System.out.println("데이터 불러오기 선택");
                    la.startupFileRead();
                    break;
                case 9:
                    System.out.println("데이터 저장하기 선택");
                    la.saveFileWrite();
                    break;
                default:
                    System.out.println("올바른 번호를 입력해주세요");
            }
        }
    }
    
    public void printQuest(){
        System.out.println("==========================================================");
        System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
        System.out.println("1. 책 등록하기");
        System.out.println("2. 이용자 등록하기");
        System.out.println("3. 대출 가능한 책을 Display한다");
        System.out.println("4. 대출 중인 책을 Display한다");
        System.out.println("5. 책을 대출한다");
        System.out.println("6. 책을 반납한다");
        System.out.println("7. 이용자 고유번호 찾기");
        System.out.println("8. 데이터 불러오기");
        System.out.println("9. 데이터 저장하기");  
        System.out.println("0. 종료하기");
        System.out.print("번호를 입력해주세요 : ");
    }
}