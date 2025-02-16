import java.util.*;
class swap_func_Rec{
    public static void main(String args[]){
        int []arr={5,4,3,2,1};
        int n=arr.length;
        f(0,n,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void f(int i,int n,int[] arr) {
        if(i>=n/2){
            return ;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        f(i+1,n,arr);
    }
}