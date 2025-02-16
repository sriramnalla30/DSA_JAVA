class Pal_func_Rec{
    public static void main(String args[]){
        String str="MADAM";
        System.out.println(f(0,str,str.length()));
    }
    public static boolean f(int i,String str,int n){
        if(i>=n/2){return true;}
        if(str.charAt(i)!=str.charAt(n-i-1)){return false;}
        return f(i+1,str,n);
    }
}