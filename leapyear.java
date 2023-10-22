import java.util.*;
public class leapyear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%4==0 || i%400==0 || i%100==0){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year"+ i);
        }
    }
}