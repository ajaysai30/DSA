class Main{
    public static void main(String[] args){
        int sum=0;
        int num=5465;
        int temp=0;
        while(num>0){
            temp=num;
            sum+=temp%10;
            num/=10;
        }
        System.out.println(sum);
    }
}
