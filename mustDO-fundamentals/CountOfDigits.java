class Main{
    public static void main(String[] args){
        int digits=0;
        int num=134234;
        while(num>0){
            digits++;
            num/=10;
        }
        System.out.println(digits);
    }
}
