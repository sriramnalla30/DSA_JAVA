class LinearSearch{
    public static void main(String args[]){
        int nums[]={1,3,5,6,7,11};
        int target=7;
        int result=linearsearch(nums,target);
        if(result==-1){
            System.out.println("not found");
        }else{
            System.out.println("Number found at : "+result);
        }
    }
    public static int linearsearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){return i;}
        }
        return -1;
    }
}
//linear Search time complexity  best = o(1) worst=o(n)  avg=o(n) ------------space complexity o(n)