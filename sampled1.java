import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
       
        int a ,b,c;
        a=11;
        b=20;
        c=56;
      // Scanner s=new Scanner(System.in);
    //    System.out.println("enter the number A:");
        //int a=s.nextInt();
        //odd or even
       /* a/=2;
        if(a==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
        //add two number
        System.out.println("enter the number B:");
         b=s.nextInt();
         c=a+b;
         System.out.println("add the number:"+c);
         // int lcm =(a*b)/gcd(a,b);
          
        //  System.out.println("lcm"+lcm);
        for(int i=1;i*i<=a;i++) 
        {
            if((a%i)==0)
        System.out.println(i);
        }*/
        int n = 50; // Print prime numbers up to 50
        
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;//2
            
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
