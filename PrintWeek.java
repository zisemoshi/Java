import java.util.Scanner;
public class PrintWeek{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int sum =s.nextInt();
        switch(sum){
            case 1: System.out.println("今天是星期一");break;
            case 2: System.out.println("今天是星期二");break;
            case 3: System.out.println("今天是星期三");break;
            case 4: System.out.println("今天是星期四");break;
            case 5: System.out.println("今天是星期五");break;
            case 6: System.out.println("今天是星期六");break;
            case 7: System.out.println("今天是星期日");break;
            default :System.out.println("错误");break;
        }
    }
}