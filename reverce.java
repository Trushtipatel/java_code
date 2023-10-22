public class reverce{
    public static void main(String args[]){
        int num=109345;
       
        while(num>0){
            int r=num%10;
            num=num/10;
            System.out.print(r);
        }
    }
}