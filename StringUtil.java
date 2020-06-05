import java.util.Scanner;
public class StringUtil{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        String a=s.nextLine(); 

        //StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
        StringBuilder str=new StringBuilder(a);
        for(int i=0;i<str.length();i++){
            //charAt() 用于返回指定索引处的字符
            if(str.charAt(i)==' '){
                System.out.println(i);
                //deleteCharAt() 用于删除该处的字符
                str.deleteCharAt(i);
                i--;
            }else {
                str.charAt(i);
            }
        }
        //toSting()将当前对象以字符串的形式返回
        System.out.println(str.toString());
    }
}