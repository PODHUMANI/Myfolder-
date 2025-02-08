import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Main{
     
 public static void fina(int a){
    // int[] fi=new int[100];
    int i=0,b,n=0;
     b = i;
     for( i=1;i<=a;i++)
        {
          for(int j=0;j<a;j++){
                 b=i+b;
                 int  fi[]={b};
                 i+=b;
                 n += fi[0];
                 }
          System.out.println("Sum of Fibonacci Series Numbers of First N Even Indexes: "+n);
          break;
         }
         }
public static void main(String[] args) {
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number :");
    a=s.nextInt();
     fina(a);  
    }
     
 }
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = s.nextInt();

        int a = 0, b = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sum += a;
            b += a;
            a = b - a;
        }

        System.out.println("Sum of Fibonacci numbers at even indexes: " + sum);
        s.close();
    }
}*/

