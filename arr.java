import java.util.ArrayList;
import java.util.Scanner;

public class arr {
    
    public static void main(String[] args) {

    ArrayList <Integer>a=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter lower bound :");
       int lower=sc.nextInt();
       System.out.println("Enter upper bound :");
       int  upper=sc.nextInt();
       //int arr[]=new int[100];
       for(int i=lower;i<=upper;i++) {
        a.add(i);
         
       }System.out.println(a);
       for(int i=0;i<a.size();i++){
        int num=a.get(i);
        int rem=0;
        int rev=0;
        int v=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
            if(rev==v)
               a.remove(i);
           
        }
       }System.out.println(a);
       sc.close();
       }
    }

