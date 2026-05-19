class Main{
    public static void main(String[] args){
        int[] arr = {2,67,4,54,9,87};
        int result=linear_scearch(arr,67);
        System.out.println(result);
    }
    static int linear_scearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
         return -1;
    } 
}
