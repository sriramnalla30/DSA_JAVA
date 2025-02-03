public class _01_recursion{
    public static void main(String args[]){
        int num=4;
        rec(num);
    }
    public static void rec(int num){
        if(num<=0){
            return ;
        }
        System.out.println(num);
        num--;
        rec(num);
    }
}