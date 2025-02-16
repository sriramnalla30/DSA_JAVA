import java.util.*;
class Subseq_func_Rec{
    public static void main(String args[]){
        int arr[]={3,1,2};
       // int m=Math.pow(2,n);
        List<Integer> ans=new ArrayList<>();
        f(0,ans,arr,arr.length);
    }
    public static void f(int i,List<Integer> ans, int[] arr,int n){
        if(i==n){
            for(int num:ans)
                System.out.print(num+" ");
            System.out.println();
            return;
        }
        ans.add(arr[i]);
        f(i+1,ans,arr,n);
        ans.remove(ans.size()-1);
        f(i+1,ans,arr,n);
    }
}