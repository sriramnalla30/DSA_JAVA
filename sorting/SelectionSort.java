class SelectionSort{
    public static void main(String args[]){
        int arr[]={2,4,6,5,3,1};
        int n=arr.length;
        int minIndex=-1;
        for(int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}