class fibo_func_Rec{
    public static void main(String args[]){
        int n=4;
        System.out.println(f(n));
    }
    public static int f(int i){
        if(i<=1){
            return i;
        }
        int first=f(i-2);
        int last=f(i-1);
        return first+last;
    }
}