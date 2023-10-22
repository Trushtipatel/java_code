import java.util.*;
public class incomeTax{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int income =sc.nextInt();
        int tax;
        
        if(income<=500000){
            tax=0;
            
        }
        else if(income>500000 && income<1000000){
            tax=(int) (income*0.20);
            
        }else {
            tax= (int) (income*0.35);
            
        }
    System.out.println("tax=" + tax);
    }
}