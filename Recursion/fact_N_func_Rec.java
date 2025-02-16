class fact_N_func_Rec{
    public static void main(String args[]){
        int n=4;
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n<1){
            return 1;
        }
        return n*f(n-1);
    }
}