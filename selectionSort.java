// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr={22,533,223,12,34,453,54};
        int minidx=-1;
        int temp=0;
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            minidx=i;
            for(int j=i+1;j<size;j++){
                if(arr[minidx]>arr[j]){
                    minidx=j;
                }
            }
        temp=arr[minidx];
        arr[minidx]=arr[i];
        arr[i]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
