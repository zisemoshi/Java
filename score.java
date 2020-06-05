import java.util.Scanner;
public class score{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int score=s.nextInt();
        if(score>=60){
            if(score>=80)
                if(score>=90)
                    System.out.println("优秀");
                else
                    System.out.println("良好");
            else 
                System.out.println("及格");
        

        }
        else
            System.out.println("重考");
        
    }
}