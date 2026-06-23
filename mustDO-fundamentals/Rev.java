class Main{
    public static void main(String[] args){
        int num=143;
        int rev=0;
        int temp=0;
        while(num>0){
            temp=num;
            rev=rev*10+temp%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
