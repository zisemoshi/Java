public class JudgePrime{
    public static void main(String[] args){
        int [] ages={12,14,33,34,23};
        int i=1;

        //用age声明循环变量，ages是你要遍历的数组名。
        //age会从ages数组中的第一个元素遍历，每次的值则放在age中供你使用
        for(int age:ages){
            System.out.println("数组中第"+i+"个元素是"+age);
            i++;
        }
    }
}