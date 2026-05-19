class Main{
    static int binary_search(int[] arr,int target){
        int min=0;
        int max=arr.length-1;
        
        // arr[mid]=target;
        while(min<=max){
            int mid=(min+max)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        
        int result=binary_search( arr , 5);
        System.out.println(result);
    }
}
