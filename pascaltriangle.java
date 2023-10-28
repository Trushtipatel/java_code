import java.util.*;
public class pascaltriangle{
    public static void PasTri(int n)
     {
            for (int i = 0; i <= n; i++) {                    
                for (int j = 0; j<=i; j++) {
                System.out.print(" " + factorial(i) / (factorial( i - j) * factorial(j)) );
            }   

            System.out.println();
        }
    }
   public static int factorial(int i){
        if(i==0){
            return 1;
        }
        return i*factorial(i-1);
   }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PasTri(n);
     }
}
