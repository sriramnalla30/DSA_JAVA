class BinarySearch{
    public static void main(String args[]){
        int nums[]={1,3,5,6,7,11};
        int target=7;
        int result=Binarysearch(nums,target);
        int result2=BinaryRec(nums,target,0,nums.length);
        if(result==-1){
            System.out.println("not found");
        }else{
            System.out.println("Number found at : "+result);
            System.out.println("Number found at : "+result2);
        }
    }
    public static int Binarysearch(int[] nums,int target){
    int left =0;
    int right=nums.length-1;
    int mid;
    while(left<=right) {
        mid =(left+right)/2;
        if(nums[mid] ==target){
            return mid;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }
        else right=mid-1;
    }
        return -1;
    }
    public static int BinaryRec(int[] nums,int target,int left,int right){
        if (left > right) {
            return -1; // Base case: target not found
        }
        int mid =(left+right)/2;
        if(nums[mid] ==target){
            return mid;
        }
        else if(nums[mid]<target){
           return BinaryRec(nums,target,mid+1,right);

        }
        else return BinaryRec(nums,target,left,mid-1);

    }
}
//Binary Search time complexity  best = o(1) worst=O(log n)  avg=O(log n) ------------space complexity o(1)