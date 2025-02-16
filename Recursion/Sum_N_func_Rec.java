class Sum_N_func_Rec{
    public static void main(String args[]){
        int n=3;
        System.out.println(f(3));
    }
    public static int f(int n){
        if(n==0){
            return 0;
        }
        return n+ f(n-1);
    }
}