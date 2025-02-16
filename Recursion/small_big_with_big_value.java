class small_big_with_big_value{
    public static void main(String args[]){
        int i=4;
        f(i);
    }
    public static void f(int i){
    if(i<1){
        return;
    }
    f(i-1);
    System.out.println(i);
}
}