import java.util.Scanner; 
class print_name_n_times{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int n=6;
        f(i,n);
    }
    public static void f(int i,int n){
        if(i> n){
            return;
        }
        System.out.println(i);
        f(i+1,n);
    } 
}