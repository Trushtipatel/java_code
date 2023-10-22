import java.util.*;
public class gst{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float s=sc.nextFloat();
        float e=sc.nextFloat();
        float t=p+s+e;

        System.out.println("total=" + t);

        float mt=t + (t * 0.18f);
         System.out.println("main total=" + mt);

        }

}