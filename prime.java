import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                System.out.print("not prime num");
                break;
            }
            else{
                System.out.print("prime num");
                break;
            }
        }
    }
}