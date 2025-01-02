class BinarySearch{
    public static void main(String args[]){
        int nums[]={1,3,5,6,7,11};
        int target=7;
        int result=Binarysearch(nums,target);
        if(result==-1){
            System.out.println("not found");
        }else{
            System.out.println("Number found at : "+result);
        }
    }
    public static int Binarysearch(int[] nums,int target){
    int left =0;
    int right=nums.length-1;
    int mid;
    while(left<=right) {
        mid =(left+right)/2;
        if(nums[mid]    ==target){
            return mid;
        }
        else if(nums[mid]<target){
            left=mid+1;

        }
        else right=mid-1;
        
    }
        return -1;
    }
}
//linear Search time complexity  best = o(1) worst=o(n)  avg=o(n) ------------space complexity o(n)