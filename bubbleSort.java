class Main{
    public static void main(String[] args){
        int[] arr={1,32,245,56,775,334,76};
        int size=arr.length;
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sucessfully sorted ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
