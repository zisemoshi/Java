import java.util.Scanner;
public class ContrastString{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        String a =s.nextLine();
        String b =s.nextLine();
        int sum=0;
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==b.charAt(i))
                    continue;
                else{
                    System.out.println("不同");
                    sum=1;
                    break;
                }      
            }
        }else{
                    System.out.println("不同");
                    sum=1;
                }   
        if(sum==0)
            System.out.println("相同");
           
    }
}