//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=(a%3);
        int c=(a%5);
        int d=b+c;
        if(d==0)
        System.out.println("FizzBuzz");
        else if(b==0)
        System.out.println("Fizz");
        else if(c==0)
        System.out.println("Buzz");
        else
        System.out.println(a);
    }
}


//{ Driver Code Starts.
// } Driver Code Ends
