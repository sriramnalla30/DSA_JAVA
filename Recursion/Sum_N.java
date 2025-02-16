class Sum_N{
    public static void main(String args[]){
        int n=3;
        int sum=0;
        f(3,sum);
    }
    public static void f(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        f(n-1,sum+n);
    }
}